
package bankmanagementapp;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class logInPage extends JFrame{
    
    JLabel tit1, userName,pass;
    JTextField tfUsername, tfPassword;
    JButton btnLog, btnForgot, btnBack;
    
        public logInPage(){
        
        setVisible(true);
        setSize(500, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("WELCOME TO LOGIN PAGE");
        
        tit1 = new JLabel("Welcome Back!");
        tit1.setBounds(50, 100, 150, 90);
        add(tit1);
        
        userName = new JLabel("User ID: ");
        userName.setBounds(90, 150, 150, 90);
        add(userName);
        
         pass = new JLabel("Password: ");
        pass.setBounds(90, 180, 150, 90);
        add(pass);
        
        tfUsername = new JTextField();
        tfUsername.setBounds(160,185,200,20);
        add(tfUsername);
        
         tfPassword = new JTextField();
        tfPassword.setBounds(160,215,200,20);
        add(tfPassword);
        
        btnLog = new JButton("LOG IN");
        btnLog.setBounds(180, 250, 150, 30);
        add(btnLog);

  
        
        
        btnLog.addActionListener( e -> {
                 
                boolean found= false;

                    String id = tfUsername.getText();
                        String password = tfPassword.getText();
                for (accCreationPage a : accDatabase.acc){
                    if (a.getUserId().equals(id) && a.getPassword().equals(password)){
                        found = true;
                       
                        break;
                        
                    }
                   
                }
                 if(found){
                         new dashboard();
                         this.dispose();;
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Incorrect UserId or Password");
                    }
        
        
        
        });
        
        
        btnBack= new JButton("HOMEPAGE");
        btnBack.setBounds(180, 290, 150, 30);
        add(btnBack);
        btnBack.addActionListener(e -> {
          new frontPage().setVisible(true);
        this.dispose();
        
        });
        
        btnForgot = new JButton("Forgot User-Id/Password");
        btnForgot.setBounds(145, 400, 220, 15);
        add(btnForgot);
        btnForgot.addActionListener(e -> {
        new forgotCredentialPage().setVisible(true);
        this.dispose();
        
        });
        
    }
}
