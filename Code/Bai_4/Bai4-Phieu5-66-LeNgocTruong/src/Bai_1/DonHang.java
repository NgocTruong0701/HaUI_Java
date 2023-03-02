/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ngoct
 */
public class DonHang {
    private String maDH, ngayBan;
    private int soMH;
    private KhachHang kh = new KhachHang();
    private HangHoa[] dsHH;
    private double tongTien = 0;
    private int tongSL = 0;
    
    public void nhapDH(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma don hang:");
        maDH = sc.nextLine();
        System.out.println("Nhap ngay xuat don:");
        ngayBan = sc.nextLine();
        System.out.println("Nhap thong tin khach hang: ");
        kh.nhapKH();
        System.out.println("Nhap so luong hang: ");
        soMH = sc.nextInt();
        sc.nextLine();
        dsHH = new HangHoa[soMH];
        System.out.println("Nhap thong tin cac mat hang: ");
        for(int i = 0 ; i < soMH;i++){
            System.out.println("Mat hang thu " +(i+1));
            dsHH[i] = new HangHoa();
            dsHH[i].nhapH();
        }
        
        tinhTong();
    }
    
    public void tinhTong(){
        for(HangHoa hh : dsHH){
            tongTien += hh.thanhTien();
            tongSL += hh.getSoLuong();
        }
    }
    
    public void xuatDH(){
        System.out.printf("Ma HD: %-20s Ngay ban: %s %n", maDH, ngayBan);
        System.out.println(kh.toString());
        HangHoa.inTieuDe();
        for(HangHoa hh : dsHH){
            hh.xuatH();
        }
        System.out.printf(String.format("%" + 27 +"s %-13d %-13.2f %n","a",tongSL ,tongTien).replace("a", " "));
    }
    
    public void sapXep(){
        Comparator<HangHoa> c = new Comparator<HangHoa>() {
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                int soSanhTen = o1.getTenHang().compareTo(o2.getTenHang());
                if(soSanhTen != 0 )
                    return soSanhTen;
                else
                    return Double.compare(o1.thanhTien(), o2.thanhTien());
            }
        };
        
        Arrays.sort(dsHH, c);
        System.out.println("Hoa don sau khi sap xep mat hang:");
        xuatDH();
    }
}
