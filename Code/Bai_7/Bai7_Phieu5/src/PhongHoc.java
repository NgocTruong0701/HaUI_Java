
import java.io.Serializable;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Lê Ngọc Trường
 */
public class PhongHoc implements Serializable{

    private int maPhong;
    private String dayNha;
    private double dienTich;
    private int soBongDen;

    public PhongHoc() {
        maPhong = soBongDen = 0;
        dayNha = null;
        dienTich = 0;
    }

    public PhongHoc(int maPhong, String dayNha, double dienTich, int soBongDen) {
        this.maPhong = maPhong;
        this.dayNha = dayNha;
        this.dienTich = dienTich;
        this.soBongDen = soBongDen;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public String getDayNha() {
        return dayNha;
    }

    public double getDienTich() {
        return dienTich;
    }

    public int getSoBongDen() {
        return soBongDen;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public void setDayNha(String dayNha) {
        this.dayNha = dayNha;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public void setSoBongDen(int soBongDen) {
        this.soBongDen = soBongDen;
    }

    @Override
    public String toString() {
        return String.format("%-15d %-15s %-15.2f %-15d", maPhong, dayNha, dienTich, soBongDen);
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Nhap ma phong: ");
                maPhong = sc.nextInt();
                if (maPhong == 0) {
                    throw new Exception("Ma khong duoc trong");
                }
                break;
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
        sc.nextLine();
        System.out.println("Nhap day nha: ");
        dayNha = sc.nextLine();
        while (true) {
            try {
                System.out.println("Nhap dien tich: ");
                dienTich = sc.nextDouble();
                if (dienTich <= 0) {
                    throw new Exception("Dien tich phai lon hon 0");
                }
                break;
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
        System.out.println("Nhap so luong bong den: ");
        soBongDen = sc.nextInt();
        sc.nextLine();
    }

    public String phongDatChuan() {
        return null;
    }

    ;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.maPhong;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PhongHoc other = (PhongHoc) obj;
        return this.maPhong == other.maPhong;
    }

}
