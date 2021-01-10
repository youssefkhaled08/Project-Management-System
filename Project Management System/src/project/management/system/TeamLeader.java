package project.management.system;

public class TeamLeader extends TeamMember{
    public TeamLeader(String username, String password){
        super(username, password);
    }
    public void addTask(String taskName, String taskDeadline, Task.Status taskStatus){
        assignedTasks.add(new Task(taskName, taskDeadline, taskStatus));        
    }
    
}
