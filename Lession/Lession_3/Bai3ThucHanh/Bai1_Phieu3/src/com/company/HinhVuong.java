package com.company;

import java.util.Scanner;

public class HinhVuong extends HinhPhang{
  private int canh;

  public void Nhap(){
    System.out.println("Nhap canh: ");
    Scanner sc = new Scanner(System.in);
    canh = sc.nextInt();
  }

  @Override
  void ChuVi() {
    System.out.println("Chu vi : " + canh*4);
  }

  @Override
  void DienTich() {
    System.out.println("Dien tich: " + canh*canh);
  }
}
