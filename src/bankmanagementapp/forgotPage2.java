
package bankmanagementapp;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

//email needed


public class forgotPage2 extends JFrame {
    
     ArrayList <accCreationPage> acc;

    
    JLabel Title, desc,email;
    JTextField tfEmail;
    JButton submit, homepage;
    
    public forgotPage2(){
        
      this.acc = accDatabase.acc;
      
        setVisible(true);
        setSize(500, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Forgot Password");
        
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        Title= new JLabel("FORGOT MY ACCOUNT LOGIN");
        add(Title);
        Title.setBounds(50, 60, 150, 30);
        
        desc= new JLabel("Enter your registered email address below to recover your account");
        add(desc);
        desc.setBounds(50, 150, 500, 30);
        
         email= new JLabel("Email: ");
        add(email);
        email.setBounds(90, 200, 150, 30);
        
        tfEmail= new JTextField();
        add(tfEmail);
        tfEmail.setBounds(140, 200, 250, 30);
        
         submit= new JButton("Submit");
        add(submit);
        submit.setBounds(180, 350,150, 30);
        submit.addActionListener(e ->{
        
            String inputEmail = tfEmail.getText();
            boolean found = false;
            
            for(accCreationPage user: acc){
                 
            
            if(user.getEmail().equals(inputEmail)){
                
            found= true;
            break;
            }}
                    
            
            if(found){JOptionPane.showMessageDialog(this, "Email Found!");
                    new dashboard();
                    this.dispose();
            } else{
                    JOptionPane.showMessageDialog(this, "Email not registered!");
                }
        });

            homepage = new JButton ("Back to Homepage");
            homepage.setBounds(150, 420, 200, 30);
            add(homepage); 
            homepage.addActionListener( e-> {
            
            new frontPage().setVisible(true);
            this.dispose();
            
            
            });

    

        }
                }
    
