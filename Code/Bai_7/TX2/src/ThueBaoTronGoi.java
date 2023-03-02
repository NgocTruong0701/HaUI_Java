/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lê Ngọc Trường
 */
public class ThueBaoTronGoi extends ThueBao{

    public ThueBaoTronGoi() {
        super();
    }

    public ThueBaoTronGoi(String hoTen, String diaChi, String soDT) {
        super(hoTen, diaChi, soDT);
    }

    @Override
    public int getCuoc() {
        return 350000;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" %-15d", getCuoc());
    }
    
    public static void inTieuDe(){
        System.out.printf("%-15s %-15s %-15s %-15s %n", "Ho ten", "Dia chi", "So DT", "Cuoc");
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
