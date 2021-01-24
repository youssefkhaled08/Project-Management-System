package project.management.system;

import com.toedter.calendar.JDateChooser;
import java.util.ArrayList;
import javax.swing.JTextField;
import project.management.system.Task.Status;

public class TeamLeader extends TeamMember{

    public TeamLeader(String email, String username, String password, String accountType) {
        super(email, username, password, accountType);
    }
    
    
    public static void addTask(ArrayList <Task> tasks, String taskName, String taskDeadline, Status taskStatus){
        tasks.add(new Task(String.valueOf(taskName), String.valueOf(taskDeadline),taskStatus));  
    }
    
}
