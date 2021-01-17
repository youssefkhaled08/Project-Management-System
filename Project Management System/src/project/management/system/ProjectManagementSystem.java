package project.management.system;

import project.management.system.GUI.GUILogIn;
import java.util.ArrayList;

public class ProjectManagementSystem {

    public static void main(String[] args) {
        ArrayList <TeamMember> teamMembers = new ArrayList<>(); 
       TeamMember  a7a1 = new TeamMember("ahmed@gmail","ahmed","123","member");
        TeamMember a7a2 = new TeamMember("lol@gmail","lol","123","leader");
       
       teamMembers.add(a7a1);
       teamMembers.add(a7a2);
       
       new GUILogIn(teamMembers).setVisible(true);
        
        

    }    
}
