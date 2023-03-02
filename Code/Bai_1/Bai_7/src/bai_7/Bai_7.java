/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_7;

/**
 *
 * @author ngoct
 */
import java.util.Scanner;

public class Bai_7 {

    public static int arrSearch(int[] arr, int n, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (arr[mid] == n) {
            return mid;
        }
        if (arr[mid] > n) {
            return arrSearch(arr, n, left, mid - 1);
        }
        return arrSearch(arr, n, mid + 1, right);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Nhap so can tim: ");
        int n = new Scanner(System.in).nextInt();
        int check = arrSearch(arr, n, 0, arr.length - 1);
        if (check == -1) {
            System.out.println("Khong ton tai " + n);
        } else {
            System.out.println("Vi tri cua " + n + " trong mang la: " + (check + 1));
        }
    }
}
