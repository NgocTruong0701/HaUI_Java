package com.company;

import java.util.Scanner;

public class NhanVien {
  private String hoDem;
  private String tenNV;
  private Datee ngaySinh = new Datee();
  private Datee ngayVaoLam = new Datee();

  public void Nhap(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap ho dem");
    hoDem = sc.nextLine();
    System.out.println("Nhap ten nhan vien");
    tenNV = sc.nextLine();
    System.out.println("Nhap ngay sinh");
    ngaySinh.Nhap();
    System.out.println("Nhap ngay vao lam");
    ngayVaoLam.Nhap();
  }

  public void Xuat(){
    System.out.println(hoDem + "     "+ tenNV + "     ");
    ngaySinh.Xuat();
    System.out.printf("    ");
    ngayVaoLam.Xuat();
  }
}
