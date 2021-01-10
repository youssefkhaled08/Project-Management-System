package project.management.system;

public class ProjectManagementSystem {

    public static void main(String[] args) {
        TeamMember member = new TeamMember("Ykfhe08", "password");
        member.addTask("Task 1", "10-10-10", Task.Status.TO_DO);
        member.addTask("Task 2", "20-20-20", Task.Status.DONE);
        member.getTasks();
        member.editTask(0, "Task 1", "10-10-10", Task.Status.DONE);
        member.getTasks();
    }    
}
