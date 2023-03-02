/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_Kho;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author ngoct
 */
public class HangThucPham extends Hang {
    private final double VAT = 5 / 100;
    private String ngaySX, ngayHH;

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma hang: ");
        maHang = "";
        do {
            maHang = sc.nextLine();
            if (maHang.isBlank()) {
                System.out.println("Ma hang khong duoc de trong.");
            }
        } while (maHang.isBlank());
        System.out.println("Nhap ten hang: ");
        tenHang = "";
        do {
            tenHang = sc.nextLine();
            if (tenHang.isBlank()) {
                System.out.println("Ten hang khong duoc de trong.");
            }
        } while (tenHang.isBlank());
        tenHang = sc.nextLine();
        System.out.println("Nhap so luong ton: ");
        soLuongTon = -1;
        do {
            soLuongTon = sc.nextInt();
            if (soLuongTon < 0) {
                System.out.println("So luong ton >= 0");
            }
        } while (soLuongTon < 0);
        sc.nextLine();
        System.out.println("Nhap don gia:");
        donGia = 0;
        do {
            donGia = sc.nextDouble();
            if (donGia <= 0) {
                System.out.println("Don gia > 0");
            }
        } while (donGia <= 0);
        sc.nextLine();
        System.out.println("Nhap ngay san xuat:");
        ngaySX = sc.nextLine();
        System.out.println("Nhap ngay het hang: ");
        ngayHH = sc.nextLine();
    }

    static void inTieuDe() {
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %n", "Ma hang", "Ten hang", "SL ton", "Don gia", "Ngay SX", "Ngay HH");
    }

    @Override
    public void xuat() {
        System.out.printf("%-15s %-15s %-15d %-15.2f %-15s %-15s %n", maHang, tenHang, soLuongTon, donGia, ngaySX, ngayHH);
    }

    public boolean danhGia(){
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatTime = currentDateTime.format(formatter);
        if(soLuongTon > 0 || ngayHH.compareTo(formatTime) > 0){
            return false;
        }
        return true;
    }
}
