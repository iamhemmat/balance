
package balance;

import java.awt.Toolkit;

/**
 *
 * @author Hemmat
 */
public class Helper {


public static void showNotification(String title){
    javax.swing.JOptionPane.showMessageDialog(null, title);
}    

public static void center(java.awt.Frame f){
     int h_s_size = Toolkit.getDefaultToolkit().getScreenSize().height;
        int w_s_size = Toolkit.getDefaultToolkit().getScreenSize().width;

        int h_fram = f.getSize().height;
        int w_fram = f.getSize().width;

        f.setLocation((w_s_size - w_fram) / 2, (h_s_size - h_fram) / 2);
}

}
