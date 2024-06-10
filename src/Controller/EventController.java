
package Controller;

import javax.swing.JOptionPane; 

public class EventController {
    
         public static void Form2 (String name, String time, String location) { 
              new Model.AddEvent().Form2 (name, time, location); 
              JOptionPane.showMessageDialog(null, "New Event has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE); 
         }  

    public static void Form2(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
