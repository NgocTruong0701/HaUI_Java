/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Phieu_bai_2;

import java.util.Scanner;

/**
 *
 * @author ngoct
 */
class date{
    private int ngay, thang,nam;
    
    public void nhapDate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay: ");
        ngay = sc.nextInt();
        System.out.println("Nhap thang: ");
        thang = sc.nextInt();
        System.out.println("Nhap nam: ");
        nam = sc.nextInt();
    }
    
    @Override
    public String toString(){
        return ngay + "/" + thang + "/" + nam;
    }
}

class Mon{
    private String tenMon;
    private int soHocTrinh;
    private String hocKy;
    private double diem;

    public double getDiem() {
        return diem;
    }
    
    public void nhapMon(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten mon: ");
        tenMon = sc.nextLine();
        System.out.println("Nhap hoc ki: ");
        hocKy = sc.nextLine();
        System.out.println("Nhap so hoc trinh: ");
        soHocTrinh = sc.nextInt();
        System.out.println("Nhap diem: ");
        diem = sc.nextDouble();
    }
    
    public static void inTieuDeMon(){
        System.out.printf("%-15s %-15s %-15s %-15s %n","Ten mon", "So hoc trinh","Hoc ki","Diem");
        System.out.println(String.format("%0" + 64 +"d",0).replace("0","-"));
    }
    
    public void xuatMon(){
        System.out.printf("%-15s %-15d %-15s %-15.2f %n",tenMon, soHocTrinh, hocKy, diem);
    }
}

class SinhVien{
    private String hoTen;
    private date ngaySinh;
    private int n;
    private Mon[] dsMon;
    
    public void nhapSV(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten sinh vien: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        ngaySinh = new date();
        ngaySinh.nhapDate();
        System.out.println("Nhap so luong mon sinh vien hoc: ");
        n = sc.nextInt();
        System.out.println("Nhap thong tin mon hoc: ");
        dsMon = new Mon[n];
        for(int i = 0 ;i < n;i++){
            System.out.println("Mon thu " + (i+1));
            dsMon[i] = new Mon();
            dsMon[i].nhapMon();
        }
    }
    
    public double tinhDiemTK(){
        double diemTK = 0;
        for(Mon mon : dsMon){
            diemTK += mon.getDiem();
        }
        return diemTK /= n;
    }
    
    public static void inTieuDeSV(){
        System.out.printf("%-15s %-15s %-15s %n","Ho ten","Ngay sinh","Diem tong ket");
        System.out.println(String.format("%0" + 45 +"d",0).replace("0","-"));
    }
    
    public void xuatSV(){
        inTieuDeSV();
        System.out.printf("%-15s %-15s %-15.2f %n",hoTen, ngaySinh.toString(), tinhDiemTK());
        System.out.println("Cac mon sinh vien theo hoc: ");
        Mon.inTieuDeMon();
        for(Mon mon : dsMon){
            mon.xuatMon();
        }
    }
}

public class Bai_2 {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.nhapSV();
        sv.xuatSV();           
    }
}
