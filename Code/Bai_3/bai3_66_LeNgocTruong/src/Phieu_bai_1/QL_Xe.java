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
public class QL_Xe {
    // Khai bao mang doi tuong xe
    static Xe[] dsXe;
    static int n;
    
    static void nhapDS(){
        System.out.println("Nhap so luong xe: ");
        n = new Scanner(System.in).nextInt();
        
        // Xin cap phat mang
        dsXe = new Xe[n];
        for(int i = 0 ;i < n;i++){
            // Xin cap phat cho phan tu mang thu i
            dsXe[i] = new Xe();
            dsXe[i].nhap();
        }
    }
    
    // In danh sach xe
    static void xuatDS(){
        // in tieu de
        Xe.inTieuDe();
        for(int i = 0 ; i < 78;i++){
            System.out.print("-");
        }
        System.out.println("");
        for(Xe xe : dsXe){
            xe.xuat();
        }
    }
    
    public static void main(String[] args) {
        int chon = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1. Nhap thong tin xe");
            System.out.println("2. Xuat bang thong ke thong tin xe");
            System.out.println("3. Thoat");
            System.out.print("Moi nhap lua chon: ");
            chon = sc.nextInt();
            switch(chon){
                case 1: 
                  nhapDS();
                  break;
                case 2:
                    xuatDS();
                    break;
                case 3:
                    System.exit(0);
                    break;  
            }
        }
        while(chon != 3);
    }
}
