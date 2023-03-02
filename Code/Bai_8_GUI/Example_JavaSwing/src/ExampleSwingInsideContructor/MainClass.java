/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExampleSwingInsideContructor;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author ngoct
 */

class Example{
    public Example() {
        JFrame f = new JFrame("Example");// creating instace of JFrame
        
        JButton b = new JButton("Hello");
        b.setBounds(100,80, 100,30);
        
        f.add(b); // add button in JFrame
        
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
public class MainClass {

    public static void main(String[] args) {
        Example ex = new Example();
    }
    
}
