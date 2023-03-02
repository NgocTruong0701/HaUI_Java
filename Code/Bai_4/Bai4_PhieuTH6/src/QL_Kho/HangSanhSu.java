/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_Kho;

import java.util.Scanner;

/**
 *
 * @author ngoct
 */
public class HangSanhSu extends Hang{
    private String NXS, ngayNhap;
    private final double VAT = 10/100;

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
        do{
            donGia = sc.nextDouble();
            if(donGia <= 0){
                System.out.println("Don gia > 0");
            }
        }while(donGia <= 0);
        sc.nextLine();
        System.out.println("Nhap nha san xuat:");
        NXS = sc.nextLine();
        System.out.println("Nhap ngay nhap hang: ");
        ngayNhap = sc.nextLine();
    }
    
    static void inTieuDe(){
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %n", "Ma hang", "Ten hang", "SL ton", "Don gia", "Nha SX", "Ngay nhap");
    }

    @Override
    public void xuat() {
        System.out.printf("%-15s %-15s %-15d %-15.2f %-15s %-15s %n", maHang, tenHang, soLuongTon, donGia, NXS, ngayNhap);
    }
    
    public boolean danhGia(){
        if(soLuongTon > 50){
            return false;
        }
        return true;
    }
}
