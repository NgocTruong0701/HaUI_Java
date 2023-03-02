
import java.io.Serializable;
import java.util.Locale;
import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lê Ngọc Trường
 */
public class ThueBao implements Serializable{

    private String hoTen, diaChi, soDT;

    public ThueBao() {
        hoTen = diaChi = soDT;
    }

    public ThueBao(String hoTen, String diaChi, String soDT) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDT = soDT;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setHoTen(String hoTen) throws Exception {
        if (hoTen.trim().isEmpty()) {
            throw new Exception("Ho ten khong duoc de trong");
        }
        this.hoTen = hoTen;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public int getCuoc() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-15s %-15s", hoTen, diaChi, soDT);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.hoTen);
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
       
        final ThueBao other = (ThueBao) obj;
        return Objects.equals(this.hoTen, other.hoTen);
    }

    

    public ThueBao(String hoTen) {
        this.hoTen = hoTen;
    }
    
    
}
