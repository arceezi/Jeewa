/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserPakage;

/**
 *
 * @author Ralf
 */
public abstract class ActivityTemplate {
    protected Activity activity;
    
    public abstract ActivityBuilder BuildActivityName(String activityName);
    public abstract ActivityBuilder BuildActivityGrade(double grade);
    public abstract ActivityBuilder BuildActivityWeight(double weight);
    public abstract Activity BuildActivity();
}
