/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string_1;

import java.util.Arrays;

/**
 *
 * @author ngoct
 */
public class String_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Khai bao 1 chuoi ki tu
        String str1 = "Cong hoa xa hoi chu nghia  Viet Nam";
        System.out.println(str1);
        
        // Khai bao mot chuoi ki tu tu mang ki tu
        char[] arrChar = {'h','e','l','l','o'};
        String str2 = String.valueOf(arrChar);
        System.out.println(str2);
        
        // Tach chuoi thanh mang chuoi (String -> String[])
        String[] arrStrings = str1.split(" ");
        System.out.println(Arrays.toString(arrStrings));
        
        // Ghep cac phan tu cua mang chuoi thanh 1 chuoi (String[] -> String)
        String newString = String.join("-", arrStrings);
        System.out.println(newString);
        
        // Trong bo nho
        String str3 = "abc";
        String str4 = "abc";
        System.out.println(str3.equals(str4)); // So sanh gia tri -> true
        System.out.println(str3 == str4); // So sanh dia chi trong bo nho -> true
        
        String str5 = new String("abc");
        String str6 = new String("abc");
        System.out.println(str5.equals(str6)); // So sanh gia tri -> true
        System.out.println(str5 == str6); // So sanh dia chi trong bo nho -> false
    }
    
}
