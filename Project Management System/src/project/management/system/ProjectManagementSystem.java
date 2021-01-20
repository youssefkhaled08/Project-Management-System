package project.management.system;


import project.management.system.GUI.*;
import java.util.ArrayList;

public class ProjectManagementSystem {

    public static void main(String[] args) {
        ArrayList <TeamMember> teamMembers = new ArrayList<>();
        ArrayList <Task> tasks = new ArrayList<>();
        
       TeamMember  user1 = new TeamMember("ahmed@gmail","ahmed","123","Team Member");
       TeamMember  user2 = new TeamMember("sasa","sasa","123","Team Leader");
       teamMembers.add(user1);
       teamMembers.add(user2);
       
       new GUILogIn(tasks,teamMembers).setVisible(true);
       
       System.out.println(teamMembers.indexOf(user1));

    }    
}
