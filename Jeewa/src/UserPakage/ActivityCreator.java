/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserPakage;

/**
 *
 * @author Ralf
 */
public class ActivityCreator {
    public static void createActivity(ActivityTemplate activityTemplate, String activityName, double grade, double weight){
        activityTemplate.BuildActivityName(activityName)
                        .BuildActivityGrade(grade)
                        .BuildActivityWeight(weight)
                        .BuildActivity();
    }
}
