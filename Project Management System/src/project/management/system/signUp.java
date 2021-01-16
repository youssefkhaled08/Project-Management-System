
package project.management.system;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class signUp {
    
  
    public signUp(ArrayList <TeamMember> teamMembers) {   
    }
    
    //This method takes data form the user and checks if it's valid or not then add it to the arraylist of Team members
    public static void show(ArrayList <TeamMember> teamMembers){
         for (int j = 0 ; j < teamMembers.size(); j++){
                                System.out.println(teamMembers.get(j).getEmail());
                                System.out.println(teamMembers.get(j).getUsername());
                                System.out.println(teamMembers.get(j).getPassword());
                                System.out.println(teamMembers.get(j).getAccountType());   
                            }
    }
    public static boolean checkUserName(ArrayList <TeamMember> teamMembers,JTextField email, JTextField userName,JTextField password ,JTextField jobType){
        boolean foundUser = false;
        for (int j = 0 ; j < teamMembers.size(); j++){
            if (teamMembers.get(j).getUsername().equals(String.valueOf(userName.getText()))){
            foundUser = true;
            }
        }
        return foundUser;
    }

    public static boolean checkEmail(ArrayList <TeamMember> teamMembers,JTextField email, JTextField userName,JTextField password ,JTextField jobType){
        boolean found = false;
        for (int j = 0 ; j < teamMembers.size(); j++){
            if (teamMembers.get(j).getEmail().equals(String.valueOf(email.getText()))){
            found = true;
            }
        }
        return found;
    }

    public static void regrister(ArrayList <TeamMember> teamMembers, JTextField email, JTextField userName, JTextField password, JTextField jobType){
                 if(email.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Enter an email", "Invalid", JOptionPane.INFORMATION_MESSAGE);

                }
                else if (userName.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Enter a username", "Invalid", JOptionPane.INFORMATION_MESSAGE);
                   
                }
                else if (password.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Enter a password", "Invalid", JOptionPane.INFORMATION_MESSAGE);
                    
                }
                else if(jobType.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Enter an Account Type", "Invalid", JOptionPane.INFORMATION_MESSAGE);
                    
                }
                
                else{
                    if(signUp.checkEmail(teamMembers, email, userName, password, jobType)){
                        JOptionPane.showMessageDialog(null, "Email already exists", "Invalid", JOptionPane.INFORMATION_MESSAGE);      
                    }
                    else if (signUp.checkUserName(teamMembers, email, userName, password, jobType)){
                        
                        JOptionPane.showMessageDialog(null, " Username already exists", "Invalid", JOptionPane.INFORMATION_MESSAGE);                              
                    }
                    else{
                        TeamMember newt = new TeamMember(email.getText(),userName.getText(), password.getText(),jobType.getText());
                        teamMembers.add(newt);
                    }
                    
                }
    }
}        


