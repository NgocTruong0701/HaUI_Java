/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vongtron;

/**
 *
 * @author ngoct
 */
public class VongTron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VongTronDemo c = new VongTronDemo();
        c.setR(5); // r = 5;
        c.inHinh();
    }
    
}

class VongTronDemo{
    private double r;
    public void setR(double r){
        this.r = r;
    }
    public double tinhCV(){
        return Math.pow(r, 2) * Math.PI;
    }
    public void inHinh(){
        System.out.println("Hinh chu nhat co ban kinh r=" + r + " va chu vi la: " + tinhCV());
    }
}