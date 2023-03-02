/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package example_toolbar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;

/**
 *
 * @author ngoct
 */
public class Example_ToolBar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Example ToolBar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JToolBar toolBar = new JToolBar();
        toolBar.setFloatable(false); // ngăn không cho người dùng kéo thanh công cụ ra khỏi vị trí ban đầu
        toolBar.add(new JButton("New"));
        toolBar.add(new JButton("Open"));
        toolBar.add(new JButton("Save"));
        
        JPanel panel = new JPanel();
        panel.add(toolBar);

        frame.add(panel);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
    
}
