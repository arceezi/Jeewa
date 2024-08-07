/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserPakage;

/**
 *
 * @author Ralf
 */
public class ActivityBuilder extends ActivityTemplate{
    
    public ActivityBuilder(){
        this.activity = new Activity();
    }

    @Override
    public ActivityBuilder BuildActivityName(String activityName) {
        activity.setActivityName(activityName);
        return this;
    }

    @Override
    public ActivityBuilder BuildActivityGrade(double grade) {
        activity.setGrade(grade);
        return this;
    }

    @Override
    public ActivityBuilder BuildActivityWeight(double weight) {
        activity.setWeight(weight);
        return this;
    }

    @Override
    public Activity BuildActivity() {
        return activity;
    }
}
