/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_12;

import java.util.Arrays;

/**
 *
 * @author ngoct
 */
public class Bai_12 {

    public static void multiplyArr(int[][] arr1, int[][] arr2) {
        if (arr1[0].length == arr2.length) {
            int[][] result = new int[arr1.length][arr2[0].length];
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2[0].length; j++) {
                    result[i][j] = 0;
                    for (int k = 0; k < arr2.length; k++) {
                        result[i][j] += (arr1[i][k] * arr2[k][j]);
                    }
                }
            }
            System.out.println("Tich hai ma tran la: " + Arrays.deepToString(result));
        } else {
            System.out.println("Khong the nhan do khong cung kich co hang, cot");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] arr1 = new int[4][3]; // hang cot
        int[][] arr2 = new int[3][2]; // hang cot

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                arr1[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                arr2[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("Ma tran thu nhat: " + Arrays.deepToString(arr1));
        System.out.println("Ma tran thu hai: " + Arrays.deepToString(arr2));

        multiplyArr(arr1, arr2);
    }

}
