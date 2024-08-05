/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserHandler;

import UserPakage.Student;
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
    private Student student;
    
    public UserFileHandler getInstance(){
        if(fileHandler == null){
            fileHandler = new UserFileHandler();
        }
        
        return fileHandler;
    }
    
    public void sortStudentDBUsername(ArrayList<String> arrayList){
        
        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String username1 = o1.split(":")[0];
                String username2 = o2.split(":")[0];
                return username1.compareTo(username2); 
            }
        });  
    }
    
    public void recordUser(Student student){
        
        
        
        
    }
    
    public ArrayList<String> readDataFromFile(File file) {
        ArrayList<String> lines = new ArrayList<>();

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
    
    public void writeDataToFile(File file, ArrayList<String> list) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for(String line : list){
            writer.write(line);
            writer.newLine();
        } 
    }
     
}
