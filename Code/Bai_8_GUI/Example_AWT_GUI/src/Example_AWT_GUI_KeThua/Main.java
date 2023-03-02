/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Example_AWT_GUI_KeThua;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

/**
 *
 * @author ngoct
 */
// extending Frame class to our class AWTExample1  
class AWTExample extends Frame {

    // Initializing using constructor
    AWTExample() {
        // creating a button
        Button b = new Button("Click me");

        // Setting button position on screen
        b.setBounds(30, 100, 80, 30);

        // adding button on Frame 
        add(b);

        // Lay doi tuong Toolkit
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        
        // Lay kich co man hinh
        Dimension screenSize = toolkit.getScreenSize();
        
        // Frame size 300 width and 300 height// Frame size bang kich co man hinh
        //setSize(300, 300);
        setSize(screenSize.width, screenSize.height);
        
        // Setting the title of Frame
        setTitle("This is our Basic AWT Example");

        // No layout manager
        setLayout(null);

        // Now frame will be visible, by default it is not visible (Hien thi, mac dinh khong hien thi nen phai set lai)
        setVisible(true);
    }
}

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AWTExample f = new AWTExample();
    }

}
