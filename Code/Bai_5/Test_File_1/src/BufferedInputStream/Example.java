/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BufferedInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 *
 * @author ngoct
 */
public class Example {
    public static void main(String[] args) {
        // cach 1:
        try {
            FileInputStream fin = new FileInputStream("E:\\Download\\Nam_3_Ki_1\\Java\\Code\\Bai_5\\FileTest.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i;
            while((i = bin.read()) != -1){
                System.out.print((char)i);
            }
            fin.close();
            bin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        // Cach 2:
        try{
            FileInputStream fin = new FileInputStream("E:\\Download\\Nam_3_Ki_1\\Java\\Code\\Bai_5\\FileTest.txt");
            BufferedInputStream bin1 = new BufferedInputStream(fin);
            byte[] buffer = new byte[bin1.available()];
            bin1.read(buffer);
            System.out.println("\n" + new String(buffer));
            fin.close();
            bin1.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
