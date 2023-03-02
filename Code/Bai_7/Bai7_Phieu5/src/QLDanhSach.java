
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
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
public class QLDanhSach {

    //Quản lý được danh sách phòng học có thể thay đổi số lượng dễ dàng, không hạn chế số phòng
    static ArrayList<PhongHoc> dsPhongHoc = new ArrayList<>();
    
    // String path
    static final String stringPath = "E:\\HaUI\\Nam_3_Ki_1\\Java\\Code\\Bai_7\\PhongThi.txt";

    //Khởi tạo danh sách phòng có 3 phòng mặc định
    public static void khoiTaoPhong() {
        PhongHoc p1 = new PhongLyThuyet(1, 1, "A1", 100, 20);
        PhongHoc p2 = new PhongMayTinh(20, 2, "A2", 200, 40);
        PhongHoc p3 = new PhongThiNghiem("Rang mieng", 20, 10, 3, "B2", 300, 30);

        dsPhongHoc.add(p1);
        dsPhongHoc.add(p2);
        dsPhongHoc.add(p3);
        System.out.println("Khoi tao thanh cong!!");
    }

    //Thực hiện được chức năng thêm một phòng học vào danh sách (thêm thành công nếu không bị trùng mã phòng).
    public static boolean themPhong() {
        System.out.println("Moi lua chon phong de them: ");
        int luachon = -1;
        do {
            System.out.println("1. Nhap thong tin phong ly thuyet.");
            System.out.println("2. Nhap thong tin phong may tinh.");
            System.out.println("3. Nhap thong tin phong thi nghiem.");
            System.out.println("====Chon phong====");
            luachon = new Scanner(System.in).nextInt();
            switch (luachon) {
                case 1:
                    PhongLyThuyet p = new PhongLyThuyet();
                    p.nhap();
                    if (!dsPhongHoc.contains(p)) {
                        dsPhongHoc.add(p);
                        return true;
                    }
                    return false;
                case 2:
                    PhongMayTinh p1 = new PhongMayTinh();
                    p1.nhap();
                    if (!dsPhongHoc.contains(p1)) {
                        dsPhongHoc.add(p1);
                        return true;
                    }
                    return false;
                case 3:
                    PhongThiNghiem p2 = new PhongThiNghiem();
                    p2.nhap();
                    if (!dsPhongHoc.contains(p2)) {
                        dsPhongHoc.add(p2);
                        return true;
                    }
                    return false;
                default:
                    throw new AssertionError();
            }
        } while (luachon < 1 && luachon > 3);
    }

    // Thực hiện được chức năng in toàn bộ danh sách các phòng học.
    public static void timKiemPhong() {
        System.out.println("Nhap ma phong muon tim: ");
        int maPhong = new Scanner(System.in).nextInt();
        for (PhongHoc p : dsPhongHoc) {
            if (p.getMaPhong() == maPhong) {
                System.out.println("Tim thay phong: ");
                System.out.println(p.toString());
            }
        }
        System.out.println("Khong tim thay phong");
    }

    // Thực hiện được chức năng in toàn bộ danh sách các phòng học.
    public static void inDanhSachPhong() {
        Iterator iterator = dsPhongHoc.iterator();

        System.out.println("Danh sach phong: ");
        System.out.println("\t-Phong ly thuyet:");
        PhongLyThuyet.inTieuDe();
        while (iterator.hasNext()) {
            Object p = iterator.next();
            if (p instanceof PhongLyThuyet) {
                PhongLyThuyet plt = (PhongLyThuyet) p;
                System.out.println(plt.toString());
            }
        }
        iterator = dsPhongHoc.iterator();
        System.out.println("\t-Phong may tinh:");
        PhongMayTinh.inTieuDe();
        while (iterator.hasNext()) {
            Object p = iterator.next();
            if (p instanceof PhongMayTinh) {
                PhongMayTinh pmt = (PhongMayTinh) p;
                System.out.println(pmt.toString());
            }
        }
        iterator = dsPhongHoc.iterator();
        System.out.println("\t-Phong thi nghiem: ");
        PhongThiNghiem.inTieuDe();
        while (iterator.hasNext()) {
            Object p = iterator.next();
            if (p instanceof PhongThiNghiem) {
                PhongThiNghiem ptn = (PhongThiNghiem) p;
                System.out.println(ptn.toString());
            }
        }
    }

