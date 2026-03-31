
package bankmanagementapp;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;


public class accounts extends JFrame{
    
    JLabel email ,userId,pass;
    JTextField tfEmail, tfuserId,tfpass;
     JButton submit, logInPage; 
     
     
    public accounts(){
         
         
         
        setVisible(true);
        setSize(500, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Account Registration");
        setLayout(null);
        
        email = new JLabel("Email: ");
        email.setBounds(50, 200, 200, 20);
        add(email);
        
        
        tfEmail= new JTextField();
        add(tfEmail);
        tfEmail.setBounds(140, 200, 250, 30);
        
        userId = new JLabel ("USER-ID: ");
        add(userId);
        userId.setBounds(50, 250, 200, 20);
        
        tfuserId= new JTextField();
        add(tfuserId);
        tfuserId.setBounds(140, 250, 250, 30);
        
           pass = new JLabel ("Password: ");
        add(pass);
        pass.setBounds(50, 300, 200, 20);
        
        tfpass= new JTextField();
        add(tfpass);
        tfpass.setBounds(140, 300, 250, 30);
        
        
        
        
        
        
        
        
        submit = new JButton ("CREATE AN ACCOUNT");
        submit.setBounds(150,350, 200,20);
        add(submit);
        submit.addActionListener(e -> {
        
            
            //for log in to sya to proceed sa dashboard
            String inputedUserId = tfuserId.getText();
             String inputedPass = tfpass.getText();
            

            //THIS IS FOR THE EMAIL INFO( FOR retrieving accounts )
        String emailInputed = tfEmail.getText();
        
        if (emailInputed.isEmpty() || inputedUserId.isEmpty() || inputedPass.isEmpty()){
            JOptionPane.showMessageDialog(this,"REQUIRED FIELD : Email, userID, and Password");
            return;
        }
         
            accCreationPage newAcc = new accCreationPage (inputedUserId,emailInputed, inputedPass);
            accDatabase.acc.add(newAcc);
      
        JOptionPane.showMessageDialog(this, "Account Created!");
    
        
        
        });
        
        logInPage = new JButton("BACK TO LOGIN PAGE");
        logInPage.setBounds(150,550, 200,20);
        add(logInPage);
        logInPage.addActionListener(e ->{
        
            new logInPage();
            this.dispose();
        
        
        
        });
        
        
        
       
        
    }
}
