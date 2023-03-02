/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngoct
 */
public class NhanVien {
    private String maNV;
    private int soSP;

    public NhanVien() {
        this.maNV = "";
        this.soSP = 0;
    }

    public NhanVien(String maNV, int soSP) {
        this.maNV = maNV;
        this.soSP = soSP;
    }

    public String getMaNV() {
        return maNV;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setSoSP(int soSP) {
        if(soSP > 0){
           this.soSP = soSP;
        }
        else
        {
            System.out.println("So san pham khong thoa man.");
        }
    }
    
    public boolean coVuotChuan(){
        return this.soSP > 500;
    }
    
    public String getTongKet(){
        return this.coVuotChuan() ? "vuot" : "";
    }
    
    public double getLuong(){
        return this.coVuotChuan() ? (500 * 20000 + (this.soSP - 500) * 30000) : (20000 * this.soSP);
    }
    
    public static void inTieuDe(){
        System.out.printf("%-15s %-15s %-20s %-15s %n","Ma NV", "So SP", "Luong","Tong ket");
    }
    
    public void inDL(){
        System.out.printf("%-15s %-15d %-20.2f %-15s %n",maNV, soSP, getLuong(), getTongKet());
    }
}
