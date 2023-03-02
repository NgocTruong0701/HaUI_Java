
import java.util.Arrays;
import java.util.stream.IntStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ngoct
 */
public class Array_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Sinh ngau nhien so phan tu tu [10 - 20)
        int n = 10 + (int)(Math.random() * 10);
        
        // Khai bao mang nguyen int voi n phan tu
        System.out.println("So phan tu cua mang la " + n);
        int[] arrInt = new int[n];
        int[] arrCopy;
        
        // Sinh ngau nhien gia tri cua mang [0-100)
        for(int i = 0; i < n;i++){
            arrInt[i] = (int)(Math.random() * 100);
        }
        
        // Sao chep mang
        // arrCopy = arrInt.clone();
        arrCopy = Arrays.copyOf(arrInt, arrInt.length);
        
        // Thay doi gia tri
        arrInt[4] = 1000;
        
        // In ra gia tri cua mang
        for(int value:arrCopy){
            System.out.print(value + " ");
        }
        System.out.println("");
        
        // Sap xep
        Arrays.sort(arrCopy);
        
        // In ra mang da sap xep
        System.out.println(Arrays.toString(arrCopy));
        
        // Tu java 8 co ho tro ki thuat 
        Integer[] ARRINT = Arrays.stream(arrInt).boxed().toArray(Integer[]::new); // cach 1
        Integer[] ARRINT2 = IntStream.of(arrInt).boxed().toArray(Integer[]::new); // cach 2
        
        Integer[] ARRINT3 = new Integer[n]; // cach 3 thuong dung
        Arrays.setAll(ARRINT3,i -> arrInt[i]);
        
        // Auto-unboxing 
        for(int value: ARRINT3){
            System.out.print(value + " ");
        }
    }
    
}
