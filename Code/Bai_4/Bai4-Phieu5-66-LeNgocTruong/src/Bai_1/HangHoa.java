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
public class HangHoa {
    private String tenHang;
    private double donGia;
    private int soLuong;

    public int getSoLuong() {
        return soLuong;
    }

    public String getTenHang() {
        return tenHang;
    }

    public double getDonGia() {
        return donGia;
    }
    
    
    
    public void nhapH(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mhap ten hang: ");
        tenHang = sc.nextLine();
        System.out.println("Mhap don gia: ");
        donGia = sc.nextDouble();
        sc.nextLine();
        System.out.println("Mhap so luong: ");
        soLuong = sc.nextInt();
        sc.nextLine();
    }
    
    public double thanhTien(){
        return this.donGia * this.soLuong;
    }
    
    public static void inTieuDe(){
        System.out.printf("%-13s %-13s %-13s %-13s %n","Ten hang", "Don gia", "So luong", "Thanh tien");
    }
    
    public void xuatH(){
        System.out.printf("%-13s %-13.2f %-13d %-13.2f %n", tenHang, donGia, soLuong, thanhTien());
    }
}
