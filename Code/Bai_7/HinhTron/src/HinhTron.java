
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class HinhTron implements Serializable{
    private double banKinh;
    
    public double tinhDienTich(){
        return Math.PI * Math.pow(banKinh, 2);
    }

    @Override
    public String toString() {
        return "HinhTron{" + "banKinh=" + banKinh +  " Dien tich=" + tinhDienTich() + '}';
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh){
        try{
            if(banKinh <= 0){
                throw new Ex_KichCo(banKinh);
            }
            this.banKinh = banKinh;
        }
        catch(Ex_KichCo e){
            System.out.println(e.toString());
        }
    }
}
