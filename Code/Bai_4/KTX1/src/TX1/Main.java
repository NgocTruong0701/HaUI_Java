/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TX1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ngoct
 */
public class Main {
    static int n;
    static ThueBaoTheoDungLuong[] dsTB;
    
    public static void nhapDS(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong thue bao: ");
        n = sc.nextInt();
        sc.nextLine();
        
        dsTB = new ThueBaoTheoDungLuong[n];
        System.out.println("Nhap thong tin cac thue bao:");
        for(int i = 0 ; i < n;i++){
            System.out.println("Thue bao thu " + (i+1));
            dsTB[i] = new ThueBaoTheoDungLuong();
            dsTB[i].nhap();
        }
    }
    
    public static void inDS(){
        ThueBaoTheoDungLuong.inTieuDe();
        for(ThueBaoTheoDungLuong tb : dsTB){
            tb.xuat();
        }
    }
    
    public static void sapXep(){
        Comparator<ThueBaoTheoDungLuong> c = new Comparator<ThueBaoTheoDungLuong>() {
            @Override
            public int compare(ThueBaoTheoDungLuong o1, ThueBaoTheoDungLuong o2) {
                return o1.getMaTB().compareTo(o2.getMaTB());
            }
        };
         
        Arrays.sort(dsTB,c);
        System.out.println("DS thue bao sau khi sap xep:" );
        inDS();
    }
    
    public static void timTB(){
        System.out.println("Nhap ma thue bao can tim: ");
        String maTB = new Scanner(System.in).nextLine();
        
        for(ThueBaoTheoDungLuong tb : dsTB){
            if(tb.getMaTB().equals(maTB)){
                System.out.println("Thue bao co ma can tim: ");
                ThueBaoTheoDungLuong.inTieuDe();
                tb.xuat();
                return;
            }
        }
        System.out.println("Khong tim thay thue bao co ma can tim.");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luachon = 0;
        
        do{
            System.out.println("1. Nhap danh sach cac thue bao.");
            System.out.println("2. Xuat danh sach cac thue bao.");
            System.out.println("3. Sap xep danh sach theo chieu tang dan cua ma thue bao.");
            System.out.println("4. Tim kiem thue bao.");
            System.out.println("5. Thoat.");
            luachon = sc.nextInt();
            sc.nextLine();
            switch(luachon){
                case 1:
                    nhapDS();
                    break;
                case 2:
                    inDS();
                    break;
                case 3:
                    sapXep();
                    break;
                case 4:
                    timTB();
                    break;
                case 5:
                    return;
            }
        }
        while(luachon != 5);
    }
}
