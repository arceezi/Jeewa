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
public class StudentCreator {
    
    public static void createStudent(StudentTemplate studentTemplate, String studentID, String studentName, String Password){
        studentTemplate.buildStudentID(studentID)
                       .buildStudentName(studentName)
                       .buildStudentPassword(Password)
                       .buildStudent();
    }
}
