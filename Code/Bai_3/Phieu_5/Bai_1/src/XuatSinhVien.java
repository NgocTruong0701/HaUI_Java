
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ngoct
 */
public class XuatSinhVien {

    static SinhVien[] dsSV;
    static int n;
    
    public static void nhapDS(){
        System.out.println("Nhap so luong sinh vien: ");
        n = new Scanner(System.in).nextInt();
        dsSV = new SinhVien[n];
        System.out.println("Nhap thong tin cac sinh vien:");
        for(int i = 0 ; i < n;i++)
        {
            dsSV[i] = new SinhVien();
            System.out.println("Sinh vien thu " + (i+1));
            dsSV[i].nhap();
        }
    }
    
    public static void xuatDS(){
        System.out.println("Danh sach sinh vien: ");
        SinhVien.inTieuDe();
        for(SinhVien sv : dsSV){
            System.out.println(sv.toString());
        }
    }

    public static void sapXepDS() {
        Comparator<SinhVien> c = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return Double.compare(o1.tinhDiemTB(), o2.tinhDiemTB());
            }
        };
//        c = (SinhVien o1, SinhVien o2) -> {
//            if(o1.tinhDiemTB() > o2.tinhDiemTB())
//                return 1;
//            else if (o1.tinhDiemTB() == o2.tinhDiemTB()) {
//                return 0;
//            }
//            else
//                return -1;
//        };
        ArrayList<SinhVien> dsSX = new ArrayList<>();
        dsSX.addAll(Arrays.asList(dsSV));
        dsSX.sort(c);
        System.out.println("Danh sach sinh vien sau khi da sap xep:");
        SinhVien.inTieuDe();
        for(SinhVien sv : dsSX){
            System.out.println(sv.toString());
        }
    }
    
    public static void timMaxDiemTB(){
        Comparator<SinhVien> c = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return Double.compare(o1.tinhDiemTB(), o2.tinhDiemTB());
            }
        };
        SinhVien sv = Collections.max(Arrays.asList(dsSV), c);
        System.out.println("Thong tin sinh vien co diem TB cao nhat:");
        SinhVien.inTieuDe();
        System.out.println(sv.toString());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int chon = 0;
        do{
            System.out.println("1. Nhap thong tin sinh vien.");
            System.out.println("2. Xuat danh sach sinh vien.");
            System.out.println("3. Sap xep ds sinh vien theo diem TB.");
            System.out.println("4. Tim sinh vien co diem TB cao nhat.");
            System.out.println("5. Thoat.");
            chon = new Scanner(System.in).nextInt();
            switch(chon){
                case 1 :
                    nhapDS();
                    break;
                case 2:
                    xuatDS();
                    break;
                case 3:
                    sapXepDS();
                    break;
                case 4:
                    timMaxDiemTB();
                    break;
            }
        }while(chon != 5);
    }
    
}
