/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserHandler;

import UserPakage.Student;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ralffiga
 */
public class UserVerificationHandler {
  
    private File studentDB = new File("src/UserHandler/StudentDB.txt");
     
    public boolean verifyStudent(Student student) throws FileNotFoundException, IOException{
        boolean condition = false;
        
        BufferedReader reader = new BufferedReader(new FileReader(studentDB));
        String line;
        while((line = reader.readLine()) != null){
            String[] lineParts = line.split(":");
            if (lineParts[0].equals(student.getStudentUsername()) && lineParts[1].equals(student.getPassword())){
                condition = true;
                break;
            }
        }
       return condition;
    }
        
        

}
