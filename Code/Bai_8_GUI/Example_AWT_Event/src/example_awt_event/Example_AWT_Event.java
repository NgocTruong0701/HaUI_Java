/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package example_awt_event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author ngoct
 */
class Example_AWT_Events extends WindowAdapter implements ActionListener {

    Frame f;
    Button b;
    TextField tx;

    public Example_AWT_Events() {
        f = new Frame("Example");
        b = new Button("Click");
        tx = new TextField(200);

        f.setBounds(50, 50, 300, 200);
        f.setLayout(null);

        tx.setBounds(50, 50, 200, 30);
        b.setBounds(120, 150, 60, 30);
        f.add(b);
        f.add(tx);
        f.setVisible(true);

        b.addActionListener(this);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
            
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tx.setText("Hello Everyone");
    }
    
}

public class Example_AWT_Event{
    public static void main(String[] args) {
        new Example_AWT_Events();
    }
}
