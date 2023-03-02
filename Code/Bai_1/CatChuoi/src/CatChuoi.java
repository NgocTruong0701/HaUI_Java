
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ngoct
 */
public class CatChuoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Nhap chuoi :");
        String chuoi1 = new Scanner(System.in).nextLine();
        
        System.out.println("Nhap so luong muon cat: ");
        int n = new Scanner(System.in).nextInt();
        
        String chuoiCat = chuoi1.substring(0,n);
        
        System.out.println("Chuoi vua cat: " + chuoiCat.toString());
    }
    
}
