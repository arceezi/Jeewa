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
public class SubjectBuilder extends SubjectTemplate{
    
    public SubjectBuilder(){
        this.subject = new Subject();
    }
    
    @Override
    public SubjectBuilder buildCourseID(String courseID) {
        subject.setCourseID(courseID);
        return this;
    }

    @Override
    public SubjectBuilder buildSubjectName(String subjectName) {
        subject.setName(subjectName);
        return this;
    }

    @Override
    public SubjectBuilder buildBatchNumber(String batchNumber) {
        subject.setBatchNumber(batchNumber);
        return this;
    }

    @Override
    public SubjectBuilder buildPassOrFail(boolean passOrFail) {
        subject.setPassOrFail(passOrFail);
        return this;
    }

    @Override
    public Subject buildSubject() {
        return subject;
    }
    
}
