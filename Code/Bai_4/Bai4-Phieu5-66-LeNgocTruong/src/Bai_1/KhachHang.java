/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_1;

import java.util.Scanner;

/**
 *
 * @author ngoct
 */
public class KhachHang {
    private String tenKH;
    private String diaChi;

    public KhachHang() {
        tenKH = diaChi = "";
    }

    public KhachHang(String tenKH, String diaChi) {
        this.tenKH = tenKH;
        this.diaChi = diaChi;
    }

    public String getTenKH() {
        return tenKH;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    public void nhapKH(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten khach hang: ");
        tenKH = sc.nextLine();
        System.out.println("Nhap dia chi khac hang: ");
        diaChi = sc.nextLine();
    }
    
    @Override
    public String toString(){
        return String.format("Khach hang: %-15s Dia chi: %s %n", tenKH, diaChi);
    }
}
