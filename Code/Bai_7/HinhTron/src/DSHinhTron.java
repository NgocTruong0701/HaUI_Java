
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Lê Ngọc Trường
 */
public class DSHinhTron {

    static ArrayList<HinhTron> dsHinhTron = new ArrayList<HinhTron>();

    public static void themHinhTron() {
        System.out.println("Nhap thong tin hinh tron: ");
        System.out.println("Nhap ban kinh hinh tron: ");
        HinhTron ht = new HinhTron();
        Scanner sc = new Scanner(System.in);
        
        ht.setBanKinh(sc.nextDouble());

        dsHinhTron.add(ht);
        System.out.println("Them thanh cong!!");
    }

    public static int layKichThuoc() { // lay so luong hinh tron trong danh sach
        return dsHinhTron.size();
    }

    public static HinhTron layHinhTron() {
        System.out.println("Nhap vi tri muon lay hinh tron: ");
        int i = new Scanner(System.in).nextInt();
        return dsHinhTron.get(i - 1);
    }

    public static double tongDienTich() {
        Iterator<HinhTron> iterator = dsHinhTron.iterator();
        double sum = 0;
        while (iterator.hasNext()) {
            sum += iterator.next().tinhDienTich();
        }

        return sum;
    }

    public static HinhTron maxArea() {
        Comparator<HinhTron> c = new Comparator<HinhTron>() {
            @Override
            public int compare(HinhTron o1, HinhTron o2) {
                return Double.compare(o1.tinhDienTich(), o2.tinhDienTich());
            }
        };

        return Collections.max(dsHinhTron, c);
    }

    public static HinhTron minArea() {
        Comparator<HinhTron> c = new Comparator<HinhTron>() {
            @Override
            public int compare(HinhTron o1, HinhTron o2) {
                return Double.compare(o1.tinhDienTich(), o2.tinhDienTich());
            }
        };

        return Collections.min(dsHinhTron, c);
    }

    public static void xuatThongTin() {
        Iterator<HinhTron> iterator = dsHinhTron.iterator();
        System.out.println("Danh sach hinh tron: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
    
    public static void ghiFile(){
        File f = new File();
        f.ghiFIle(dsHinhTron);
        System.out.println("Ghi thanh cong");
    }
    
    public static void docFile(){
        File f = new File();
        dsHinhTron = (ArrayList<HinhTron>)f.docFile();
        Iterator<HinhTron> iterator = dsHinhTron.iterator();
        System.out.println("Danh sach trong file: ");
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }

    public static void main(String[] args) {
        int luachon = -1;
        do {
            System.out.println("1. Them 1 hinh tron moi.");
            System.out.println("2. Lay so luong hinh tron.");
            System.out.println("3. Tim hinh tron.");
            System.out.println("4. Tong dien tich cac hinh tron.");
            System.out.println("5. Tim hinh tron dien tich lon nhat.");
            System.out.println("6. Tim hinh tron dien tich be nhat.");
            System.out.println("7. Xuat thong tin");
            System.out.println("8. Ghi vao file");
            System.out.println("9. Doc file");
            System.out.println("10. Thoat");
            System.out.println("=====Nhap lua chon=====");
            luachon = new Scanner(System.in).nextInt();
            switch (luachon) {
                case 1:
                    themHinhTron();
                    break;
                case 2:
                    System.out.println("So luong hinh tron: " + layKichThuoc());
                    break;
                case 3:
                    System.out.println(layHinhTron().toString());
                    break;
                case 4:
                    System.out.println("Tong dien tich cac hinh tron: " + tongDienTich());
                    break;
                case 5:
                    System.out.println("Hinh tron co dien tich lon nhat: " + maxArea().toString());
                    break;
                case 6:
                    System.out.println("Hinh tron co dien tich lon nhat: " + minArea().toString());
                    break;
                case 7:
                    xuatThongTin();
                    break;
                case 8:
                    ghiFile();
                    break;
                case 9:
                    docFile();
                    break;
                case 10:
                    System.out.println("Bye");
                    return;
                default:
                    throw new AssertionError();
            }
        } while (luachon != 10);
    }
}
