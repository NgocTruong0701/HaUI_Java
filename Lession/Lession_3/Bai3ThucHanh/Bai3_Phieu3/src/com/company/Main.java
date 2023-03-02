package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nhan vien san xuat");
        int n = scanner.nextInt();
        System.out.println("Nhap so nhan vien van phong");
        int m = scanner.nextInt();

        int tongTien = 0;

        SanXuat[] sanXuats = new SanXuat[n];
        VanPhong[] vanPhongs = new VanPhong[m];
        for (int i=0; i<n; i++){
            sanXuats[i] = new SanXuat();
            sanXuats[i].Nhap();
            tongTien+=sanXuats[i].TinhLuong();
        }
        for (int i=0; i<m; i++){
            vanPhongs[i] = new VanPhong();
            vanPhongs[i].Nhap();
            tongTien+=vanPhongs[i].TinhLuong();
        }

        System.out.println("Tong: " + tongTien);

	// write your code here
    }
}
