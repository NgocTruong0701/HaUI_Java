/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UseInnerClassName;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Lê Ngọc Trường
 */
public class ButtonExample {

    public ButtonExample() {
        JFrame f = new JFrame("Button Example");

        doSay listener = new doSay();// khai báo đối tượng doSay

        JButton button = new JButton("Click");
        button.addActionListener(listener);// đăng ký đối tượng doSay làm ActionListener cho button

        f.add(button);

        f.setLayout(new FlowLayout());
        f.setSize(500, 500);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new ButtonExample();
    }
}
