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
public class ThueBaoTheoDungLuong extends ThueBao implements NhapXuat{
    private int dungLuong;
    
    @Override
    public void nhap() {
        // Nhap chu thue bao
        super.nhapTB();
        // Code de nhap dung luong
        System.out.println("Nhap dung luong dung: ");
        dungLuong = new Scanner(System.in).nextInt();
    }
    
    public int tinhTienCuocThueBao(){
        int tienCuocThueBao = TIEN_THUE_BAO + dungLuong * 40;
        if(tienCuocThueBao > MUC_TRAN){
            tienCuocThueBao = MUC_TRAN;
        }
        return tienCuocThueBao;
    }

    @Override
    public void xuat() {
        // Xuat chu thue bao
        super.xuatTB();
        System.out.printf(" %-15d %-15d %n", dungLuong, tinhTienCuocThueBao()); 
    }
    
    public static void inTieuDe(){
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %n","Ma TB", "Chu TB", "Dia chi", "Dung luong", "Tien cuoc TB");
    }
}
