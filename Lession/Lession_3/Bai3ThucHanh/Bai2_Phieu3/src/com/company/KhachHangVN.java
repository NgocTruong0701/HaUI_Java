package com.company;

import java.util.Scanner;

public class KhachHangVN extends KhachHang{
  private String doiTuongKH;
  private int dinhMuc;

  public String getDoiTuongKH() {
    return doiTuongKH;
  }

  public void setDoiTuongKH(String doiTuongKH) {
    this.doiTuongKH = doiTuongKH;
  }

  public int getDinhMuc() {
    return dinhMuc;
  }

  public void setDinhMuc(int dinhMuc) {
    this.dinhMuc = dinhMuc;
  }

  public KhachHangVN() {
  }

  public KhachHangVN(String doiTuongKH, int dinhMuc) {
    this.doiTuongKH = doiTuongKH;
    this.dinhMuc = dinhMuc;
  }

  public KhachHangVN(String maKH, String hoTen, Date ngayRaHoaDon, int soLuong, int donGia, String doiTuongKH, int dinhMuc) {
    super(maKH, hoTen, ngayRaHoaDon, soLuong, donGia);
    this.doiTuongKH = doiTuongKH;
    this.dinhMuc = dinhMuc;
  }

  public void Nhap(){
    super.Nhap();
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap doi tuong kh");
    doiTuongKH=sc.nextLine();
    System.out.println("Nhap dinh muc");
    dinhMuc=sc.nextInt();
  }

    public double ThanhTien(){
      double thanhtien;
      if (soLuong<=dinhMuc){
        thanhtien = soLuong*donGia;
      }else {
        thanhtien =soLuong*donGia*dinhMuc + (soLuong-dinhMuc)*donGia*2.5;
      }
      return thanhtien;
    }

    public void Xuat(){
    super.Xuat();
      System.out.printf(doiTuongKH + "   " + dinhMuc + "   " + ThanhTien());
    }
}
