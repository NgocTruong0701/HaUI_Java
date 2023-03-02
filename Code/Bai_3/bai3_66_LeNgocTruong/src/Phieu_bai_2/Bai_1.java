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
class Date {

    private int day, month, year;

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isValidDate(int day, int month, int year) {
        if (month < 1 || month > 12) {
            return false;
        }
        int dayInMonth = 31;
        switch (month) {
            case 2:
                if (((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))) {
                    dayInMonth = 29;
                } else {
                    dayInMonth = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayInMonth = 30;
                break;
            default:
                break;
        }
        return (day >=1) && (day <= dayInMonth);
    }

    public void setDate(int day, int month, int year) {
        if(isValidDate(day, month, year)){
            this.day = day;
            this.month = month;
            this.year = year;
        }
        else{
            System.out.println("Invalid date");
        }
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}

class nhanVien {

    private String hoDem;
    private String ten;
    private Date ngaySinh = new Date();
    private Date ngayVaoLam = new Date();

    void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho va ten dem: ");
        hoDem = sc.nextLine();
        System.out.println("Nhap ten: ");
        ten = sc.nextLine();
        System.out.println("Nhap ngay sinh (dd/mm/yyyy): ");
        int bday = sc.nextInt();
        int bmonth = sc.nextInt();
        int byear = sc.nextInt();
        ngaySinh.setDate(bday, bmonth, byear);
        System.out.println("Nhap ngay vao lam (dd/mm/yyyy): ");
        int hday = sc.nextInt();
        int hmonth = sc.nextInt();
        int hyear = sc.nextInt();
        ngayVaoLam.setDate(hday, hmonth, hyear);
    }
    
    public static void inTieuDe(){
        System.out.printf("%-15s %-15s %-15s %-15s %n","Ho va ten dem","Ten","Ngay sinh","Ngay vao lam");
        System.out.println(String.format("%0" + 64 +"d",0).replace("0","-"));
    }

    public void xuat(){
        System.out.printf("%-15s %-15s %-15s %-15s %n",hoDem, ten, ngaySinh.toString(), ngayVaoLam.toString());
    }
}

public class Bai_1 {
    static nhanVien[] dsNV;
    static int n;
    
    public static void nhapDS(){
        System.out.println("Nhap so luong nhan vien: ");
        n = new Scanner(System.in).nextInt();
        dsNV = new nhanVien[n];
        for(int i = 0 ;i < n;i++){
            System.out.println("Nhap thong tin nhan vien thu " + (i+1));
            dsNV[i] = new nhanVien();
            dsNV[i].nhap();
        }
    }
    
    public static void xuatDS(){
        nhanVien.inTieuDe();
        for(nhanVien nv : dsNV){
            nv.xuat();
        }
    }
    
    public static void main(String[] args) {
        nhapDS();
        xuatDS();
    }
}
