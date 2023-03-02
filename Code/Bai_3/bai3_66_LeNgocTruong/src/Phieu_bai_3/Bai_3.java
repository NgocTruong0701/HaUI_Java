/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Phieu_bai_3;

import java.util.Calendar;
import java.util.Scanner;
/**
 *
 * @author ngoct
 */
abstract class NhanVien {
  public String hoTen;
  public int nam;
  public int phuCap;

  public NhanVien() {
  }

  public abstract double TinhLuong();

  public void Nhap(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap hoTen: ");
    hoTen = sc.nextLine();
    System.out.println("Nhap nam vao lam: ");
    nam = sc.nextInt();
    System.out.println("Nhap phu cap: ");
    phuCap = sc.nextInt();
  }

  public void Xuat(){
    System.out.printf(hoTen + "  "+ nam + "   "+phuCap+"  ");
  }
}

class SanXuat extends NhanVien{
  private int sanPham;

  @Override
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

  @Override
  public void Xuat(){
    super.Xuat();
    System.out.printf(sanPham+ "    " + TinhLuong());
  }
}

class VanPhong extends NhanVien{
  private int mucLuong;
  private int ngayNghi;

  @Override
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

  @Override
  public void Xuat(){
    super.Xuat();
    System.out.printf(mucLuong + "   "+ ngayNghi+ "    "+TinhLuong());
  }
}

public class Bai_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nhan vien san xuat");
        int n = scanner.nextInt();
        System.out.println("Nhap so nhan vien van phong");
        int m = scanner.nextInt();

        int tongTien = 0;

        SanXuat[] sanXuats = new SanXuat[n];
        VanPhong[] vanPhongs = new VanPhong[m];
        for (int i=0; i<n; i++){
            sanXuats[i] = new SanXuat();
            sanXuats[i].Nhap();
            tongTien+=sanXuats[i].TinhLuong();
        }
        for (int i=0; i<m; i++){
            vanPhongs[i] = new VanPhong();
            vanPhongs[i].Nhap();
            tongTien+=vanPhongs[i].TinhLuong();
        }

        System.out.println("Tong: " + tongTien);

	// write your code here
    }
}
