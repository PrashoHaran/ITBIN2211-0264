
package Controller;

public class BookController {
      
    public static void Books(String id, String bname,String category){
      new Model.AddBooks().Books(id, bname,category);  
    } 
}
