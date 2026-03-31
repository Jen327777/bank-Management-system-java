
package bankmanagementapp;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
//user id needed

public class forgotPage1 extends JFrame {
    
    ArrayList <accCreationPage> acc;
    
    public forgotPage1(ArrayList<accCreationPage> acc){
        this.acc = accDatabase.acc;
    }
    
    JLabel Title, desc,Userid;
    JTextField tfUserid;
    JButton submit,homepage;
    public forgotPage1(){
        
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        Title= new JLabel("FORGOT MY PASSWORD");
        add(Title);
        Title.setBounds(50, 60, 150, 30);
        
        desc= new JLabel("Enter your registered USER_ID  below to recover your account");
        add(desc);
        desc.setBounds(50, 150, 500, 30);
        
         Userid= new JLabel("User-ID: ");
        add(Userid);
        Userid.setBounds(90, 200, 150, 30);
        
        tfUserid= new JTextField();
        add(tfUserid);
        tfUserid.setBounds(140, 200, 250, 30);
        
         submit= new JButton("Submit");
        add(submit);
        submit.setBounds(180, 350,150, 30);
        submit.addActionListener(e ->{
        
            String inputUserId = tfUserid.getText();
            boolean found = false;
            
            for(accCreationPage a: acc){
                 
            
            if(a.getUserId().equals(inputUserId)){
                
            found= true;
            break;
            }}
                    
            
            if(found){JOptionPane.showMessageDialog(this, "USER- ID Found!");
                    new logInPage();
                    this.dispose();
            } else{
                    JOptionPane.showMessageDialog(this, "USER_ID not registered!");
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

