/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ngoct
 */
public class DiaChi {
    private String duong;
    private String quan;
    private String thanhPho;
    private long maVung;
    
    

    public DiaChi() {
        duong = quan = thanhPho = "";
        maVung = 0;
    }

    public DiaChi(String duong, String quan, String thanhPho, long maVung) {
        this.duong = duong;
        this.quan = quan;
        this.thanhPho = thanhPho;
        this.maVung = maVung;
    }
    
    @Override
    public String toString(){
        return duong + "," + quan + "," + thanhPho + "," + maVung;
    }    
}
