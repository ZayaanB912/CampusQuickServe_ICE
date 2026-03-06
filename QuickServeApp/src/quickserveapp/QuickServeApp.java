
package quickserveapp;

import javax.swing.JOptionPane;

public class QuickServeApp {

    
    public static void main(String[] args) {
        
        //Welcome message
        int WelcomeAnswer = JOptionPane.showConfirmDialog(null,
                "Welcome to the Campus Quick Serve.\nClick OK to start your order!",
                "Campus Quick Serve",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
        
        //If user presses the 'Cancel' button then stops the operation
        if (WelcomeAnswer == JOptionPane.CANCEL_OPTION) {
            System.exit(0);
        }
        
        //User Entering their Name and Surname
        String Name = JOptionPane.showInputDialog("Please enter your name and surname:", "Campus Quick Serve");
        //User entering their student number
        String StudentNumber = JOptionPane.showInputDialog("Please enter your student number:", "Campus Quick Serve");

        
        
    }
    
}
