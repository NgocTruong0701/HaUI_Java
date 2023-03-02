package com.company;

import java.util.Scanner;

public abstract class NhanVien {
  public String hoTen;
  public int nam;
  public int phuCap;

  public NhanVien() {
  }

  public abstract double TinhLuong();

  public void Nhap(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap hoTen: ");
    hoTen = sc.nextLine();
    System.out.println("Nhap nam vao lam: ");
    nam = sc.nextInt();
    System.out.println("Nhap phu cap: ");
    phuCap = sc.nextInt();
  }

  public void Xuat(){
    System.out.printf(hoTen + "  "+ nam + "   "+phuCap+"  ");
  }
}
