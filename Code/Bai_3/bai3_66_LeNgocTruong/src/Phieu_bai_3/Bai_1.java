/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Phieu_bai_3;

import java.util.Scanner;

/**
 *
 * @author ngoct
 */
abstract class hinhPhang{
    abstract public double tinhChuVi();
    abstract public double tinhDienTich();
    abstract public void nhap();
    abstract public void xuat();
}

class hinhVuong extends hinhPhang{
    private double canh;
    
    @Override
    public void nhap(){
        System.out.println("Nhap kich thuoc canh cua hinh vuong: ");
        canh = new Scanner(System.in).nextDouble();
    }
    
    @Override
    public void xuat(){
        System.out.println("Hinh vuong");
        System.out.printf("%15s %15s %15s %n","Canh", "Chu vi", "Dien tich");
        System.out.println(String.format("%0"+45+"d",0).replace("0","-"));
        System.out.printf("%15.2f %15.2f %15.2f %n",canh, tinhChuVi(), tinhDienTich());
    }
    
    @Override
    public double tinhChuVi() {
        return 4 * canh;
    }

    @Override
    public double tinhDienTich() {
        return Math.pow(canh, 2);
    }  
}

class hinhChuNhat extends hinhPhang{
    private double chieuDai, chieuRong;

    @Override
    public double tinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    @Override
    public double tinhDienTich() {
        return (chieuDai * chieuRong);
    }
    
    @Override
    public void nhap(){
        System.out.println("Nhap kich thuoc chieu dai cua hinh chu nhat: ");
        chieuDai = new Scanner(System.in).nextDouble();
        System.out.println("Nhap kich thuoc chieu rong cua hinh chu nhat: ");
        chieuRong = new Scanner(System.in).nextDouble();
    }
    
    @Override
    public void xuat(){
        System.out.println("Hinh chu nhat:");
        System.out.printf("%15s %15s %15s %15s %n","Chieu dai","Chieu rong", "Chu vi", "Dien tich");
        System.out.println(String.format("%0"+65+"d",0).replace("0","-"));
        System.out.printf("%15.2f %15.2f %15.2f %15.2f %n",chieuDai, chieuRong, tinhChuVi(), tinhDienTich());
    }
}

class hinhTron extends hinhPhang{
    private double banKinh;
    
    @Override
    public double tinhChuVi() {
       return 2 * Math.PI * banKinh;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * Math.pow(banKinh, 2);
    }
    
    @Override
    public void nhap(){
        System.out.println("Nhap kich thuoc ban kinh cua hinh tron: ");
        banKinh = new Scanner(System.in).nextDouble();
    }
    
    @Override
    public void xuat(){
        System.out.println("Hinh tron:");
        System.out.printf("%15s %15s %15s %n","Ban kinh", "Chu vi", "Dien tich");
        System.out.println(String.format("%0"+48+"d",0).replace("0","-"));
        System.out.printf("%15.2f %15.2f %15.2f %n",banKinh, tinhChuVi(), tinhDienTich());
    }
}
public class Bai_1 {
    public static void main(String[] args) {
        hinhPhang hv = new hinhVuong();
        hinhPhang hcn = new hinhChuNhat();
        hinhPhang ht = new hinhTron();
        
        hv.nhap();
        hcn.nhap();
        ht.nhap();
        hv.xuat();
        hcn.xuat();
        ht.xuat();
    }
}
