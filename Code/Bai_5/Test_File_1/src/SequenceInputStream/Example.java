/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SequenceInputStream;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

/**
 *
 * @author ngoct
 */
public class Example {
    public static void main(String[] args) {
        try {
            FileOutputStream fout1 = new FileOutputStream("E:\\Download\\Nam_3_Ki_1\\Java\\Code\\Bai_5\\FileTestLuong1.txt");
            FileOutputStream fout2 = new FileOutputStream("E:\\Download\\Nam_3_Ki_1\\Java\\Code\\Bai_5\\FileTestLuong2.txt");
            String s1 = "Hello";
            String s2 = "Everyone ";
            DataOutputStream dout1 = new DataOutputStream(fout1);
            dout1.writeChars(s1);
            DataOutputStream dout2 = new DataOutputStream(fout2);
            dout2.writeChars(s2);
            fout1.close();
            fout2.close();
            dout1.close();
            dout2.close();
            
            FileInputStream fin1 = new FileInputStream("E:\\Download\\Nam_3_Ki_1\\Java\\Code\\Bai_5\\FileTestLuong1.txt");
            FileInputStream fin2 = new FileInputStream("E:\\Download\\Nam_3_Ki_1\\Java\\Code\\Bai_5\\FileTestLuong2.txt");
            SequenceInputStream inst = new SequenceInputStream(fin1, fin2);
            int i;
            while((i = inst.read()) != -1){
                System.out.print((char)i);
            }
            fin1.close();
            fin2.close();
            inst.close();
        } catch (Exception e) {
        }
    }
}
