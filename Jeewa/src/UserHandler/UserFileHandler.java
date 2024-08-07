/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserHandler;

import UserPakage.ActivityBuilder;
import UserPakage.ActivityCreator;
import UserPakage.Student;
import UserPakage.SubjectBuilder;
import UserPakage.SubjectCreator;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Ralf
 */
public class UserFileHandler {
    private static UserFileHandler fileHandler = null;
    private static final File studentDB = new File("src/UserHandler/StudentDB.txt");

    public static File getStudentDB() {
        return studentDB;
    }
    
    public static UserFileHandler getInstance(){
        if(fileHandler == null){
            fileHandler = new UserFileHandler();
        }
        
        return fileHandler;
    }
    
    public void sortStudentDBUsername(List<String> arrayList){
        
        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String username1 = o1.split(":")[0];
                String username2 = o2.split(":")[0];
                return username1.compareTo(username2); 
            }
        });  
    }
    
    public void recordStudent(Student student) throws IOException{
        List<String> lines = readDataFromFile(studentDB);
        lines.add(student.getStudentUsername() + ":" + student.getPassword());
        sortStudentDBUsername(lines);
        writeDataToFile(studentDB, lines);
        File studentData = new File("src/UserSubjectsDatabase/" + student.getStudentUsername() + ".txt");
        studentData.createNewFile();
    }
    
    public void saveStudentData(Student student) throws IOException{
        
        File studentData = new File("src/UserSubjectsDatabase/" + student.getStudentUsername() + ".txt");
        List<List<String>> dataHolder = new ArrayList<>();
        for (int i = 0; i < student.getSubjects().size(); i++) {
            List<String> dataRow = new ArrayList<>();
            dataRow.add(student.getSubjects().get(i).getCourseID());
            dataRow.add(student.getSubjects().get(i).getName());
            dataRow.add(student.getSubjects().get(i).getBatchNumber());
            dataRow.add(student.getSubjects().get(i).isPassOrFail() ? "1" : "0");
            for (int j = 0; j < student.getSubjects().get(i).getActivities().size(); j++) {
                dataRow.add(student.getSubjects().get(i).getActivities().get(j).getActivityName());
                dataRow.add(Double.toString(student.getSubjects().get(i).getActivities().get(j).getGrade()));
                dataRow.add(Double.toString(student.getSubjects().get(i).getActivities().get(j).getWeight()));
            }
            dataHolder.add(dataRow);
        }
        List<String> lines = new ArrayList<>();
        for (List<String> dataRow : dataHolder) {
            StringBuilder lineHolder = new StringBuilder();
            for (int k = 0; k < dataRow.size() - 1; k++) {
                lineHolder.append(dataRow.get(k)).append(":");
            }
            lineHolder.append(dataRow.get(dataRow.size() - 1));
            lines.add(lineHolder.toString());
        }
        lines.add(0, student.getStudentUsername());
        writeDataToFile(studentData, lines);
    }
    
    public void loadStudentData(Student student){
        
        File studentData = new File("src/UserSubjectsDatabase/" + student.getStudentUsername() + ".txt");
        List<String> lines = readDataFromFile(studentData);
        if (lines == null || lines.isEmpty()) {
            return;
        }
        for(int i = 1; i < lines.size(); i++){
            String line = lines.get(i);
            String [] lineParts = line.split(":");
            if(lineParts.length < 4){
                continue;
            }
            boolean passFail = lineParts[3].equals("1");
            student.addSubject(SubjectCreator.createSubject(new SubjectBuilder(), 
                                                            lineParts[0], 
                                                            lineParts[1], 
                                                            lineParts[2], 
                                                            passFail));
            for(int j = 4; j < lineParts.length; j+=3){
                if(lineParts.length < j+2){
                    break;
                }
                student.getSubjects().get(i-1).addActivity(ActivityCreator.createActivity(new ActivityBuilder(), 
                                                                                          lineParts[j], 
                                                                                          Double.parseDouble(lineParts[j+1]), 
                                                                                          Double.parseDouble(lineParts[j+2])));
            }
        } 
    }
    
    public List<String> readDataFromFile(File file) {
        List<String> lines = new ArrayList<>();

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    lines.add(line);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
    
    public void writeDataToFile(File file, List<String> list) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String line : list) {
                writer.write(line);
                writer.newLine();
            }
        }
    }
     
}
