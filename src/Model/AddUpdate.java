
package Model;

import java.sql.Statement;


public class AddUpdate {
    Statement stmt; 
     public void addUpdate(String mn, String bn, String category, String status) { 
        try { 
            stmt = DBConnection.getStatementConnection(); 
            System.out.println(mn + bn  + category + status); 
            System.out.println("Updated");            
            stmt.executeUpdate("INSERT INTO book_update VALUES (null,'" + mn + "','" + bn + "',  '" + category + "', '" + status + "')"); 
        } catch (Exception e) { 
            e.printStackTrace();         } 
    }

}  
