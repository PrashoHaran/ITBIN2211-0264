package Model;

import java.sql.ResultSet; 
import java.sql.Statement; 
import java.sql.ResultSet; 
import java.sql.Statement; 
import java.sql.ResultSet; 
import java.sql.Statement; 

public class DBSearch {
    
        Statement stmt; 
        ResultSet rs; 
        
        public ResultSet searchLogin(String usName) { 
        try { 
            stmt = DBConnection.getStatementConnection(); 
            String name = usName; 
            //Execute the Query 
            rs = stmt.executeQuery("SELECT * FROM login where username='" + name + "'"); 
            } catch (Exception e) { 
            e.printStackTrace(); 
            } 
            return rs; 
    } 
        
        public ResultSet searchStudents(){ 
        try{ 
            stmt = DBConnection.getStatementConnection(); 
            rs = stmt.executeQuery("SELECT * FROM student"); 
        } 
        catch(Exception e){ 
        } 
        return rs; 
        } 
        
        public ResultSet searchEvents(){ 
        try{ 
            stmt = DBConnection.getStatementConnection(); 
            rs = stmt.executeQuery("SELECT * FROM event"); 
        } 
        catch(Exception e){ 
        } 
        return rs; 
        }   
        
        public ResultSet searchBooks(){ 
        try{ 
            stmt = DBConnection.getStatementConnection(); 
            rs = stmt.executeQuery("SELECT * FROM books"); 
        } 
        catch(Exception e){ 
        } 
        return rs; 
        }   
}

