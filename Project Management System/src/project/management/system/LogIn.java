
 
package project.management.system;

import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.JOptionPane;


public class LogIn {
    
    
    private static String accType;
    
    public static boolean validation (ArrayList <TeamMember> teamMembers , JTextField userName,JTextField password ) {
        boolean found = false;
        for (int i = 0 ; i < teamMembers.size() ; i++)
        {
            if (userName.getText().equals(teamMembers.get(i).getUsername()) && password.getText().equals(teamMembers.get(i).getPassword()))
            {
                    accType = teamMembers.get(i).getAccountType();
                    found = true; 
                    return found;    
            }
        
        }
        return found;
    }
    
    public static void logIn(ArrayList <TeamMember> teamMembers , JTextField userName,JTextField password ){
        if (validation(teamMembers, userName, password))
                {
                    if(accType.equals("Team Member")){
                        JOptionPane.showMessageDialog(null, "logged as Team Member", "Invalid", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(accType.equals("Team Leader")){
                        JOptionPane.showMessageDialog(null, "logged as Team Leader", "Invalid", JOptionPane.INFORMATION_MESSAGE);
                    }                    
                    
                }
        else{
            JOptionPane.showMessageDialog(null, "Wrong username OR password", "Invalid", JOptionPane.INFORMATION_MESSAGE);
            
        }
    }

    
}

