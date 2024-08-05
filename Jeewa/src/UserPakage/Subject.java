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
public class Subject {
    private String courseID;
    private String name;
    private String batchNumber;
    private ArrayList<Activity> activities;
    private boolean passOrFail;

    public String getCourseID() {
        return courseID;
    }

    public String getName() {
        return name;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public ArrayList<Activity> getActivities() {
        return activities;
    }

    public boolean isPassOrFail() {
        return passOrFail;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public void setActivities(ArrayList<Activity> activities) {
        this.activities = activities;
    }
    
    public void addActivity(Activity activity){
        activities.add(activity);
        
    }

    public void setPassOrFail(boolean passOrFail) {
        this.passOrFail = passOrFail;
    }
    
    
    
    
}
