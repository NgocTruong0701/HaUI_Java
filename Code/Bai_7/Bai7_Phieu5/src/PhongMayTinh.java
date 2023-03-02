
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lê Ngọc Trường
 */
public class PhongMayTinh extends PhongHoc{
    private int soLuongMayTinh;

    public PhongMayTinh() {
        super();
        soLuongMayTinh = 0;
    }

    public PhongMayTinh(int soLuongMayTinh, int maPhong, String dayNha, double dienTich, int soBongDen) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.soLuongMayTinh = soLuongMayTinh;
    }

    public int getSoLuongMayTinh() {
        return soLuongMayTinh;
    }

    public void setSoLuongMayTinh(int soLuongMayTinh) {
        this.soLuongMayTinh = soLuongMayTinh;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%-15d %-15s",soLuongMayTinh, phongDatChuan() );
    }
    
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong may tinh: ");
        soLuongMayTinh = sc.nextInt();
        sc.nextLine();
    }
    
    public static void inTieuDe(){
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %n", "Ma phong", "Day nha", "Dien tich" , "So bong den", "SL may tinh", "Xep hang");
    }

    @Override
    public String phongDatChuan() {
        return (super.getDienTich() / super.getSoBongDen() >= 10 && (super.getDienTich() / soLuongMayTinh >= 1.5)) ? "Dat chuan" : "Khong dat chuan"; 
    }
}
