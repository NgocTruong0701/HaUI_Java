/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_3;

/**
 *
 * @author ngoct
 */
public class Bai_3 {

    public static int GiaiThua(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Nhap so can tinh: ");
        int n = new java.util.Scanner(System.in).nextInt();
        System.out.println(n + " giai thua la: " + GiaiThua(n));
    }

}
