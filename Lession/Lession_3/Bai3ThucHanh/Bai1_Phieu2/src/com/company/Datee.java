package com.company;

import java.util.Scanner;

public class Datee {
  private int ngay;
  private int thang;
  private int nam;

  public Datee() {
  }

  public Datee(int ngay, int thang, int nam) {
    this.ngay = ngay;
    this.thang = thang;
    this.nam = nam;
  }

  public void Nhap() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap nam: ");
    nam = scanner.nextInt();
    System.out.println("Nhap thang: ");
    do {
      thang = scanner.nextInt();
    } while (thang < 1 || thang > 12);

    if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
      do {
        System.out.println("Nhap ngay: ");
        ngay = scanner.nextInt();
      } while (ngay > 31 || ngay <1);
    }
    if (thang == 2) {
      do {
        System.out.println("Nhap ngay: ");
        ngay = scanner.nextInt();
      } while (ngay > 28 || ngay<1);
    }
    if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
      do {
        System.out.println("Nhap ngay: ");
        ngay = scanner.nextInt();
      } while (ngay >30 || ngay<1);
    }
  }

  public void Xuat(){
    System.out.printf(ngay+"/"+thang+"/"+nam);
  }
}
