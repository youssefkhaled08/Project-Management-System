package project.management.system;

import java.util.ArrayList;
import project.management.system.Task.*;

public class TeamMember {
    private String username;
    private String password;
    private ArrayList<Task> assignedTasks = new ArrayList<>();
    
    public TeamMember(String username, String password){
        this.username = username;
        this.password = password;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public void editTask(int index, String taskName, String taskDeadline, Status taskStatus){
        assignedTasks.get(index).setTaskName(taskName);
        assignedTasks.get(index).setTaskDeadline(taskDeadline);
        assignedTasks.get(index).setTaskStatus(taskStatus);
    }
    public void getAssignedTasks(){
        System.out.println("Tasks:- ");
        for (Task temp : assignedTasks){
            System.out.println("");
            System.out.println("Task Name: " + temp.getTaskName());
            System.out.println("Task Deadline: " + temp.getTaskDeadline());
            System.out.println("Task Status: " + temp.getTaskStatus());
            System.out.println("");
        }
    }
}
