package project.management.system;

import java.util.ArrayList;
import java.util.Scanner;



public class login {
    
    Scanner login = new Scanner(System.in);
    TeamMember loginInfo =new TeamMember();
    public login(){
        
    }
    public void askForInfo (ArrayList <TeamMember> teamMembers) {
        System.out.println("Enter Username:");
        loginInfo.setUsername(login.next());
        System.out.println("Enter Password : ");
        loginInfo.setPassword(login.next());
        for (int i=0;i<teamMembers.size();i++)
        {
            if (loginInfo.getUsername().compareTo(teamMembers.get(i).getUsername())==0 && loginInfo.getPassword().compareTo(teamMembers.get(i).getPassword())==0)
            {
                System.out.println("Logged");
                break;
            }
            else
            {
                System.out.println("Wrong Information Try Again");
                break;
            }
            
            
            
        }
        
    }
 
}