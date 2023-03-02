/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package example_menu_bar;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

/**
 *
 * @author ngoct
 */
public class Example_Menu_Bar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Tao Frame va add MenuBar vao de co the hien Menu va MenuItem o ben tren
        JFrame jframe = new JFrame("Example"); // Tao 1 Frame de hien thi
        JMenuBar jmenuBar = new JMenuBar(); // Tao 1 thanh menuBar nam ngang man hinh chua JMenu, JSeparator, JMenuItem..
        JMenu menu = new JMenu("File"); // Tao 1 menu doc de chua JMenu hoac JMenuItem..

        // Khoi tao 1 JMenuItem de dua len Menu
        JMenuItem menuItem1 = new JMenuItem("Lua chon 1", 1);
        JMenuItem menuItem2 = new JMenuItem("Lua chon 2", 2);
        
        // Khoi tao 1 JMenu ben trong 1 JMenu cha
        JMenu menuCon = new JMenu("File con");
        
        // Khoi tao 1 JMenu 
        JMenu menuHelp = new JMenu("Help");
        
        // Them ,JMenu, JMenuItem vao Menu
        menu.add(menuItem1);
        menu.add(menuItem2);
        menu.addSeparator(); // Them 1 dong ngan cach
        menu.add(menuCon);

        // Them Menu vao MenuBar
        jmenuBar.add(menu);
      
        // Them JMenu Help vao MenuBar
        jmenuBar.add(menuHelp);

        // Dua MenuBar vao Frame va hien thi Frame do
        jframe.setJMenuBar(jmenuBar);
        jframe.setSize(300, 300);
        jframe.setVisible(true);
    }

}
