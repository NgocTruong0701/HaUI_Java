/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_1;

import java.util.Scanner;

/**
 *
 * @author ngoct
 */
public class Main {

    public static void main(String[] args) {
        DonHang dh = new DonHang();
        int luachon = 0;
        do {
            System.out.println("1. Nhap thong tin don hang. ");
            System.out.println("2. Xuat thong tin don hang.");
            System.out.println("3. Sap xep cac mat hang.");
            System.out.println("4. Thoat (hoac phim bat ki khac cac so tren)");
            luachon = new Scanner(System.in).nextInt();
            switch (luachon) {
                case 1:
                    dh.nhapDH();
                    break;
                case 2:
                    dh.xuatDH();
                    break;
                case 3:
                    dh.sapXep();
                    break;
                case 4:
                    return;
            }
        }
        while(luachon != 4);
    }
}
