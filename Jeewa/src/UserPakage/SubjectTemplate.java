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
public abstract class SubjectTemplate {
    protected Subject subject;
    
    public abstract SubjectBuilder buildCourseID(String courseID);
    public abstract SubjectBuilder buildSubjectName(String subjectName);
    public abstract SubjectBuilder buildBatchNumber(String batchNumber);
    public abstract SubjectBuilder buildPassOrFail(boolean passOrFail);
    public abstract Subject buildSubject();
}
