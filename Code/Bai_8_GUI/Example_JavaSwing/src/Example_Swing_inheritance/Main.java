/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Example_Swing_inheritance;


import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author ngoct
 */
//We can also inherit the JFrame class, so there is no need to create the instance of JFrame class explicitly.
class ExampleSwingInherit extends JFrame{

    public ExampleSwingInherit(){
        JButton b = new JButton("Click"); // Creating Button
        b.setBounds(130, 100, 100, 40);
        
        add(b); // add button on frame
        setSize(300, 300); // set size cua frame
        setTitle("Hello");
        setLayout(null);
        setVisible(true);
    }
    
}


public class Main{
    public static void main(String[] args) {
        new ExampleSwingInherit();
    }
}
