
 
package project.management.system;

import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import project.management.system.TeamMember;


public class LogIn {
    
    
    
    
    public static boolean validation (ArrayList <TeamMember> teamMembers , JTextField userName,JTextField password ) {
        boolean found = false;
        for (int i = 0 ; i < teamMembers.size() ; i++)
        {
            if (userName.getText().equals(teamMembers.get(i).getUsername()) && password.getText().equals(teamMembers.get(i).getPassword()))
            {
                    found = true; 
                    return found;    
            }
        
        }
        return found;
    }
    
    public static void logIn(ArrayList <TeamMember> teamMembers , JTextField userName,JTextField password ){
        if (validation(teamMembers, userName, password))
                {
                    JOptionPane.showMessageDialog(null, "Ok", "Invalid", JOptionPane.INFORMATION_MESSAGE);
                    
                }
        else{
            JOptionPane.showMessageDialog(null, "Wrong username OR password", "Invalid", JOptionPane.INFORMATION_MESSAGE);
            
        }
    }

    
}

