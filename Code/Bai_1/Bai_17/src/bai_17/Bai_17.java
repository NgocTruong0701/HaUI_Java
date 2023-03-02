/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_17;

import java.util.Scanner;

/**
 *
 * @author ngoct
 */
public class Bai_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Nhap chuoi:");
        String chuoi = new Scanner(System.in).nextLine();
        StringBuilder sb = new StringBuilder();
        if (!Character.isWhitespace(chuoi.charAt(0))) {
            char c = chuoi.charAt(0);
            sb.append(Character.toUpperCase(c));
        }
        for (int i = 1; i < chuoi.length(); i++) {
            char c = chuoi.charAt(i);
            if (Character.isWhitespace(chuoi.charAt(i - 1)) && !Character.isWhitespace(chuoi.charAt(i))) {
                sb.append(Character.toUpperCase(c));
                continue;
            }
            sb.append(c);
        }

        System.out.println("Chuoi sau khi viết hoa ký tự đầu: " + sb.toString());
    }

}