    // Thực hiện được chức năng in danh sách các phòng học đạt chuẩn
    public static void inDSPhongDat() {
        Iterator iterator = dsPhongHoc.iterator();

        System.out.println("Danh sach phong dat chuan: ");
        System.out.println("\t-Phong ly thuyet:");
        PhongLyThuyet.inTieuDe();
        while (iterator.hasNext()) {
            Object p = iterator.next();
            if (p instanceof PhongLyThuyet) {
                PhongLyThuyet plt = (PhongLyThuyet) p;
                if (plt.phongDatChuan().equals("Dat chuan")) {
                    System.out.println(plt.toString());
                }
            }
        }
        iterator = dsPhongHoc.iterator();
        System.out.println("\t-Phong may tinh:");
        PhongMayTinh.inTieuDe();
        while (iterator.hasNext()) {
            Object p = iterator.next();
            if (p instanceof PhongMayTinh) {
                PhongMayTinh pmt = (PhongMayTinh) p;
                if (pmt.phongDatChuan().equalsIgnoreCase("dat chuan")) {
                    System.out.println(pmt.toString());
                }
            }
        }
        iterator = dsPhongHoc.iterator();
        System.out.println("\t-Phong thi nghiem: ");
        PhongThiNghiem.inTieuDe();
        while (iterator.hasNext()) {
            Object p = iterator.next();
            if (p instanceof PhongThiNghiem) {
                PhongThiNghiem ptn = (PhongThiNghiem) p;
                if (ptn.phongDatChuan().equalsIgnoreCase("dat chuan")) {
                    System.out.println(ptn.toString());
                }
            }
        }
    }

    // Thực hiện được chức năng sắp xếp danh sách tăng dần theo cột dãy nhà
    public static void sapXepTangTheoDayNha() {
        Comparator<PhongHoc> c = new Comparator<PhongHoc>() {
            @Override
            public int compare(PhongHoc o1, PhongHoc o2) {
                return o1.getDayNha().compareToIgnoreCase(o2.getDayNha());
            }
        };
        dsPhongHoc.sort(c);
        System.out.println("Sap xep tang dan theo day nha thanh cong: ");
        System.out.println("Danh sach sau khi sap xep: ");
        inDanhSachPhong();
    }

    // Thực hiện được chức năng sắp xếp danh sách giảm dần theo cột diện tích
    public static void sapXepGiamTheoDienTich() {
        Comparator<PhongHoc> c = new Comparator<PhongHoc>() {
            @Override
            public int compare(PhongHoc o1, PhongHoc o2) {
                return Double.compare(o2.getDienTich(), o1.getDienTich());
            }
        };

        dsPhongHoc.sort(c);
        System.out.println("Sap xep giam dan theo dien tich thanh cong: ");
        System.out.println("Danh sach phong sap khi sap xep: ");
        inDanhSachPhong();
    }

    // Thực hiện được chức năng để sắp xếp danh sách tăng dần theo cột số bóng đèn.
    public static void sapXepTangtheoSoBong() {
        Comparator<PhongHoc> c = new Comparator<PhongHoc>() {
            @Override
            public int compare(PhongHoc o1, PhongHoc o2) {
                return Integer.compare(o1.getSoBongDen(), o2.getSoBongDen());
            }
        };

        dsPhongHoc.sort(c);
        System.out.println("Sap xep tang dan theo so bong thanh cong: ");
        System.out.println("Danh sach phong sap khi sap xep: ");
        inDanhSachPhong();
    }

    // Thực hiện được chức năng cập nhật số máy tính cho một phòng máy tính nào đó khi biết mã phòng.
    public static boolean updateSLMayTinh() {
        System.out.println("Nhap ma phong can update: ");

        int maPhong = new Scanner(System.in).nextInt();

        for (PhongHoc p : dsPhongHoc) {
            if (p instanceof PhongMayTinh && p.getMaPhong() == maPhong) {
                System.out.println("Nhap so luong may tinh");
                PhongMayTinh pmt = (PhongMayTinh) p;
                pmt.setSoLuongMayTinh(new Scanner(System.in).nextInt());
                return true;
            } else {
                System.out.println("Ma phong khong phai cua phong may tinh");
                return false;
            }
        }
        return false;
    }

    //Thực hiện được chức năng xóa một phòng học nào đó khi biết mã phòng. Lưu ý khi kiểm tra xóa cần phải xác minh rằng có chắc chắn xóa không?
    public static boolean removePhong() {
        System.out.println("Nhap ma phong muon xoa:");
        int maPhong = new Scanner(System.in).nextInt();
        for (PhongHoc p : dsPhongHoc) {
            if (p.getMaPhong() == maPhong) {
                System.out.println("Ban chac chan muon xoa (1 - Co / 2- Khong)?");
                int lc = new Scanner(System.in).nextInt();
                switch (lc) {
                    case 1:
                        dsPhongHoc.remove(p);
                        return true;
                    case 2:
                        System.out.println("Lua chon khong xoa");
                        return false;
                    default:
                        throw new AssertionError();
                }
            }

        }
        return false;
    }
    // Thực hiện được chức năng in ra tổng số phòng học.

