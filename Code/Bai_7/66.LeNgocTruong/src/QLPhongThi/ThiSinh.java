/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLPhongThi;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author IT Supporter
 */
public class ThiSinh implements Serializable {

    private String soBD;
    private String hoTen;
    private double diemToan, diemLy, diemHoa;

    public ThiSinh() {
        soBD = hoTen = "";
        diemHoa = diemLy = diemToan = 0;
    }

    public ThiSinh(String soBD) {
        this.soBD = soBD;
    }

    public ThiSinh(String soBD, String hoTen, double diemToan, double diemLy, double diemHoa) {
        this.soBD = soBD;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.soBD);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ThiSinh other = (ThiSinh) obj;
        if (!Objects.equals(this.soBD, other.soBD)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String tsValue = String.format("%-15s %-15s %-15.2f %-15.2f %-15.2f %-15.2f",soBD, hoTen, diemToan, diemLy, diemHoa, tongDiem());
        return tsValue;
    }

    public String getSoBD() {
        return soBD;
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setSoBD(String soBD) throws Exception {
        if (soBD.trim().equals("")) {
            throw new Exception("So bao danh khong duoc de trong");
        }
        this.soBD = soBD;
    }

    public void setHoTen(String hoTen) throws Exception {
        if (hoTen.trim().equals("")) {
            throw new Exception("Ho ten khong duoc de trong");
        }
        this.hoTen = hoTen;
    }

    public void setDiemToan(double diemToan) throws Exception {
        if (diemToan < 0 || diemToan > 10) {
            throw new Exception("Diem toan khong hop le");
        }
        this.diemToan = diemToan;
    }

    public void setDiemLy(double diemLy) throws Exception {
        if (diemLy < 0 || diemLy > 10) {
            throw new Exception("Diem ly khong hop le");
        }
        this.diemLy = diemLy;
    }

    public void setDiemHoa(double diemHoa) throws Exception {
        if (diemHoa < 0 || diemHoa > 10) {
            throw new Exception("Diem hoa khong hop le");
        }
        this.diemHoa = diemHoa;
    }

    public boolean nhap() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap so bao danh: ");
            setSoBD(sc.nextLine());
            System.out.println("Nhap ho ten: ");
            setHoTen(sc.nextLine());
            System.out.println("Nhap diem toan: ");
            setDiemToan(sc.nextDouble());
            System.out.println("Nhap diem ly: ");
            setDiemLy(sc.nextDouble());
            System.out.println("Nhap diem hoa: ");
            setDiemHoa(sc.nextDouble());
            sc.nextLine();   
            return true;
        } catch (Exception e) {
            System.out.println("Co loi: " + e.toString());
            return false;
        }
    }

    /**
     * Kiểm tra 1 thí sinh có đậu hay không
     *
     * @return true nếu sinh viên có tổng số điểm trên 15 và không có điểm nào
     * dưới 3.
     */
    public boolean CheckPassed() {
        return tongDiem() > 15 && diemToan >= 3 && diemHoa >= 3 && diemLy >= 3;
    }

    public double tongDiem() {
        return diemHoa + diemLy + diemToan;
    }

}
