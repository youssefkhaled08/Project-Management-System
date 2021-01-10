package project.management.system;

import java.util.ArrayList;

public class ProjectManagementSystem {

    public static void main(String[] args) {
        ArrayList <TeamMember> teamMembers = new ArrayList<>();
        
        
        signUp sign = new signUp(teamMembers);
        sign.setInformation(teamMembers);
        
        signUp sign2 = new signUp(teamMembers);
        sign2.setInformation(teamMembers);
    }    
}
