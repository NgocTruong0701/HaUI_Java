/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SequenceInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

/**
 *
 * @author ngoct
 */
public class Example_2_gop_2 {

    public static void main(String[] args) {
        try {
            FileInputStream fin1 = new FileInputStream("E:\\Download\\Nam_3_Ki_1\\Java\\Code\\Bai_5\\FileTestLuong1.txt");
            FileInputStream fin2 = new FileInputStream("E:\\Download\\Nam_3_Ki_1\\Java\\Code\\Bai_5\\FileTestLuong2.txt");
            FileOutputStream fout = new FileOutputStream("E:\\Download\\Nam_3_Ki_1\\Java\\Code\\Bai_5\\FileTestOut.txt");
            SequenceInputStream sis = new SequenceInputStream(fin1, fin2);
            int i;
            while ((i = sis.read()) != -1) {
                fout.write(i);
            }

            fout.write(" ".getBytes());
            sis.close();

            fout.close();

            fin1.close();

            fin2.close();

            System.out.println("Success..");
        } catch (Exception e) {
        }
    }
}
