/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Phieu_bai_1;

import java.util.Scanner;

/**
 *
 * @author ngoct
 */
public class PT_bac_2 {
    private double a, b, c;
    
    void nhap(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap he so thu nhat (khac 0): ");
            a = sc.nextDouble();
            if(a == 0){
                System.out.println("Nhap lai. he so phai khac 0");
            }
        }
        while(a == 0);
        System.out.println("Nhap he so thu hai: ");
        b = sc.nextDouble();
        System.out.println("Nhap he so thu ba: ");
        c = sc.nextDouble();
        sc.close();
    }
    
    double dental(){
        return Math.pow(b,2) - 4*a*c;
    }
    
    void giaiPT(){
        double dental = dental();
        if(dental == 0){
            System.out.println("Phuong trinh co nghiem kep duy nhat: " + (-b/2*a));
        }
        else{
            if(dental > 0){
                double x1 = 0,x2 = 0;
                x1 = (-b - Math.sqrt(dental))/(2*a);
                x2 = (-b + Math.sqrt(dental))/(2*a);
                System.out.printf("Phuong trinh co 2 nghiem phan biet: %.3f va %.3f %n",x1,x2);
            }
            else{
                System.out.println("Phuong trinh vo nghiem.");
            }
        }
    }
}

class Main{
    public static void main(String[] args) {
        PT_bac_2 pt = new PT_bac_2();
        pt.nhap();
        pt.giaiPT();
    }
}