    public static int sumPhong() {
        return dsPhongHoc.size();
    }

    // Thực hiện được chức năng in danh sách các phòng máy có 60 máy
    public static void inDSPhongMayTM() {
        Iterator iterator = dsPhongHoc.iterator();
        System.out.println("\t-Phong may tinh:");
        PhongMayTinh.inTieuDe();
        while (iterator.hasNext()) {
            Object p = iterator.next();
            if (p instanceof PhongMayTinh) {
                PhongMayTinh pmt = (PhongMayTinh) p;
                if (pmt.getSoLuongMayTinh() == 60) {
                    System.out.println(pmt.toString());
                }
            }
        }
    }
    
    public static void ghiFile(){
        try{
            // Tao luong ghi thong tin vao file
            FileOutputStream fout = new FileOutputStream(stringPath);
            
            // Tao luong ghi doi tuong vao luong ghi thong tin
            ObjectOutputStream obout = new ObjectOutputStream(fout);
            
            // Ghi danh sach doi tuong vao file
            obout.writeObject(dsPhongHoc);
            
            obout.close();
            fout.close();
            System.out.println("Ghi thanh cong");
        }catch(Exception e){
            System.out.println(e.toString());
        }
        
    }
    
    public static void docFile(){
        try{
            // Tao luong doc du lieu tu file
            FileInputStream fin = new FileInputStream(stringPath);
            
            // Tao luong doc doi tuong tu luong doc du lieu
            ObjectInputStream obin = new ObjectInputStream(fin);
            
            // Doc du lieu
            dsPhongHoc = (ArrayList<PhongHoc>)obin.readObject(); // phai ep kieu de doc
            
            // thong bao
            System.out.println("Doc thanh cong");
            fin.close();
            obin.close();
        }catch(Exception e){
            System.out.println("Co loi " + e.toString());
        }
    }

    public static void main(String[] args) {
        // Thực hiện được chức năng thử nghiệm qua bảng chọn để thực hiện các chức năng theo yêu cầu.
        int luachon = -1;
        do {
            System.out.println("1. Khoi tao danh sach phong.");
            System.out.println("2. Them phong vao danh sach phong.");
            System.out.println("3. Tim kiem phong.");
            System.out.println("4. In toan bo danh sach phong.");
            System.out.println("5. In danh sach phong dat chuan");
            System.out.println("6. Sap xep theo cot day nha");
            System.out.println("7. Sap xep theo cot dien tich");
            System.out.println("8. Sap xep theo so bong den");
            System.out.println("9.Cap nhat so luong may tinh o phong may");
            System.out.println("10.Xoa phong trong danh sach");
            System.out.println("11.In ra tong so phong trong danh sach");
            System.out.println("12.In ra danh sach phong may co 60 may");
            System.out.println("13.Ghi du lieu vao file");
            System.out.println("14.Doc du lieu tu file");
            System.out.println("15.THOAT");
            System.out.println("\t=======Nhap lua chon======");
            luachon = new Scanner(System.in).nextInt();
            switch (luachon) {
                case 1:
                    khoiTaoPhong();
                    break;
                case 2:
                    if (themPhong()) {
                        System.out.println("Them thanh cong!!");
                    } else {
                        System.out.println("Them that bai.");
                    }
                    break;
                case 3:
                    timKiemPhong();
                    break;
                case 4:
                    inDanhSachPhong();
                    break;
                case 5:
                    inDSPhongDat();
                    break;
                case 6:
                    sapXepTangTheoDayNha();
                    break;
                case 7:
                    sapXepGiamTheoDienTich();
                    break;
                case 8:
                    sapXepTangtheoSoBong();
                    break;
                case 9:
                    if (updateSLMayTinh()) {
                        System.out.println("Cap nhat thanh cong");
                    } else {
                        System.out.println("Cap nhat that bai. Day khong phai ma phong may tinh");
                    }
                    break;
                case 10:
                    if (removePhong()) {
                        System.out.println("Xoa phong thanh cong");
                    } else {
                        System.out.println("Xoa phong that bai");
                    }
                    break;
                case 11:
                    System.out.println("Tong phong trong danh sach: " + sumPhong());
                    break;
                case 12:
                    inDSPhongMayTM();
                    break;
                case 13:
                    ghiFile();
                    break;
                case 14:
                    docFile();
                    break;
                case 15:
                    System.out.println("BYE");
                    return;
                default:
                    throw new AssertionError();
            }
        } while (luachon != 13);
    }
}
