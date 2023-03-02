/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_11;

import java.util.Arrays;

/**
 *
 * @author ngoct
 */
public class Bai_11 {

    public static boolean checkNT(int n) {
        int count = 0;
        if (n <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                return true;
            }
            return false;
        }
    }

    public static int maxNT(int[][] arr) {
        int max = -1;
        for (int[] row : arr) {
            for (int value : row) {
                if (checkNT(value) && value >= max) {
                    max = value;
                }
            }
        }
        return max;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] array = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("Mang vua nhan:");
        System.out.println(Arrays.deepToString(array));

        int KQ = maxNT(array);
        if (KQ == -1) {
            System.out.println("Mang khong co so nguyen to");
        } else {
            System.out.println("So nguyen to lon nhat trong mang: " + KQ);
        }
    }
}
