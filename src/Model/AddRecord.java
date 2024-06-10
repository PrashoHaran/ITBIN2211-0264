
package Model;

import java.sql.Statement; 

public class AddRecord {
     Statement stmt; 
     
     public void Form(String name, String address, String gender, String age) { 
        try { 
            stmt = DBConnection.getStatementConnection(); 
            stmt.executeUpdate
        
            ("INSERT INTO student VALUES('"+name+"', '"+address+"', '"+gender+"', '"+age+"')");
            
        } catch (Exception e) { 
            e.printStackTrace(); 
        } 
         
    } 
    
}
