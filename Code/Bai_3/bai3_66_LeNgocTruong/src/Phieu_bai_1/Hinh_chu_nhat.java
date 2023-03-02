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
public class Hinh_chu_nhat {

    private double chieuDai, chieuRong;

    public double tinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    public void nhap() {
        chieuDai = Math.random() + 1;
        chieuRong = new Random().nextDouble() + 1;
    }

    public static void inTieuDe() {
        System.out.printf("%15s %15s %15s %15s %n", "Chieu dai", "Chieu rong", "Chu vi", "Dien tich");
    }

    public void xuat() {
        System.out.printf("%15.1f %15.1f %15.1f %15.1f %n", chieuDai, chieuRong, tinhChuVi(), tinhDienTich());
    }
    
    public static void main(String[] args) {
        Hinh_chu_nhat hcn = new Hinh_chu_nhat();
        hcn.nhap();
        inTieuDe();
        hcn.xuat();
    }
}
