/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserHandler;
import MyApps.StudentPanel;
import UserPakage.Student;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
/**
 *
 * @author Ralf
 */
public class UserLoginHandler {
    
    private static UserLoginHandler loginHandler = null;
    public static Map<String,Student> activeUsers = new HashMap<>();
    
    
    
    
    public void loginUser(String studentUsername, Student student, boolean loginVerified){
        
        if (loginVerified){
        activeUsers.put(studentUsername, student);
        StudentPanel panel = new StudentPanel(student);
        panel.setVisible(true);
        }else{
           JOptionPane.showMessageDialog(null,"User does not exist");
        }    
    }
    
    public void logoutUser(String studentUsername){
        activeUsers.remove(studentUsername);
    }
    
    public static UserLoginHandler getInstance(){
        if(loginHandler == null)
            loginHandler = new UserLoginHandler();
        return loginHandler;
    }
            
}
