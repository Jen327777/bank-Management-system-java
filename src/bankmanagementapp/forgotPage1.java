
package bankmanagementapp;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;


public class forgotPage1 extends JFrame {
    
    ArrayList <String> acc;
    
    public forgotPage1(ArrayList<String> acc){
        this.acc = acc;
    }
    
    JLabel Title, desc,email;
    JTextField tfEmail;
    JButton submit;
    public forgotPage1(){
        
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        Title= new JLabel("FORGOT MY USER-ID");
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
            
            for(String email: acc){
                if(email.equals(inputEmail)){
                    found= true;
                    JOptionPane.showMessageDialog(this, "Email Found!");
                    new logInPage();
                }
                if(!found){
                    JOptionPane.showMessageDialog(this, "Email not registered!");
                }
            }
        
        
        
        
        });
        

    
 


  }
    

}

