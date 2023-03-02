/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array_2;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author ngoct
 */
public class Array_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Khai bao mang truc tiep
        int[] arrInt1 = new int[] {1, 2, 3};
        int[] arrInt2 = {4, 5, 6};
        
        // ghep 2 mang 1 chieu thanh 2 chieu
        int[][] arrInt = {arrInt1, arrInt2};
        
        // in mang 2 chieu
        for(int[] row: arrInt){
            for(int value: row){
                System.out.print(value + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        // in theo cach 2
        System.out.println(Arrays.deepToString(arrInt));
        
        // Hop mang 1 chieu kieu doi tuong tuong ung thanh 1 mang 1 chieu
        Integer[] ARRINT1 = Arrays.stream(arrInt1).boxed().toArray(Integer[]::new);
        Integer[] ARRINT2 = Arrays.stream(arrInt2).boxed().toArray(Integer[]::new);
        //Integer[] ARRINT2 = new Integer[arrInt2.length];
        //Arrays.setAll(ARRINT2, i -> arrInt2[i]);
        HashSet<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(ARRINT1));
        set.addAll(Arrays.asList(ARRINT2));
        System.out.println("In ra ket qua sau khi hop nhat: " );
        System.out.println(set);
        
        // Chuyen ve mang 1 chieu
        Integer[] union = {};
        union = set.toArray(union);
        System.out.println("Mang sau khi hop 1 chieu: ");
        System.out.println(Arrays.toString(union));
        
        // Giao 2 mang 1 chieu
        ARRINT1 = new Integer[]{1 ,2 ,3, 4, 5, 6, 7, 8, 9};
        ARRINT2 = new Integer[]{3, 5, 7, 10, 20};
        HashSet<Integer> set2 = new HashSet<>();
        set2.addAll(Arrays.asList(ARRINT1));
        set2.retainAll(Arrays.asList(ARRINT2));
        System.out.println("In tap hop khi giao: ");
        System.out.println(set2); // 3 5 7
    }
}
