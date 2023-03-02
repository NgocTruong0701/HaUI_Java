/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnonymousInnerClass;

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
public class ButtonExample_2 {

    public ButtonExample_2() {
        JFrame f = new JFrame("Example");
        JButton b = new JButton("CLick");
        
        // thêm ActionListener bằng Anonymous Inner Class
        b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "Hello");
            }
            
        });
        
        f.add(b);
        f.setLayout(new FlowLayout());
        f.setSize(400,400);
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        new ButtonExample_2();
    }
}
