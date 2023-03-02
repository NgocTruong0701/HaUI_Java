
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lê Ngọc Trường
 */
public class PhongThiNghiem extends PhongHoc{
    private String thongTinCN;
    private int soLuongChua;
    private int soLuongBonRua;

    public PhongThiNghiem() {
        super();
        thongTinCN = null;
        soLuongBonRua = soLuongChua = 0;
    }

    public PhongThiNghiem(String thongTinCN, int soLuongChua, int soLuongBonRua, int maPhong, String dayNha, double dienTich, int soBongDen) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.thongTinCN = thongTinCN;
        this.soLuongChua = soLuongChua;
        this.soLuongBonRua = soLuongBonRua;
    }

    public String getThongTinCN() {
        return thongTinCN;
    }

    public int getSoLuongChua() {
        return soLuongChua;
    }

    public int getSoLuongBonRua() {
        return soLuongBonRua;
    }

    public void setThongTinCN(String thongTinCN) {
        this.thongTinCN = thongTinCN;
    }

    public void setSoLuongChua(int soLuongChua) {
        this.soLuongChua = soLuongChua;
    }

    public void setSoLuongBonRua(int soLuongBonRua) {
        this.soLuongBonRua = soLuongBonRua;
    }
    

    public static void inTieuDe() {
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %n", "Ma phong", "Day nha", "Dien tich" , "So bong den", "Chuyen nganh" , "SL chua" , "SoL bon rua", "Xep hang");
    }

    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin chuyen nganh: ");
        thongTinCN = sc.nextLine();
        System.out.println("Nhap so luong chua cua phong: ");
        soLuongChua = sc.nextInt();
        System.out.println("Nhap so luong bon rua cua phong: ");
        soLuongBonRua = sc.nextInt();
        sc.nextLine();
    }
    
    @Override
    public String phongDatChuan() {
        return (super.getDienTich() / super.getSoBongDen() >= 10 && soLuongBonRua > 0) ? "Dat chuan" : "Khong dat chuan";
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%-15s %-15d %-15d %-15s", thongTinCN, soLuongChua, soLuongBonRua, phongDatChuan());
    }
    
    
}
