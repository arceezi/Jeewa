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
public class StudentBuilder extends StudentTemplate {

    public StudentBuilder(){
        this.student = new Student();
    }
    
    @Override
    public StudentBuilder buildStudentID(String studentID) {
        student.setStudentID(studentID);
        return this;
    }

    @Override
    public StudentBuilder buildStudentName(String studentName) {
        student.setName(studentName);
        return this;
    }

    @Override
    public StudentBuilder buildStudentPassword(String studentPassword) {
        student.setPassword(studentPassword);
        return this;
    }

    @Override
    public Student buildStudent() {
        return student;
    }
    
}
