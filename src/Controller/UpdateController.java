
package Controller;

import javax.swing.JOptionPane;


public class UpdateController {
    public static void UpdateBooks(String mn, String bn,  String category, String status){ 
    new Model.AddUpdate().addUpdate(mn, bn,category, status); 
    JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE); 
    
}
}
