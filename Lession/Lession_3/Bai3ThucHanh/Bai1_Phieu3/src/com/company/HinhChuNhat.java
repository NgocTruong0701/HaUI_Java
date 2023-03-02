package com.company;

import java.util.Scanner;

public class HinhChuNhat extends HinhPhang{
  private int chieuDai;
  private int chieuRong;

  public void Nhap(){
    System.out.println("Nhap chieu dai");
    Scanner sc = new Scanner(System.in);
    chieuDai = sc.nextInt();
    System.out.println("Nhap chieu rong");
    chieuRong = sc.nextInt();
  }

  @Override
  void ChuVi() {
    System.out.println("Chu vi: " + (chieuRong+chieuDai)*2);
  }

  @Override
  void DienTich() {
    System.out.println("Dien tich: " + chieuDai*chieuRong);
  }
}
