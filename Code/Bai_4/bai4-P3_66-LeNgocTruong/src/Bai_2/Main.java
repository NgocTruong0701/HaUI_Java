/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ngoct
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien:");
        int n = sc.nextInt();
        sc.nextLine();
        SinhVien[] dsSV = new SinhVien[n];
        System.out.println("Nhap thong tin sinh vien:");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien thu " + (i + 1));
            dsSV[i] = new SinhVien();
            dsSV[i].nhap();
        }

        System.out.println("Danh sach sinh vien vua nhap:");
        SinhVien.inTieuDe();
        for (SinhVien sv : dsSV) {
            System.out.print(sv.toString());
        }

        // Sap xep theo ten, ten trung se sap theo diem ly thuyet 
        Comparator<SinhVien> c1 = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getHoTen().compareToIgnoreCase(o2.getHoTen()) == 0) {
                    return Double.compare(o1.getDiemLT(), o2.getDiemLT());
                } else {
                    return o1.getHoTen().compareToIgnoreCase(o2.getHoTen());
                }
            }
        };
        Arrays.sort(dsSV, c1);
        /*for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (dsSV[i].getHoTen().compareTo(dsSV[j].getHoTen()) > 0) {
                    SinhVien temp = dsSV[i];
                    dsSV[i] = dsSV[j];
                    dsSV[j] = temp;
                } else if (dsSV[i].getHoTen().compareTo(dsSV[j].getHoTen()) == 0) {
                    if (dsSV[i].getDiemLT() > dsSV[j].getDiemLT()) {
                        SinhVien temp = dsSV[i];
                        dsSV[i] = dsSV[j];
                        dsSV[j] = temp;
                    }
                }
            }
        }
*/
        System.out.println("Danh sach sinh vien sau khi sap xep:");
        SinhVien.inTieuDe();
        for (SinhVien sv : dsSV) {
            System.out.print(sv.toString());
        }

        Comparator<SinhVien> c2 = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return Double.compare(o1.tinhDiemTB(), o2.tinhDiemTB());
            }
        };

        SinhVien svMaxDiemTB = Collections.max(Arrays.asList(dsSV), c2);
        SinhVien svMinDiemTB = Collections.min(Arrays.asList(dsSV), c2);
        System.out.println("Sinh vien co diem trung binh lon nhat: ");
        SinhVien.inTieuDe();
        System.out.println(svMaxDiemTB.toString());
        System.out.println("Sinh vien co diem trung binh nho nhat: ");
        SinhVien.inTieuDe();
        System.out.println(svMinDiemTB.toString());
    }
}
