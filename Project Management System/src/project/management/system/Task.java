package project.management.system;

public class Task {
    
    private String taskName;     
    private String taskDeadline;
   
    private enum Status 
    {       
        TO_DO,
        ON_GOING,
        DONE
    }
    private Status taskStatus;

    public Task (String taskName, String taskDeadline, Status taskStatus)
    {
        this.taskName = taskName;
        this.taskDeadline = taskDeadline;
        this.taskStatus = taskStatus;
    }
    
    public void setName(String taskName) {
        this.taskName = taskName;
    }

    public void setDeadline(String taskDeadline) {
        this.taskDeadline = taskDeadline;
    }

    public void setTaskStatus(Status taskStatus){
        this.taskStatus = taskStatus;
    }
    public String getName() {
        return taskName;
    }

    public String getDeadline() {
        return taskDeadline;
    }
    
    public Status getTaskStatus(){
        return taskStatus;
    }
}

