
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lê Ngọc Trường
 */
public class PhongLyThuyet extends PhongHoc{

    private int soLuongMayChieu;

    public PhongLyThuyet() {
        super();
        soLuongMayChieu = 0;
    }

    public PhongLyThuyet(int soLuongMayChieu, int maPhong, String dayNha, double dienTich, int soBongDen) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.soLuongMayChieu = soLuongMayChieu;
    }

    public int getSoLuongMayChieu() {
        return soLuongMayChieu;
    }

    public void setSoLuongMayChieu(int soLuongMayChieu) {
        this.soLuongMayChieu = soLuongMayChieu;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%-15d %-15s",soLuongMayChieu, phongDatChuan());
    }
    
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong may chieu: ");
        soLuongMayChieu = sc.nextInt();
        sc.nextLine();
    } 
    
    public static void inTieuDe(){
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %n", "Ma phong", "Day nha", "Dien tich" , "So bong den", "SL may chieu", "Xep hang");
    }
    
    @Override
    public String phongDatChuan() {
        return ((super.getDienTich() / super.getSoBongDen() >= 10) && soLuongMayChieu > 0) ? "Dat chuan" : "Khong dat chuan";
    }
    
}
