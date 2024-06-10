
package Controller;

import javax.swing.JOptionPane; 

public class StudentController {
         
    public static void Form(String name, String address, String gender, String age) 
    { 
        new Model.AddRecord().Form(name, address, gender, age); 
        JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE); 
    }   
     
}
