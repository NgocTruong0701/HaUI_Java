/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLPhongThi;

import java.util.Scanner;

/**
 *
 * @author IT Supporter
 */
public class QuanLyPhongThi {

    //khai báo các thuộc tính tổng thể quan trọng
    private static PhongThi phongthi = null;
    static String fileName = "E:\\HaUI\\Nam_3_Ki_1\\Java\\Code\\Bai_7\\ThiSinh.txt";
    private static DBEngine db = new DBEngine();

    //Xây dựng menu
    static void menu() {
        System.out.println("================================");
        System.out.println("1. Thêm Thí sinh mới");
        System.out.println("2. Hiệu chỉnh thông tin thí sinh");
        System.out.println("3. Xóa thí sinh khỏi phòng thi");
        System.out.println("4. Lấy thông tin Thí sinh khi biết số báo danh.");
        System.out.println("5. Lấy thông tin Thí sinh khi biết số thứ tự.");
        System.out.println("6. In danh sách thí sinh");
        System.out.println("7. Lưu phòng thi xuống file");
        System.out.println("8. Đọc thông tin phòng từ từ file");
        System.out.println("9. Sap xep thi sinh theo diem");
        System.out.println("10. Thoat");
        System.out.println("******************");
        System.out.print("\t**Chọn lựa của bạn? <1->9>:");
    }

    //thêm thí sinh vào phòng thi
    static void themTS() {
        ThiSinh ts = new ThiSinh();
        if (ts.nhap()) {
            if (phongthi.themThiSinh(ts)) {
                System.out.println("Thêm thành công");
            } else {
                System.out.println("Không thêm được.");
            }
        }
        else{
            System.out.println("Nhap sai yeu cau.");
        }
    }

    //xóa thí sinh khỏi phòng thi.
    static void xoaTS() {
        Scanner input = new Scanner(System.in);
        System.out.print("\tNhập số báo danh cần xóa:");
        String soBD = input.nextLine();
        //input.nextLine();// dua con tro xuong dong tiep, tranh lay ki ty enter
        if (phongthi.xoaThisinh(soBD)) {
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Không xóa được!");
        }
    }

    //sửa thông tin thí sinh
    static void suaTTTS() {
        Scanner input = new Scanner(System.in);
        System.out.print("\tNhập số báo danh cần sửa:");
        String soBD = input.nextLine();
        ThiSinh newTS = new ThiSinh();
        newTS.nhap();
        if (phongthi.suaThongtinTS(soBD, newTS)) {
            System.out.println("Sửa thành công");
        } else {
            System.out.println("Không sửa được!");
        }
    }

    //lấy thông tin thí sinh qua chỉ số
    static void layTTTS_chiso() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số thứ tự cần lấy thông tin:");
        int stt = input.nextInt();
        ThiSinh ts = phongthi.layThongtinTS(stt+1);
        if (ts == null) {
            System.out.println("không có");
        } else {
            System.out.println(ts);
        }
    }

    //lấy thông tin thí sinh qua số báo danh
    static void layTTTS_soBD() {
        Scanner input = new Scanner(System.in);
        System.out.print("\tNhập số báo danh cần lấy thông tin:");
        String soBD = input.nextLine();
        ThiSinh ts = phongthi.layThongtinTS(soBD);
        System.out.println("~~~~~~~~~~Kết quả~~~~~~~~~~~~~~");
        if (ts == null) {
            System.out.println("Không có");
        } else {
            System.out.println(ts);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    //in danh sách thí sinh
    static void inDanhsachTS() {
        System.out.println("==========DANH SÁCH THÍ SINH=========");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %n", "So BD", "Ho ten", "Diem toan", "Diem ly", "Diem hoa", "Tong diem");
        for (int i = 0; i < phongthi.soThisinh(); i++) {
            ThiSinh ts = phongthi.layThongtinTS(i);
            System.out.println(ts);
        }
        System.out.println("=====================================");
    }

//luu phòng thi vào file
    public static void luuFile() {
        try {
            db.luuFile(fileName, phongthi);
            System.out.println("Lưu file thành công");
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

//đọc file lưu trở lại phòng thi
    public static void docFile() {
        try {
            phongthi = (PhongThi)db.docFile(fileName);
        } catch (Exception ex) {
            System.out.println("không đọc được file");
        }
    }

    // Sap xep thi sinh theo diem, neu trung diem thi sap xep theo diem toan
    public static void SapXepDSTS() {
        phongthi.SapXepTS();
        System.out.println("Sap xep thanh cong");
    }

    public static void nhapPhong() {
        phongthi = new PhongThi();
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Nhap ma phong thi: ");
                phongthi.setMsPT(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Co loi: " + e.toString());
            }
        }
        System.out.println("Nhap dia chi: ");
        phongthi.setDiachiPT(sc.nextLine());
        while (true) {
            try {
                System.out.println("Nhap so luong thi sinh(23 - 45): ");
                phongthi.setLuongTS(sc.nextInt());
                break;
            } catch (Exception e) {
                System.out.println("Co loi: " + e.toString());
            }
        }
    }

    // hàm main
    public static void main(String[] args) {
        System.out.println("*****QUẢN LÝ PHÒNG THI*****");
        //==================================
        phongthi = new PhongThi();
        System.out.println("Nhap thong tin phong thi:");
        nhapPhong();
        //==================================
        Scanner sc = new Scanner(System.in);
        do {
            menu();
            int tl = sc.nextInt();
            switch (tl) {
                case 1:
                    themTS();
                    break;
                case 2:
                    suaTTTS();
                    break;
                case 3:
                    xoaTS();
                    break;
                case 4:
                    layTTTS_soBD();
                    break;
                case 5:
                    layTTTS_chiso();
                    break;
                case 6:
                    inDanhsachTS();
                    break;
                case 7:
                    luuFile();
                    break;
                case 8:
                    docFile();
                    break;
                case 9:
                    SapXepDSTS();
                    break;
                case 10:
                    System.out.println("BYE");
                    return;
            }
        } while (true);
    }
}
