package com.company;

import java.util.Scanner;

public class KhachHang {
  public String maKH;
  public String hoTen;
  public Date ngayRaHoaDon = new Date();
  public int soLuong;
  public int donGia;

  public KhachHang() {
  }

  public KhachHang(String maKH, String hoTen, Date ngayRaHoaDon, int soLuong, int donGia) {
    this.maKH = maKH;
    this.hoTen = hoTen;
    this.ngayRaHoaDon = ngayRaHoaDon;
    this.soLuong = soLuong;
    this.donGia = donGia;
  }

  public String getMaKH() {
    return maKH;
  }

  public void setMaKH(String maKH) {
    this.maKH = maKH;
  }

  public String getHoTen() {
    return hoTen;
  }

  public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
  }

  public Date getNgayRaHoaDon() {
    return ngayRaHoaDon;
  }

  public void setNgayRaHoaDon(Date ngayRaHoaDon) {
    this.ngayRaHoaDon = ngayRaHoaDon;
  }

  public int getSoLuong() {
    return soLuong;
  }

  public void setSoLuong(int soLuong) {
    this.soLuong = soLuong;
  }

  public int getDonGia() {
    return donGia;
  }

  public void setDonGia(int donGia) {
    this.donGia = donGia;
  }

  public void Nhap(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap ma khach hang");
    maKH = sc.nextLine();
    System.out.println("Nhap ho ten");
    hoTen = sc.nextLine();
    System.out.println("Nhap ngay ra don");
    ngayRaHoaDon.Nhap();
    System.out.println("Nhap so luong");
    soLuong = sc.nextInt();
    System.out.println("Nhap don gia");
    donGia = sc.nextInt();

  }



  public void Xuat(){
    System.out.printf(maKH + "   " + hoTen + "   ");
    ngayRaHoaDon.Xuat();
    System.out.printf("   " +  "   "+ soLuong + "   " + donGia +"    ");
  }
}
