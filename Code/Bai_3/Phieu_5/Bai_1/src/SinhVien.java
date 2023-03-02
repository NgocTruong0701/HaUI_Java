
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ngoct
 */
public class SinhVien implements chuyenNganh {

    private String ho;
    private String ten;
    private DiaChi diaChiNha;
    private DiaChi diaChiTruong;
    private double diem01;
    private double diem02;
    private double diem03;
    private String tenCN;

    @Override
    public String toString() {
        String result = String.format("%-15s %-15s %-25s %-25s %-15.2f %-15.2f %-15.2f %-15s %-15.2f", ho, ten, diaChiNha.toString(), diaChiTruong.toString(), diem01, diem02, diem03, tenCN, tinhDiemTB());
        return result;
    }

    @Override
    public void setChuyenNganh() {
        System.out.println("Lam gi voi no ??");
    }

    @Override
    public String getChuyenNganh() {
        return "Lam gi voi no ??";
    }

    public void setCotDiem(int loaidiem, double diem) {
        switch (loaidiem) {
            case 1:
                this.diem01 = diem;
                break;
            case 2:
                this.diem02 = diem;
                break;
            case 3:
                this.diem03 = diem;
                break;
            default:
                break;
        }
    }

    public double getCotDiem(int loaidiem) {
        switch (loaidiem) {
            case 1:
                return this.diem01;
            case 2:
                return this.diem02;
            case 3:
                return this.diem03;
            default:
                return 0;
        }
    }

    public double tinhDiemTB() {
        return (this.diem01 + this.diem02 + this.diem03) / 3;
    }

    public static void inTieuDe() {
        System.out.printf("%-15s %-15s %-25s %-25s %-15s %-15s %-15s %-15s %-15s %n", "Ho", "Ten", "D/C nha", "D/C truong", "Diem 1", "Diem 2", "Diem 3", "Chu nhiem","Diem TB");
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap ho: ");
        ho = sc.nextLine();
        System.out.println("Nhap ten: ");
        ten = sc.nextLine();
        System.out.println("Nhap dia chi nha: ");
        System.out.println("Nhap duong: ");
        String duongn = sc.nextLine();
        System.out.println("Nhap quan: ");
        String quann = sc.nextLine();
        System.out.println("Nhap thanh pho: ");
        String thanhphon = sc.nextLine();
        System.out.println("Nhap ma vung: ");
        long mavungn = sc.nextLong();
        diaChiNha = new DiaChi(duongn, quann, thanhphon, mavungn);
        sc.nextLine();
        System.out.println("Nhap dia chi truong: ");
        System.out.println("Nhap duong: ");
        String duongt = sc.nextLine();
        System.out.println("Nhap quan: ");
        String quant = sc.nextLine();
        System.out.println("Nhap thanh pho: ");
        String thanhphot = sc.nextLine();
        System.out.println("Nhap ma vung: ");
        long mavungt = sc.nextLong();
        diaChiTruong = new DiaChi(duongt, quant, thanhphot, mavungt);
        System.out.println("Nhap diem: ");
        for(int i = 0; i < 3;i++){
            System.out.println("Diem thu " +(i+1));
            double diem = sc.nextDouble();
            setCotDiem((i+1), diem);
        }
        System.out.println("Nhap ten chu nhiem:");
        sc.nextLine();
        tenCN = sc.nextLine();
    }
}
