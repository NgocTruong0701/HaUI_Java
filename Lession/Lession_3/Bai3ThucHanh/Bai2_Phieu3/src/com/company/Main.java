package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        KhachHangVN[] khachHangVNS = new KhachHangVN[n];
        int m;
        System.out.println("Nhap m: ");
        m = sc.nextInt();
        KhachHangNN[] khachHangNNS = new KhachHangNN[m];

        do{
            System.out.println("1. Nhap khach hang VN");
            System.out.println("2. Nhap khach hang NN");
            System.out.println("3. Xuat khach hang VN");
            System.out.println("4. Xuat khach hang NN");
            System.out.println("5. Tong so luong khach hang VN");
            System.out.println("6. Tong so luong khach hang NN");
            System.out.println("7. Tinh trung binh thanh tien khach hang NN");
            System.out.println("8. Xuat cac hoa don trong thang 9 nam 2013 khach VN");
            System.out.println("9. Xuat cac hoa don trong thang 9 nam 2013 khach NN");
            System.out.println("Nhap lua chon");
            int chon = sc.nextInt();
            switch (chon){
                case 1:
                    for (int i=0; i<n; i++){
                        khachHangVNS[i] = new KhachHangVN();
                        khachHangVNS[i].Nhap();
                    }
                    break;
                case 2:
                    for (int i=0; i<m; i++){
                        khachHangNNS[i] = new KhachHangNN();
                        khachHangNNS[i].Nhap();
                    }
                    break;
                case 3:
                    for (int i=0; i<n; i++){
                        khachHangVNS[i].Xuat();
                    }
                    break;
                case 4:
                    for (int i=0; i<m; i++){
                        khachHangNNS[i].Xuat();
                    }
                    break;
                case 5:
                    int tong1 = 0;
                    for (int i=0; i<n; i++){
                        tong1+=khachHangVNS[i].soLuong;
                    }
                    System.out.println("Tong so luong: " + tong1);
                    break;
                case 6:
                    int tong2 = 0;
                    for (int i=0; i<m; i++){
                        tong2+=khachHangNNS[i].soLuong;
                    }
                    System.out.println("Tong so luong: " + tong2);
                    break;
                case 7:
                    int tongTT = 0;
                    for (int i=0; i<m; i++){
                        tongTT+=khachHangNNS[i].ThanhTien();
                    }
                    System.out.println("Trung binh : " + (double)tongTT/khachHangNNS.length);
                    break;
                case 8:
                    for (int i=0; i<n; i++){
                        if (khachHangVNS[i].ngayRaHoaDon.getThang() == 9 && khachHangVNS[i].ngayRaHoaDon.getNam() == 2013){
                            khachHangVNS[i].Xuat();
                        }
                    }
                    break;
                case 9:
                    for (int i=0; i<m; i++){
                        if (khachHangNNS[i].ngayRaHoaDon.getThang() == 9 && khachHangNNS[i].ngayRaHoaDon.getNam() == 2013){
                            khachHangNNS[i].Xuat();
                        }
                    }
                    break;
            }
        }while(true);
    }
}
