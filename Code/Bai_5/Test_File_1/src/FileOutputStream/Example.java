/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileOutputStream;

import java.io.FileOutputStream;

/**
 *
 * @author ngoct
 */
public class Example {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("E:\\Download\\Nam_3_Ki_1\\Java\\Code\\Bai_5\\FileTest.txt", true); // true de ghi tiep file, mac dinh khong co gi la ghi de
            String s = "Hello";
            byte[] b = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Success");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
