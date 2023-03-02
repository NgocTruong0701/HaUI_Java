
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ngoct
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Nhap chuoi: ");
        String input = new Scanner(System.in).nextLine();
        int[] charCount = new int[256];
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            charCount[c]++;
        }
        System.out.println("So luong cac ki tu: ");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 0 && (char)i != ' ' ) {
                System.out.println((char) i + ": " + charCount[i]);
            }
        }
        
    }
    
}
