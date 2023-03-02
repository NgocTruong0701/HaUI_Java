/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SequenceInputStream;

import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

/**
 *
 * @author ngoct
 */
public class Example_3_gop_n {
    public static void main(String[] args) throws Exception {
        // creating the fileInputStream objects for all the files
        FileInputStream fin = new FileInputStream("E:\\Download\\Nam_3_Ki_1\\Java\\Code\\Bai_5\\FileTest.txt");
        FileInputStream fin1 = new FileInputStream("E:\\Download\\Nam_3_Ki_1\\Java\\Code\\Bai_5\\FileTestLuong1.txt");
        FileInputStream fin2 = new FileInputStream("E:\\Download\\Nam_3_Ki_1\\Java\\Code\\Bai_5\\FileTestLuong2.txt");
        FileInputStream fin3 = new FileInputStream("E:\\Download\\Nam_3_Ki_1\\Java\\Code\\Bai_5\\FileTestOut.txt");
        
        // Creating ArrayList object to all the stream
        ArrayList<FileInputStream> list = new ArrayList<>();
        list.add(fin);
        list.add(fin1);
        list.add(fin2);
        list.add(fin3);
        
        // Creating enumeration object by calling the elements method
        Enumeration e = Collections.enumeration(list);
        
        // passing the enumeration object in the constructor
        SequenceInputStream bin = new SequenceInputStream(e);
        int i = 0;
        while((i = bin.read())!= -1){
            System.out.print((char)i);
        }
        bin.close();
        fin.close();
        fin1.close();
        fin2.close();
        fin3.close();
                
    }
}
