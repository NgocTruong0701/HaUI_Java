package com.company;

import java.util.Scanner;

public class Date {
  private int ngay;
  private int thang;
  private int nam;

  public int getNgay() {
    return ngay;
  }

  public void setNgay(int ngay) {
    this.ngay = ngay;
  }

  public int getThang() {
    return thang;
  }

  public void setThang(int thang) {
    this.thang = thang;
  }

  public int getNam() {
    return nam;
  }

  public void setNam(int nam) {
    this.nam = nam;
  }

  public void Nhap(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap ngay: ");
    ngay = sc.nextInt();
    System.out.println("Nhap thang: ");
    thang= sc.nextInt();
    System.out.println("Nhap nam: ");
    nam = sc.nextInt();

  }

  public void Xuat(){
    System.out.printf(ngay+"/"+thang+"/"+nam);
  }
}
