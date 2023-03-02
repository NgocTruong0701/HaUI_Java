package com.company;

import java.util.Scanner;

public class Mon {
  public String tenMon;
  public int soHocTrinh;
  public String hocKy;

  public void Nhap(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap ten mon");
    tenMon = sc.nextLine();
    System.out.println("Nhap so hoc trinh");
    soHocTrinh = sc.nextInt();
    sc.nextLine();
    System.out.println("Nhap hoc ky");
    hocKy = sc.nextLine();
  }

  public void Xuat(){
    System.out.printf(tenMon + "  " + soHocTrinh + "   " + hocKy + "   ");
  }
}
