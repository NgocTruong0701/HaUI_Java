package com.company;

import java.util.Scanner;

public class HinhTron extends HinhPhang{
  private int r;

  public void Nhap(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap r: ");
    r = sc.nextInt();
  }


  @Override
  void ChuVi() {
    System.out.println("chu vi: " + r*2*Math.PI);
  }

  @Override
  void DienTich() {
    System.out.println("dien tich: "+ r*r*Math.PI);
  }
}
