/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Phieu_bai_1;

import java.util.Scanner;

/**
 *
 * @author ngoct
 */
public class Xe {
    // Thuoc tinh 
    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private double triGia;
    
    // Phuong thuc
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten chu xe: ");
        tenChuXe = sc.nextLine();
        System.out.println("Nhap loai xe: ");
        loaiXe = sc.nextLine();
        System.out.println("Nhap dung tich xe: ");
        dungTich = sc.nextInt();
        System.out.println("Nhap gia tri cua xe: ");
        triGia = sc.nextDouble();
    }
    
    // Xay dung phuong thuc tinh thue
    public double tinhThue(){
        double thue = 0;
        if(dungTich < 100)
            thue = triGia / 100;
        else if(dungTich < 200)
            thue = triGia * 3/100;
        else 
            thue = triGia * 5/100;
        
        return thue;
    }
    
    // Xay dung phuong thuc in tieu de
    public static void inTieuDe(){
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %n", "Ten chu xe", "Loai xe", "Dung tich", "Gia tri", "Thue phai nop");
    }
    
    // Phuong thuc xuat
    void xuat(){
        System.out.printf("%-15s %-15s %-15d %-15.2f %-15.2f %n", tenChuXe, loaiXe, dungTich, triGia, tinhThue());
    }
}
