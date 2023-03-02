/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author ngoct
 */
public class Student_file implements Serializable {
    int id;
    String name;

    public Student_file(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
}


class main{
    public static void main(String[] args) {
        // Serialization -- Tuan tu hoa
        try{
            // Creating the object 
            Student_file s1 = new Student_file(1, "Le Ngoc Truong");
            // Creating stream and writing the object
            FileOutputStream fout = new FileOutputStream("E:\\Download\\Nam_3_Ki_1\\Java\\Lession\\Lession_5\\Test.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            // closing the stream
            out.close();
            System.out.println("Success");
            
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        // Deserialization -- Giai tuan tu hoa
        try{
            // Creating stream to read the object 
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("E:\\Download\\Nam_3_Ki_1\\Java\\Lession\\Lession_5\\Test.txt"));
            Student_file s1 = (Student_file)in.readObject();
            // Printing the data of the serialized object
            System.out.println(s1.id + " " + s1.name);
            // close the stream 
            in.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
