/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Phieu_bai_4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ngoct
 */
class date {

    private int ngay, thang, nam;

    public int getThang() {
        return thang;
    }

    public int getNam() {
        return nam;
    }

    void nhapDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ngay: ");
        ngay = scanner.nextInt();
        System.out.println("Nhap thang: ");
        thang = scanner.nextInt();
        System.out.println("Nhap nam: ");
        nam = scanner.nextInt();
    }

    @Override
    public String toString() {
        return ngay + "/" + thang + "/" + nam;
    }
}

abstract class donHang {

    public String maKH;
    public String hoTen;
    public date ngayXD;
    public int soLuong;
    public double donGia;

    public void nhap() {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ma KH: ");
        maKH = s.nextLine();
        System.out.println("Nhap ho ten KH: ");
        hoTen = s.nextLine();
        System.out.println("Nhap ngay xuat don: ");
        ngayXD = new date();
        ngayXD.nhapDate();
        System.out.println("Nhap so luong dien dung: ");
        soLuong = s.nextInt();
        System.out.println("Nhap don gia: ");
        donGia = s.nextDouble();
    }

    abstract public double thanhTien();

    abstract public void xuat();
}

class khachHangVN extends donHang {

    private String doiTuongKH;
    private int dinhMuc;

    @Override
    public double thanhTien() {
        double thanhtien = 0;
        if (soLuong <= dinhMuc) {
            thanhtien = soLuong * donGia;
        } else {
            thanhtien = soLuong * donGia * dinhMuc + (soLuong - dinhMuc) * donGia * 2.5;
        }
        return thanhtien;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap doi tuong khach hang:");
        doiTuongKH = s.nextLine();
        System.out.println("Nhap dinh muc:");
        dinhMuc = s.nextInt();
    }

    public static void inTieuDe() {
        System.out.printf("%15s %15s %15s %15s %15s %15s %15s %15s %n", "Ma KH", "Ten KH", "Ngay suat don", "So luong", "Don gia", "Doi tuong KH", "Dinh muc", "Thanh tien");
    }

    @Override
    public void xuat() {
        System.out.printf("%15s %15s %15s %15d %15.2f %15s %15d %15.2f %n", maKH, hoTen, ngayXD.toString(), soLuong, donGia, doiTuongKH, dinhMuc, thanhTien());
    }
}

class khachHangNN extends donHang {

    private String quocTich;

    @Override
    public double thanhTien() {
        return soLuong * donGia;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap quoc tich:");
        quocTich = s.nextLine();
    }

    public static void inTieuDe() {
        System.out.printf("%15s %15s %15s %15s %15s %15s %15s %n", "Ma KH", "Ten KH", "Ngay suat don", "Quoc tich", "So luong", "Don gia", "Thanh tien");
    }

    @Override
    public void xuat() {
        System.out.printf("%15s %15s %15s %15s %15d %15.2f %15.2f %n", maKH, hoTen, ngayXD.toString(), quocTich, soLuong, donGia, thanhTien());
    }
}

public class Bai_2 {

    public static void main(String[] args) {
        ArrayList<donHang> dsDH = new ArrayList<donHang>();
        int chon = 0;
        int slVN = 0;
        int slNN = 0;
        do {
            System.out.println("1. Nhap thong tin don hang.");
            System.out.println("2. Hien thi thong ke don hang.");
            System.out.println("3. Thong ke so luong loai khach hang.");
            System.out.println("4. Tinh trung binh tien cua khach hang nuoc ngoai.");
            System.out.println("5. Xuat hoa don trong thang 9 nam 2013.");
            System.out.println("6. Thoat.");
            System.out.println("Moi nhap lua chon.");
            chon = new Scanner(System.in).nextInt();
            switch (chon) {
                case 1:
                    int chonKH = 0;
                    System.out.println("Ban muon nhap hoa don cho khach hang nao(1. Viet Nam / 2. Nuoc ngoai):");
                    chonKH = new Scanner(System.in).nextInt();
                    if (chonKH == 1) {
                        donHang kh = new khachHangVN();
                        kh.nhap();
                        dsDH.add(kh);
                    } else {
                        donHang kh = new khachHangNN();
                        kh.nhap();
                        dsDH.add(kh);
                    }
                    break;
                case 2:
                    System.out.println("Hoa don khach hang Viet Nam: ");
                    khachHangVN.inTieuDe();
                    for (donHang dh : dsDH) {
                        if (dh instanceof khachHangVN) { // instanceof de kiem tra dh ay co phai la the hien (instance) cua 1 constructor khachHangVN khong vi trong dsHD co ca KHVN lan KHNN
                            ((khachHangVN) dh).xuat(); // su dung downcasting (ep kieu xuong) de ep kieu dh dang tu donHang ve khachHangVN va goi phuong thuc xuat
                        }
                        /*Với việc sử dụng instanceof và downcasting, mã đang đảm bảo rằng chỉ các đối tượng khachHangNN mới được gọi phương thức xuat()
                        và không có lỗi xảy ra khi gọi phương thức trên đối tượng không hợp lệ.*/
                    }
                    System.out.println("Hoa don khach hang nuoc ngoai: ");
                    khachHangNN.inTieuDe();
                    for (donHang dh : dsDH) {
                        if (dh instanceof khachHangNN) {
                            ((khachHangNN) dh).xuat();
                        }
                    }
                    break;
                case 3:
                    for (donHang dh : dsDH) {
                        if (dh instanceof khachHangVN) {
                            slVN++;
                        } else {
                            slNN++;
                        }
                    }
                    System.out.println("Tong so luong khach hang Viet Nam: " + slVN);
                    System.out.println("Tong so luong khach hang nuoc ngoai: " + slNN);
                    break;
                case 4:
                    double ttNN = 0;
                    for (donHang dh : dsDH) {
                        if (dh instanceof khachHangNN) {
                            ttNN += dh.thanhTien();
                        }
                    }
                    System.out.println("Trung binh thanh tien cua don hang khach hang nuoc ngoai: " +(ttNN / slNN));
                    break;
                case 5:
                    System.out.println("Hoa don trong thang 9 nam 2013: ");
                    for (donHang dh : dsDH) {
                        if (dh.ngayXD.getThang() == 9 && dh.ngayXD.getNam() == 2013) {
                            dh.xuat();
                        }
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.exit(0);
                    break;
            }
        }
        while(chon != 6);   
    }

}
