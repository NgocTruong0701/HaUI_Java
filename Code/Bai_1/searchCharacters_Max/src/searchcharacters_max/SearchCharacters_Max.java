/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package searchcharacters_max;

import java.util.Scanner;

/**
 *
 * @author ngoct
 */
public class SearchCharacters_Max {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Nhap chuoi:");
        String chuoiString = new Scanner(System.in).nextLine();
        
        int[] charCount = new int[256];
        for(int i = 0 ; i < chuoiString.length();i++){
            char c = chuoiString.charAt(i);
            charCount[c]++;
        }
        
        int max = 0;
        for(int i = 0 ; i < charCount.length;i++){
            if(max < charCount[i] && (char)i != ' ')
                max = charCount[i];
        }
        
        System.out.println("Cac ki tu co tan suat xuat hien lon nhat la: ");
        for(int i = 0 ; i < charCount.length;i++){
            if(charCount[i] == max && (char)i != ' '){
                System.out.println((char)i);
            }
        }
        System.out.println("Voi tan suat la: " + max);
    }
    
}
