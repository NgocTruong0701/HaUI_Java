package com.company;

import java.util.Scanner;

public class Date {
  private int ngay;
  private int thang;
  private int nam;

  public void Nhap(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap ngay");
    ngay = sc.nextInt();
    System.out.println("Nhap thang");
    thang = sc.nextInt();
    System.out.println("Nhap nam");
    ngay = sc.nextInt();
  }

  public void Xuat(){
    System.out.printf(ngay+"/"+thang+"/nam");
  }
}
