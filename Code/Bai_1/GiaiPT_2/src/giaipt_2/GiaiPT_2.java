/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package giaipt_2;

import java.util.Scanner;
/**
 *
 * @author ngoct
 */
public class GiaiPT_2 {
    
    public static void giaiPT(double a, double b, double c){
        if(a == 0){
            System.out.println("Phuong trinh bac nhat co nghiem duy nhat: " + (-c/b));
        }
        else{
            double dental = Math.pow(b, 2) - 4*a*c;
            if(dental == 0){
                System.out.println("Phuong trinh bac 2 co nghiem kep: " + ((-b)/(2*a)));
            }
            else{
                if(dental > 0){
                    double x1 = (-b - Math.sqrt(dental)) / (2*a);
                    double x2 = (-b + Math.sqrt(dental)) / (2*a);
                    
                    System.out.println("Phuong trinh bac 2 co 2 nghiem thuc phan biet: ");
                    System.out.println("X1 = " + x1);
                    System.out.println("X2 = " + x2);
                }
                else{
                    System.out.println("Phuong trinh bac 2 co 2 nghiem phuc phan biet: ");
                    System.out.println("X1 = " + -b+"-i"+Math.sqrt(Math.abs(dental)) / (2*a));
                    System.out.println("X2 = " + -b+"+i"+Math.sqrt(Math.abs(dental)) / (2*a));
                }
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double a,b,c;
        
        System.out.println("Nhap he so thu nhat");
        a = input.nextDouble();
        System.out.println("Nhap he so thu hai");
        b = input.nextDouble();
        System.out.println("Nhap he so thu ba");
        c = input.nextDouble();
        
        giaiPT(a, b, c);
    }
    
}
