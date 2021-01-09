/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.management.system;

/**
 *
 * @author user
 */
public class Task {
    
   private String taskName;     
   private String taskDeadline;

    public void setName(String name) {
        this.taskName = name;
    }

    public void setDeadline(String deadline) {
        this.taskDeadline = deadline;
    }
   

    public String getName() {
        return taskName;
    }

    public String getDeadline() {
        return taskDeadline;
    }
    public Task ()
    {
      this.taskName=taskName;
      this.taskDeadline=taskDeadline;
    
    }
    
    enum taskStatus {       // Task Status 
        TO_DO,
        ON_GOING,
        DONE
                
    }
    
    
}

