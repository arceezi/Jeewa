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
public abstract class StudentTemplate {
    protected Student student;
    
    public abstract StudentBuilder buildStudentUsername(String studentID);
    public abstract StudentBuilder buildStudentName(String studentName);
    public abstract StudentBuilder buildStudentPassword(String studentPassword);
    public abstract Student buildStudent();
}
