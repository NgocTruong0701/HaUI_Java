/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TopLevelListener;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Lê Ngọc Trường
 */
public class Example_Button_3 extends JFrame implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showConfirmDialog(this, "Hello");
    }
    
    public Example_Button_3(){
        super("Example");
        
        JButton b = new JButton("Click");
        
        b.addActionListener(this);
        
        add(b);
        setLayout(new FlowLayout());
        setSize(400,400);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Example_Button_3();
    }
}
