
package Model;

import java.sql.Statement; 
 
public class AddEvent {
    
     Statement stmt; 
         
     public void Form2 (String name, String time, String location) { 
        try { 
        stmt = DBConnection.getStatementConnection(); 
        stmt.executeUpdate
                
        ("INSERT INTO event VALUES('"+name+"', '"+time+"', '"+location+"')"); 
        } catch (Exception e) { 
            e.printStackTrace(); 
        }
    }
}
