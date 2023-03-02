package com.company;

import java.util.Scanner;

public class KhachHangNN extends KhachHang{
  private String quocTich;

  public KhachHangNN() {
  }

  public KhachHangNN(String quocTich) {
    this.quocTich = quocTich;
  }

  public KhachHangNN(String maKH, String hoTen, Date ngayRaHoaDon, int soLuong, int donGia, String quocTich) {
    super(maKH, hoTen, ngayRaHoaDon, soLuong, donGia);
    this.quocTich = quocTich;
  }

  public String getQuocTich() {
    return quocTich;
  }

  public void setQuocTich(String quocTich) {
    this.quocTich = quocTich;
  }

  public void Nhap(){
    super.Nhap();
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap quoc tich");
    quocTich = sc.nextLine();
  }

  public double ThanhTien(){
    return soLuong*donGia;
  }

  public void Xuat(){
    super.Xuat();
    System.out.printf("  " + ThanhTien());
  }
}
