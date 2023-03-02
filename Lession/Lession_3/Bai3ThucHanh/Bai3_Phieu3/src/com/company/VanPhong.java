package com.company;

import java.util.Calendar;
import java.util.Scanner;

public class VanPhong extends NhanVien{
  private int mucLuong;
  private int ngayNghi;

  public void Nhap(){
    super.Nhap();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap muc luong: ");
    mucLuong = scanner.nextInt();
    System.out.println("Nhap ngay nghi: ");
    ngayNghi = scanner.nextInt();
  }

  @Override
  public double TinhLuong() {
    Calendar ins = Calendar.getInstance();
    int year = ins.get(Calendar.YEAR);
    return mucLuong-ngayNghi*1000+ 100000*(1+year*20000);
  }

  public void Xuat(){
    super.Xuat();
    System.out.printf(mucLuong + "   "+ ngayNghi+ "    "+TinhLuong());
  }
}
