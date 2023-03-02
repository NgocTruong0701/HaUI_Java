package com.company;

import java.util.Calendar;
import java.util.Scanner;

public class SanXuat extends NhanVien{
  private int sanPham;

  public void Nhap(){
    super.Nhap();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap so san pham: ");
    sanPham = scanner.nextInt();
  }

  @Override
  public double TinhLuong() {
    Calendar ins = Calendar.getInstance();
    int year = ins.get(Calendar.YEAR);
    return sanPham*10000 + 100000*(1+year*20000);
  }

  public void Xuat(){
    super.Xuat();
    System.out.printf(sanPham+ "    " + TinhLuong());
  }


}
