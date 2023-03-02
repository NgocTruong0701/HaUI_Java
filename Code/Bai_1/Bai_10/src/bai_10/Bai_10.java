/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ngoct
 */
public class Bai_10 {

    public static boolean checkNT(int n) {
        int count = 0;
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % 2 == 0) {
                count++;
            }
        }
        if (count == 0) {
            return true;
        }
        return false;
    }

    public static void Xuly(ArrayList<Integer> arrList) {
        ArrayList<Integer> arrListNT = new ArrayList<>();
        ArrayList<Integer> arrayListNonNT = new ArrayList<>();
        for (int number : arrList) {
            if (checkNT(number)) {
                arrListNT.add(number);
            } else {
                arrayListNonNT.add(number);
            }
        }

        arrList.clear();
        Collections.sort(arrListNT);
        arrList.addAll(arrListNT);
        arrList.addAll(arrayListNonNT);
        System.out.print("Mang sau khi sap xep cac so nguyen to len dau: ");
        for (int i : arrList) {
            System.out.print(i + " ");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> arrList = new ArrayList<>();
        System.out.println("Nhap so luong phan tu cua mang: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap cac phan tu thu " + (i + 1));
            arrList.add(new Scanner(System.in).nextInt());
        }

        Xuly(arrList);
    }

}
