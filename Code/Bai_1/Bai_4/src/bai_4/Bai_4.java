/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_4;

/**
 *
 * @author ngoct
 */
public class Bai_4 {

    public static float TinhToan(int n, int k) {
        if (k < 1 || k > n) {
            return -1;
        } else {
            int tu = 1;
            int mau = 1;

            for (int i = n; i >= (n - k + 1); i--) {
                tu *= i;
            }
            for (int i = 1; i <= k; i++) {
                mau *= i;
            }

            return (float) tu / mau;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner inpScanner = new java.util.Scanner(System.in);
        System.out.println("Moi nhap so thu nhat: ");
        int n = inpScanner.nextInt();
        System.out.println("Moi nhap so thu hai: ");
        int k = inpScanner.nextInt();

        System.out.println(TinhToan(n, k));
        inpScanner.close();

    }

}
