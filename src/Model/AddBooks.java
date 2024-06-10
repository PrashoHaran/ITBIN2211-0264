
package Model;

import java.sql.Statement;

public class AddBooks {
    Statement stmt; 
    public void Books(String id, String bname,String category){ 
    try{ 
        stmt = DBConnection.getStatementConnection(); 
        stmt.executeUpdate("INSERT INTO books VALUES('"+id+"', '"+bname+"','"+category+"')"); 
        
        } catch(Exception e){ 
            e.printStackTrace(); 
        }     
    }
    
}
