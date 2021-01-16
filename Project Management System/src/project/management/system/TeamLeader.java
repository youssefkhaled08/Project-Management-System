package project.management.system;

public class TeamLeader extends TeamMember{

    public TeamLeader(String email, String username, String password, String accountType) {
        super(email, username, password, accountType);
    }
    
    
    public void addTask(String taskName, String taskDeadline, Task.Status taskStatus){
        assignedTasks.add(new Task(taskName, taskDeadline, taskStatus));        
    }
    
}
