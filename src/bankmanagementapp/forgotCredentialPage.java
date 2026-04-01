
package bankmanagementapp;

import javax.swing.*;
import java.awt.event.*;



public class forgotCredentialPage extends JFrame {
    
    
            JLabel forgotMes;
            JButton btnOpt1,btnOpt2,btnOpt3,homepage;
    
    public forgotCredentialPage(){
        
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("Forgot User-ID / Password");
        
        
        forgotMes = new JLabel ("Recover your account by using your account details...");
        forgotMes.setBounds(30, 100, 500, 15);
        add(forgotMes);
        
        btnOpt1 = new JButton ("I forgot my USER-ID");//for user id itowww
        btnOpt1.setBounds(100, 150, 300, 15);
        add(btnOpt1);
        btnOpt1.addActionListener(e ->{
        new forgotPage2();
        this.dispose();
        });
        
          btnOpt2 = new JButton ("I forgot my password"); //for forgot pass nmn here
        btnOpt2.setBounds(100, 180, 300, 15);
       add(btnOpt2);
       btnOpt2.addActionListener(e ->{
        new forgotPage1();
        this.dispose();
        });
       
        btnOpt3 = new JButton ("I forgot my USER-ID & password");
        btnOpt3.setBounds(100, 210, 300, 15);
        add(btnOpt3);  
        btnOpt3.addActionListener(e ->{
        new forgotPage2();
        this.dispose();
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
