/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author ngoct
 */
public class TreeSet_Example {
    public static boolean checkNT(int n){
        
        if(n < 2){
            return false;
        }
        for(int i = 2 ;i < Math.sqrt(n);i++){
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        // Khoi tao TreeSet de luu tru so nguyen
        TreeSet<Integer> numberTree = new TreeSet<Integer>();
        
        // them cac so vao tap hop
        while(true){
            
            System.out.println("Nhap cac so muon them (nhap 0 de thoat): ");
            int number = new Scanner(System.in).nextInt();
            if(number == 0){
                break;
            }
            numberTree.add(number);
        }
        
        // In ra tap hop cac so da duoc them theo thu tu tang dan
        System.out.println("Cac so nguyen da duoc nhap: ");
        // Lay 1 doi tuong Iterator de duyet phan tu trong list
        Iterator<Integer> iterator = numberTree.iterator();
        // su dung vong lap while, hasNext() de duyet
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        
        // Tim kiem gia tri nhap tu ban phim
        System.out.println("Nhap so muon tim: ");
        int numberSearch = new Scanner(System.in).nextInt();
        if(numberTree.contains(numberSearch)){
            System.out.println("Co ton tai " + numberSearch +" trong danh sach");
        }
        else{
            System.out.println("Khong ton tai " + numberSearch +"  trong danh sach");
        }
        
        // in ra cac so nguyen to
        System.out.println("Cac so nguyen to trong tap hop: ");
        while(iterator.hasNext()){
            int num = iterator.next();
            if(checkNT(num)){
                System.out.print(num + " ");
            }
        }
        
        // Xoa phan tu 
        System.out.println("Nhap so muon xoa");
        int numberRemove = new Scanner(System.in).nextInt();
        if(numberTree.remove(numberRemove)){
            System.out.println("Xoa thanh cong. Hien thi sau khi xoa: ");
            for(int i : numberTree){
                System.out.print(i + " ");
            }
        }
    }
}
