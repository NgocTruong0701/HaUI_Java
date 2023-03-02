/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLPhongThi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author IT Supporter
 */
public class PhongThi implements Serializable {

    //các thuộc tính của đối tượng phòng thi
    private String msPT;
    private String diachiPT;
    private int luongTS;
    //đối tượng dùng chứa tập các thí sinh
    private ArrayList<ThiSinh> dsTS;

    // đinh nghĩa các phương thức khởi tạo
    public PhongThi(String msPT, String diachiPT, int luongTS) {
        this.msPT = msPT;
        this.diachiPT = diachiPT;
        this.luongTS = luongTS;
        this.dsTS = new ArrayList<ThiSinh>();
    }

    public PhongThi() {
        msPT = diachiPT = "";
        luongTS = 0;
        dsTS = new ArrayList<ThiSinh>();
    }

    //get/set danh sách thí sinh
    public ArrayList<ThiSinh> getDsTS() {
        return dsTS;
    }

    public void setDsTS(ArrayList<ThiSinh> dsTS) {
        this.dsTS = dsTS;
    }

    public void setMsPT(String msPT) throws Exception {
        if (msPT.trim().equals("")) {
            throw new Exception("Ma phong thi khong duoc trong");
        }
        this.msPT = msPT;
    }

    public void setDiachiPT(String diachiPT) {
        this.diachiPT = diachiPT;
    }

    public void setLuongTS(int luongTS) throws Exception {
        if (luongTS < 23 || luongTS > 45) {
            throw new Exception("So luong thi sinh khong hop le(23-45)");
        }
        this.luongTS = luongTS;
    }

    /**
     * Thêm 1 thí sinh vào phòng thi có kiểm tra trùng mã
     *
     * @param ts: thí sinh thêm vào
     * @return true nếu việc thêm thành công
     */
    public boolean themThiSinh(ThiSinh ts) {
        //Nếu thí sinh đã tồn tại thì không cho thêm
        if (dsTS.contains(ts)) {
            return false;
        }
        if (dsTS.size() + 1 > luongTS)//nếu đã đủ lượng thí sinh
        {
            System.out.println("đã đủ số lượng thí sinh trong phòng.");
            return false;
        } else {
            dsTS.add(ts);
            return true;
        }
    }

    /* Xóa 1 thí sinh khỏi phòng thi
* @param soBD là số báo danh của thí sinh cần xóa
* @return trả về true nếu xóa thành công
     */
    public boolean xoaThisinh(String soBD) {
        ThiSinh ts = new ThiSinh(soBD);
        if (!dsTS.contains(ts)) {
            return false;
        }
        dsTS.remove(ts);
        return true;
    }

    /**
     * Sửa thông tin thí sinh
     *
     * @param soBD: số DB của thí sinh cần sử thông tin
     * @param newTS: thông tin mới cần cập nhật
     * @return true nếu sửa chữa thành công
     */
    public boolean suaThongtinTS(String soBD, ThiSinh newTS) {
        ThiSinh ts = new ThiSinh(soBD);
        if (!dsTS.contains(ts)) {
            return false;
        }
        dsTS.set(dsTS.indexOf(ts), newTS);
        return true;
    }

    /**
     * Lấy thông tin của 1 thí sinh khi biết số báo danh
     *
     * @param soBD số báo danh của ts cần lấy thông tin
     * @return null nếu không lấy được
     */
    public ThiSinh layThongtinTS(String soBD) {
        ThiSinh ts = new ThiSinh(soBD);
        if (!dsTS.contains(ts)) {
            return null;
        }
        ts = dsTS.get(dsTS.indexOf(ts));
        return ts;
    }

    /**
     * Lấy thông tin của 1 thí sinh khi biết số thứ tự của ts đó trong danh sách
     *
     * @param index :số thứ tự của ts
     * @return null nếu không thành công
     */
    public ThiSinh layThongtinTS(int index) {
        if (index < 0 || index > dsTS.size()) {
            return null;
        }
        return dsTS.get(index);
    }

    /**
     * Lấy số thí sinh thực sự đang có trong phòng thi
     *
     * @return
     */
    public int soThisinh() {
        return dsTS.size();
    }

    /**
     * Nhap thong tin phong thi Nhap ma phong, dia chi phong, luong thi sinh
     *
     * @return
     * @throws Exception bat loi sl thi sinh (23 den 45), Ma phong khong trong
     * Ktra thông tin phòng hợp lệ mới cho phép nhập ts vào phòng
     */
//    public void nhapPhong(){
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            try {
//                System.out.println("Nhap ma phong: ");
//                String msPT = sc.nextLine().trim();
//                if (msPT.isEmpty()) {
//                    throw new Exception("Ma phong khong duoc de trong.");
//                }
//                setMsPT(msPT);
//                break;
//            } catch (Exception e) {
//                System.out.println("Co loi: " + e.toString());
//            }
//        }
//
//        System.out.println("Nhap dia chi: ");
//        setDiachiPT(sc.nextLine());
//        // Nhập số lượng thí sinh và kiểm tra hợp lệ
//        while (true) {
//            try {
//                System.out.println("Nhap so luong thi sinh (tu 23 den 45): ");
//                int luongTS = sc.nextInt();
//                if (luongTS >= 23 && luongTS <= 45) {
//                    setLuongTS(luongTS);
//                    break;
//                } else {
//                    System.out.println("So luong thi sinh khong hop le.");
//                }
//            } catch (Exception e) {
//                System.out.println("Co loi: " + e.toString());
//                sc.nextLine(); // đọc input không hợp lệ để tránh lặp vô hạn
//            }
//        }
//    }

// Sap xep thi sinh theo diem, diem trung se sap xep theo diem toan
    public void SapXepTS() {
        Comparator<ThiSinh> c = new Comparator<ThiSinh>() {
            @Override
            public int compare(ThiSinh o1, ThiSinh o2) {
                int comp = Double.compare(o1.tongDiem(), o2.tongDiem());
                if (comp == 0) {
                    return Double.compare(o1.getDiemToan(), o2.getDiemToan());
                }
                return comp;
            }
        };

        Collections.sort(dsTS, c);
    }
}
