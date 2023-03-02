/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExampleSwinginsideMethod;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author ngoct
 */
public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame(); // creating instance of JFrame
        
        JButton b = new JButton("Click me"); // creating instance of JButton
        b.setBounds(130, 100, 100, 40);
        
        f.add(b);// add button in jframe
        
        f.setSize(300,300);
        f.setTitle("Hello");
        f.setLayout(null);//using no layout managers  
        f.setVisible(true);//making the frame visible  
    }
}
