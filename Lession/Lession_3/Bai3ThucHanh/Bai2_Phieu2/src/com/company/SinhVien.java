package com.company;

import java.util.Scanner;

public class SinhVien {
  private String hoTen;
  private Date ngaySinh = new Date();
  private Mon[] mon;
  private int n;
  private float diemThi;

  public void Nhap(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap ho ten");
    hoTen = sc.nextLine();
    System.out.println("Nhap ngay sinh");
    ngaySinh.Nhap();
    System.out.println("Nhap n: ");
    n = sc.nextInt();
    mon = new Mon[n];
    System.out.println("Nhap cac mon hoc");
    for (int i=0; i<n; i++){
      mon[i] = new Mon();
      mon[i].Nhap();
    }
    System.out.println("Nhap diem thi");
    diemThi = sc.nextFloat();
  }

  public void Xuat(){
    System.out.println(hoTen + "  ");
    ngaySinh.Xuat();
    for(int  i= 0; i<n; i++){
      mon[i].Xuat();
    }
    System.out.printf("   "+ diemThi);
  }
}
