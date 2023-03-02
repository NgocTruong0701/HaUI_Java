/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_2;

import java.util.Scanner;

/**
 *
 * @author ngoct
 */
public class SinhVien {

    private String maSV, hoTen;
    private double diemLT, diemTH;

    public SinhVien() {
        maSV = hoTen = "";
        diemLT = diemTH = 0;
    }

    public SinhVien(String maNV, String hoTen, double diemLT, double diemTH) {
        this.maSV = maNV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getDiemLT() {
        return diemLT;
    }

    public double getDiemTH() {
        return diemTH;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiemLT(double diemLT) {
        this.diemLT = diemLT;
    }

    public void setDiemTH(double diemTH) {
        this.diemTH = diemTH;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma SV:");
        maSV = sc.nextLine();
        System.out.println("Nhap ho ten:");
        hoTen = sc.nextLine();
        System.out.println("Nhap diem ly thuyet:");
        diemLT = sc.nextDouble();
        System.out.println("Nhap diem thuc hanh:");
        diemTH = sc.nextDouble();
        sc.nextLine();
    }
    
    public double tinhDiemTB(){
        return (diemLT + diemTH) / 2;
    }
    
    public String ketQua(){
        return this.tinhDiemTB() >= 5 ? "Dau" : "Rot";
    }
    
    @Override
    public String toString(){
        return String.format("%-15s %-15s %-15.2f %-15.2f %-15.2f %-15s %n", maSV, hoTen, diemLT, diemTH, tinhDiemTB(),ketQua());
    }
    
    static void inTieuDe(){
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %n","Ma SV", "Ho ten","Diem LT", "Diem TH", "Diem TB", "Ket qua");
    }
}
