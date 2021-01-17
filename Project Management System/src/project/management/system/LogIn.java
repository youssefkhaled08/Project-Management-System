
 
package project.management.system;

import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import project.management.system.TeamMember;


public class LogIn {
    
    
    
    
    public static void askForInfo (ArrayList <TeamMember> teamMembers , JTextField userName,JTextField password ) {
        
        for (int i=0;i<teamMembers.size();i++)
        {
            if (userName.getText().equals(String.valueOf(teamMembers.get(i).getUsername()))&&password.getText().equals(String.valueOf(teamMembers.get(i).getPassword())))
            {
                JOptionPane.showMessageDialog(null, "Logged", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Wrong Username Or Password", "Invalid", JOptionPane.INFORMATION_MESSAGE);
            }
            
            
            
        }
        
    }
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

