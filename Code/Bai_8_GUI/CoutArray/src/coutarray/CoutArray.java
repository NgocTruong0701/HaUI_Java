/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coutarray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Lê Ngọc Trường
 */
class newArray {

    private int key;
    private int value;

    public newArray(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setValue(int value) {
        this.value = value;
    }

}

public class CoutArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<Integer, Integer> index = new HashMap<Integer, Integer>();
        int[] array = {1, 2, 1, 2, 1, 3, 3, 7, 2};
        HashSet<Integer> kq = new HashSet<>();

        for (int i : array) {
            index.put(i, index.getOrDefault(i, 0) + 1);
        }

        for (int i : array) {
            if(index.get(i) % 2 != 0 && index.get(i) != 1){
                kq.add(i);
            }
        }
        
        System.out.println(kq.toString());
    }

}
