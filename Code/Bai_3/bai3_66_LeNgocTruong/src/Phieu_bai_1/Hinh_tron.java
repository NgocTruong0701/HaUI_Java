/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Phieu_bai_1;

import java.util.Random;

/**
 *
 * @author ngoct
 */
public class Hinh_tron {
    private double banKinh, duongKinh;
    
    public double tinhChuVi(){
        return 2*Math.PI*banKinh;
    }
    
    public double tinhDienTich(){
        return Math.PI * Math.pow(banKinh,2);
    }
    
    public static void inTieuDe(){
        System.out.printf("%15s %15s %15s %15s %n","Ban kinh", "Duong kinh", "Chu vi", "Dien tich");
    }
    
    void nhap(){
        banKinh = new Random().nextDouble() + 1;
        duongKinh = banKinh * 2;
    }
    
    void xuat(){
        System.out.printf("%15.1f %15.1f %15.1f %15.1f %n", banKinh, duongKinh, tinhChuVi(), tinhDienTich());
    }
}

class main{
    public static void main(String[] args) {
        Hinh_tron ht = new Hinh_tron();
        ht.nhap();
        ht.inTieuDe();
        ht.xuat();
    }
}