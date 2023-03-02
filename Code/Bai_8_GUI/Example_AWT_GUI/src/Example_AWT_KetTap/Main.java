/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Example_AWT_KetTap;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

/**
 *
 * @author ngoct
 */
// class AWTExample2 directly creates instance of Frame class   
class ExampleAWTAssocial{

    // initializing using constructor  
    ExampleAWTAssocial() {
        // Creating a Frame
        Frame f = new Frame();
        
        // Creating a label
        Label lable = new Label("Employee ID: ");
        
        // Creating a button
        Button b = new Button("Submit");
        
        // Creating a textfield
        TextField text = new TextField();
        
        // Setting position of above components in the frame 
        lable.setBounds(20, 80, 80, 30);
        text.setBounds(20,100,80,30);
        b.setBounds(110, 100, 80, 30);
        
        // adding components into frame
        f.add(text);
        f.add(b);
        f.add(lable);
        
        // Frame size 300 width and 300 height 
        f.setSize(300,300);
        
        // Setting tile of frame 
        f.setTitle("Employee Infor");
        
        // no layout 
        f.setLayout(null);
        
        // Hien thi cac components - setting visibility of frame
        f.setVisible(true);
    }
    
    
}

public class Main {
    public static void main(String[] args) {
        ExampleAWTAssocial f = new ExampleAWTAssocial();
    }
}
