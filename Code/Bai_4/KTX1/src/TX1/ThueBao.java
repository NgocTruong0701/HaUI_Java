/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TX1;

import java.util.Scanner;

/**
 *
 * @author ngoct
 */
public class ThueBao {

    private String maTB;
    private String chuTB;
    private String diaChi;

    public ThueBao() {
        maTB = chuTB = diaChi = "";
    }

    public ThueBao(String maTB, String chuTB, String diaChi) {
        this.maTB = maTB;
        this.chuTB = chuTB;
        this.diaChi = diaChi;
    }

    public String getMaTB() {
        return maTB;
    }

    public String getChuTB() {
        return chuTB;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setMaTB(String maTB) {
        this.maTB = maTB;
    }

    public void setChuTB(String chuTB) {
        this.chuTB = chuTB;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void nhapTB() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma thue bao: ");
        maTB = sc.nextLine();
        System.out.println("Nhap chu thue bao: ");
        chuTB = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi = sc.nextLine();
    }

    public void xuatTB() {
        System.out.printf("%-15s %-15s %-15s", maTB, chuTB, diaChi);
    }
}
