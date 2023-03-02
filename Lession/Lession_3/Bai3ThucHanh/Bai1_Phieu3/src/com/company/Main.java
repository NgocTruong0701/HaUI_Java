package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HinhVuong hv = new HinhVuong();
        hv.Nhap();
        hv.ChuVi();
        hv.DienTich();

        HinhChuNhat hcn = new HinhChuNhat();
        hcn.Nhap();
        hcn.ChuVi();
        hcn.DienTich();


        HinhTron ht = new HinhTron();
        ht.Nhap();
        ht.ChuVi();
        ht.DienTich();
    }
}
