/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_5;

/**
 *
 * @author ngoct
 */
import java.util.Scanner;

public class Bai_5 {

    public static int UCLN(int a, int b) {
        while (a * b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b; // Khi do a or b = 0;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Nhap so thu nhat: ");
        int a = inputScanner.nextInt();
        System.out.println("Nhap so thu hai: ");
        int b = inputScanner.nextInt();

        System.out.printf("UCLN cua 2 so %d va %d la %d", a, b, UCLN(a, b));
        System.out.println("");
    }

}
