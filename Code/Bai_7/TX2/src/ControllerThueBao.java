
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
public class ControllerThueBao {

    static ArrayList<ThueBao> dsThueBao = new ArrayList<>();

    static private final String stringPath = "E:\\HaUI\\Nam_3_Ki_1\\Java\\Code\\Bai_7\\ThueBao.txt";

    public static boolean nhapTB() {
        int luachon = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Nhap thue bao tron goi.");
        System.out.println("2. Nhap thue bao theo dung luong.");
        System.out.println("\t====Lua chon====");
        do {
            luachon = new Scanner(System.in).nextInt();
            if (luachon < 1 || luachon > 2) {
                System.out.println("Nhap khong phu hop, nhap lai.");
            }
        } while (luachon < 1 || luachon > 2);

        if (luachon == 1) {
            ThueBaoTronGoi tbtg = new ThueBaoTronGoi();
            while (true) {
                try {
                    System.out.println("Nhap ho ten:");
                    tbtg.setHoTen(sc.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println("Co loi: " + e.toString());
                }
            }
            System.out.println("Nhap dia chi: ");
            tbtg.setDiaChi(sc.nextLine());
            System.out.println("Nhap so dien thoai: ");
            tbtg.setSoDT(sc.nextLine());
            dsThueBao.add(tbtg);
            return true;
        } else {
            ThueBaoTheoDungLuong tbtdl = new ThueBaoTheoDungLuong();
            while (true) {
                try {
                    System.out.println("Nhap ho ten: ");
                    tbtdl.setHoTen(sc.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println("Co loi: " + e.toString());
                }
            }
            System.out.println("Nhap dia chi: ");
            tbtdl.setDiaChi(sc.nextLine());
            System.out.println("Nhap so dien thoai: ");
            tbtdl.setSoDT(sc.nextLine());
            while (true) {
                try {
                    System.out.println("Nhap so MB dung: ");
                    tbtdl.setSoMbSuDung(sc.nextInt());
                    sc.nextLine();
                    break;
                } catch (Exception e) {
                    System.out.println("Co loi: " + e.toString());
                }
            }
            dsThueBao.add(tbtdl);
            return true;
        }
    }

    public static void xuatTB() {
        System.out.println("\t=====Danh sach thue bao tron goi======");
        ThueBaoTronGoi.inTieuDe();
        for (ThueBao tb : dsThueBao) {
            if (tb instanceof ThueBaoTronGoi) {

                System.out.println(((ThueBaoTronGoi) tb).toString());
            }
        }
        System.out.println("\t=====Danh sach thue bao theo dung luong=====");
        ThueBaoTheoDungLuong.inTieuDe();
        for (ThueBao tb : dsThueBao) {
            if (tb instanceof ThueBaoTheoDungLuong) {
                System.out.println(((ThueBaoTheoDungLuong) tb).toString());
            }
        }
    }

    public static ThueBao maxThueBao() {
        Comparator<ThueBao> c = new Comparator<ThueBao>() {
            @Override
            public int compare(ThueBao o1, ThueBao o2) {
                return Integer.compare(o1.getCuoc(), o2.getCuoc());
            }
        };

        ThueBao maxTB = Collections.max(dsThueBao, c);

        return maxTB;
    }

    public static boolean ghiFile() {
        try {
            // Tao luong ghi file
            FileOutputStream fout = new FileOutputStream(stringPath);

            // Tao luong ghi doi tuong vao luong ghi file
            ObjectOutputStream obout = new ObjectOutputStream(fout);

            // Ghi doi tuong
            obout.writeObject(dsThueBao);

            // dong cac luong
            fout.close();
            obout.close();
            return true;
        } catch (Exception e) {
            System.out.println("Co loi: " + e.toString());
            return false;
        }
    }

    public static boolean docFile() {
        try {
            // Tao luong doc file
            FileInputStream fin = new FileInputStream(stringPath);

            // Tao luong doc doi tuong tu luong doc file
            ObjectInputStream obin = new ObjectInputStream(fin);

            // Doc doi tuong, ep kieu dKhe tu kieu bye ra kieu ban dau
            dsThueBao = (ArrayList<ThueBao>) obin.readObject();

            // Dong cac luong
            fin.close();
            obin.close();
            return true;
        } catch (Exception e) {
            System.out.println("Co loi: " + e.toString());
            return false;
        }
    }

    public static ThueBao searchElement(String name) {
//        dsThueBao.add(ts);
//        for(ThueBao tb : dsThueBao){
//            if(tb.getHoTen().equals(name)){
//                return dsThueBao.get(dsThueBao.lastIndexOf(tb));
//            }
//        }
//        return null;
        ThueBao t = new ThueBao(name);
        if (dsThueBao.contains(t)) {
            return dsThueBao.get(dsThueBao.indexOf(t));
        }
        return null;
    }

    public static void main(String[] args) {
        int luachon = -1;
        do {
            System.out.println("1. Nhap thong tin thue bao.");
            System.out.println("2. Xuat thong tin thue bao.");
            System.out.println("3. Dua ra thue bao co tien cuoc phai tra lon nhat.");
            System.out.println("4. Ghi danh sach vao file");
            System.out.println("5. Doc danh sach tu file");
            System.out.println("6. Tim kiem.");
            System.out.println("7. THOAT");
            System.out.println("\t====LUA CHON=====");
            luachon = new Scanner(System.in).nextInt();
            switch (luachon) {
                case 1:
                    if (nhapTB()) {
                        System.out.println("Nhap thanh cong.");
                    } else {
                        System.out.println("Nhap khong thanh cong.");
                    }
                    break;
                case 2:
                    xuatTB();
                    break;
                case 3:
                    System.out.println("Thue bao co cuoc lon nhat: ");
                    System.out.println(maxThueBao().toString());
                    break;
                case 4:
                    if (ghiFile()) {
                        System.out.println("Ghi file thanh cong");
                    } else {
                        System.out.println("Ghi file that bai.");
                    }
                    break;
                case 5:
                    if (docFile()) {
                        System.out.println("Doc file thanh cong");
                    } else {
                        System.out.println("Doc file that bai.");
                    }
                    break;
                case 6:
                    Scanner input = new Scanner(System.in);
                    System.out.println("\tNhập ten cần lấy thông tin:");
                    String name = input.nextLine();
                    ThueBao ts = searchElement(name);
                    System.out.println("~~~~~~~~~~Kết quả~~~~~~~~~~~~~~");
                    if (ts == null) {
                        System.out.println("Không có");
                    } else {
                        System.out.println(ts.toString());
                    }
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    break;
                case 7:
                    System.out.println("Bye");
                    return;
                default:
                    throw new AssertionError();
            }
        } while (luachon != 7);
    }
}
