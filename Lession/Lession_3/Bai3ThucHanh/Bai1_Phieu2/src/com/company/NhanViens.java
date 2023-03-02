package com.company;

import java.util.Scanner;

public class NhanViens {
  private NhanVien[] nvs;
  private int n;

  public void Nhap(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap n: ");
    n = sc.nextInt();
    sc.nextLine();
    nvs = new NhanVien[n];
    for(int i=0; i<n; i++){
      nvs[i] = new NhanVien();
      nvs[i].Nhap();
    }
  }

  public void Xuat(){
    for (int i=0; i<n; i++){
      nvs[i].Xuat();
    }
  }
}
