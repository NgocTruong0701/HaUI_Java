/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_8;

/**
 *
 * @author ngoct
 */
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Bai_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Nhap kich thuoc mang: ");
        int n = new Scanner(System.in).nextInt();
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0 ; i < n;i++) {
            arrayList.add((int)(Math.random() * 100));
        }
        System.out.println("Mang vua tao:");
        for(int Number: arrayList){
            System.out.print(Number + " ");
        }
        System.out.println("");
        System.out.println("Nhap so muon them: ");
        int x = new Scanner(System.in).nextInt();

        arrayList.add(x);
        
        Collections.sort(arrayList);
        
        System.out.println("Mang sau khi them va sap xep:");
        for(int Number: arrayList){
            System.out.print(Number + " ");
        }
    }
    
}
