/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_16;

/**
 *
 * @author ngoct
 */
public class Bai_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Nhap chuoi: ");
        String chuoi = new java.util.Scanner(System.in).nextLine().trim();

        int count = 0;
        if (!Character.isWhitespace(chuoi.charAt(0))) {
            count++;
        }
        for (int i = 1; i < chuoi.length(); i++) {
            // check if current character is not space and previous character is space
            if (Character.isWhitespace(chuoi.charAt(i - 1)) && !Character.isWhitespace(chuoi.charAt(i))) {
                count++;
            }
        }

        System.out.println("Co " + count + " tu trong chuoi");
    }

}
