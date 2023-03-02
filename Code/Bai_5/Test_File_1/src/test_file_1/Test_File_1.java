/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test_file_1;

import java.io.File;

/**
 *
 * @author ngoct
 */
public class Test_File_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File x = new File("E:\\Download\\Nam_3_Ki_1\\Java\\Code"); // lay doi tuong file
        System.out.println("Ten file: " + x.getName());
        System.out.println("Thu muc: " + x.getParent());
        System.out.println("Thu muc day du: " + x.getPath());
        System.out.println("La file ?: " + x.isFile());
        System.out.println("La thu muc?: " + x.isDirectory());
        System.out.println("Kich co file: " + x.length());
    }
    
}
