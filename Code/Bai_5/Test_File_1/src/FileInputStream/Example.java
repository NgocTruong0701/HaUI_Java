/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileInputStream;

import java.io.FileInputStream;

/**
 *
 * @author ngoct
 */
public class Example {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("E:\\Download\\Nam_3_Ki_1\\Java\\Code\\Bai_5\\FileTest.txt");
            //fin.mark(0); // danh dau vi tri hien tai cua con tro
            byte[] buffer = new byte[fin.available()]; // fin.available tra ve so byte san co cua luong nay
            fin.read(buffer);// da doc het file
            //fin.reset(); // reset con tro lai vi tri danh dau de dung while nhung ma FileInputStream khong ho tro mark va reset
            FileInputStream fin1 = new FileInputStream("E:\\Download\\Nam_3_Ki_1\\Java\\Code\\Bai_5\\FileTest.txt"); // tao 1 luong khac
            int i = 0;
            while((i = fin1.read()) != -1){
                System.out.print((char)i);
            }
            fin.close();
            System.out.println("");
            System.out.println(new String(buffer));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
