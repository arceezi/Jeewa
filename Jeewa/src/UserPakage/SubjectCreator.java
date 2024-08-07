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
public class SubjectCreator {
    public static Subject createSubject(SubjectTemplate subjectTemplate, String courseID, String subjectName, String batchNumber, boolean passOrFail){
        return subjectTemplate.buildCourseID(courseID)
                              .buildSubjectName(subjectName)
                              .buildBatchNumber(batchNumber)
                              .buildPassOrFail(passOrFail)
                              .buildSubject(); 
    }
}

