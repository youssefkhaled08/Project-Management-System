
package project.management.system;

import java.util.ArrayList;
import java.util.Scanner;


public class signUp {
    
    
    //Attributes
    Scanner input = new Scanner(System.in);
    TeamMember newTeamMember = new TeamMember();
    
    //Constructor that accepts the ArrayList we're working on
    public signUp(ArrayList <TeamMember> teamMembers) {
    }
    
    //Method to cheack if the data entered by the user already exists
    
     public boolean checkValidation(ArrayList <TeamMember> teamMembers){
        boolean stat = true;
        for (int i = 0 ; i <teamMembers.size();i++)
        {
            if (newTeamMember.getUsername().compareTo(teamMembers.get(i).getUsername())==0 && newTeamMember.getPassword().compareTo(teamMembers.get(i).getPassword())==0 ){
                stat = false;
                break;
                
            }        
        }
        return stat;
        
    }
     
     
     //A method to let the user enter the required data
     public void setInformation(ArrayList <TeamMember> teamMembers){
         
         do{
             
        System.out.println("Enter Username:");
        newTeamMember.setUsername(input.next());
        
        System.out.println("Enter Password:");
        newTeamMember.setPassword(input.next());
        
        checkValidation(teamMembers);  
        if(checkValidation(teamMembers) == false){
            System.out.println("This Account already exists");

        }
        else{
            teamMembers.add(newTeamMember);
            System.out.println("You have signed up successfully");
            break;
        }
        
         
        }while (checkValidation(teamMembers) == false);
         
    
    }
    
   
     
}

