/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lê Ngọc Trường
 */
public class ThueBaoTheoDungLuong extends ThueBao {

    private int soMbSuDung;

    public ThueBaoTheoDungLuong() {
        super();
        soMbSuDung = 0;
    }

    public ThueBaoTheoDungLuong(int soMbSuDung, String hoTen, String diaChi, String soDT) {
        super(hoTen, diaChi, soDT);
        this.soMbSuDung = soMbSuDung;
    }

    public int getSoMbSuDung() {
        return soMbSuDung;
    }

    public void setSoMbSuDung(int soMbSuDung) throws Exception {
        if (soMbSuDung == 0) {
            throw new Exception("So MB su dung khac 0");
        }
        this.soMbSuDung = soMbSuDung;
    }

    @Override
    public int getCuoc() {
        int cuocSuDung = soMbSuDung * 50;
        return 30000 + cuocSuDung;
    }

    @Override
    public String toString() {

        return super.toString() + String.format(" %-15d %-15d", soMbSuDung, getCuoc());
    }

    public static void inTieuDe() {
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %n", "Ho ten", "Dia chi", "So DT", "So MB", "Cuoc");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
