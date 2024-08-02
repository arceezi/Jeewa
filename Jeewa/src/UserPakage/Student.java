/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserPakage;

import java.util.ArrayList;

/**
 *
 * @author Ralf
 */
public class Student {
    private String studentID;
    private String name;
    private String password;
    private ArrayList<Subject> subjects = new ArrayList<>();

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }
    
    public void addSubject(Subject subject){
        subjects.add(subject);
        
    }
    
    
    
    
    
    
    
}
