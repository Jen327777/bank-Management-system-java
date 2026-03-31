
package bankmanagementapp;


import java.util.*;

public class accCreationPage {
   
//    String firstName,lastName,midName,mobNum,add,idType,idNum; 
    //separated muna since this is for database
    
    private String email,userid,pass;
    
   
    public accCreationPage(String userid,String email, String pass){
        
        
    this.userid= userid;
    this.pass= pass;
    this.email= email;
        
        
    }
    
    //setting up a getter
    
    public String getUserId(){
        return userid;
    }

    public String getEmail(){
        return email;
    }public String getPassword(){
        return pass;
    }
    
}
