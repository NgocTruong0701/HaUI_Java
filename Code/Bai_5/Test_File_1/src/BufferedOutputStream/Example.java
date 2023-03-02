/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BufferedOutputStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 *
 * @author ngoct
 */
public class Example {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("E:\\Download\\Nam_3_Ki_1\\Java\\Code\\Bai_5\\FileTest.txt",true);
            BufferedOutputStream bout = new BufferedOutputStream(fout);
            String s = "\nWelcome to Java";
            byte[] b = s.getBytes();
            bout.write(b);
            bout.flush();
            bout.close();
            fout.close();
            System.out.println("Success");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
