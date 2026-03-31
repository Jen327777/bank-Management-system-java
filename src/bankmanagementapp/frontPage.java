
package bankmanagementapp;

import javax.swing.*;
import java.awt.event.*;


public class frontPage extends JFrame{
    
    JLabel statement,statemnt1, lbOptions;
    JButton btnOption1, btnOption2, btnOption3;
    
      public frontPage(){
          
          setSize(500,500);
          setTitle("Bank Account Management");
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          setLayout(null);
          
          
          statement = new JLabel("WELCOME TO E-BANK MANAGEMENT APP");
          statement.setBounds(130,10,500,30);
          add(statement);
          
          
          statemnt1 = new JLabel("What can I do for you today? ");
          statemnt1.setBounds(50,50,500,30);
          add(statemnt1);
          
          lbOptions = new JLabel("SELECT A SERVICE");
          lbOptions.setBounds(50, 130, 400, 30);
          add(lbOptions);
          
          btnOption1 = new JButton("LOG IN AN ACCOUNT");
          btnOption1.setBounds(50, 180, 400, 30);
          add(btnOption1);
          btnOption1.addActionListener( e -> {
          new logInPage();    
          this.dispose();
          
          });
          
            btnOption2 = new JButton("FORGOT USER-ID OR PASSWORD");
          btnOption2.setBounds(50, 250, 400, 30);
          add(btnOption2);
          btnOption2.addActionListener( e -> {
          new forgotCredentialPage();
          this.dispose();
          
          });
          
          btnOption3 = new JButton("CREATE AN ACCOUNT");
          btnOption3.setBounds(50, 320, 400, 30);
          add(btnOption3);
          btnOption3.addActionListener(e -> {
          new accounts();
          this.dispose();
          
          });
          
          
          
          
          
          
          
      }

  
    
}
