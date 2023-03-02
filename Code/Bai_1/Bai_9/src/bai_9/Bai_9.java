/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_9;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ngoct
 */
public class Bai_9 {

    public static void findSubarrays(int[] arr, int targetSum, int start, int end, List<int[]> subarrays) {
        if (start > end) {
            return;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }
        if (sum == targetSum) {
            int[] subarray = new int[end - start + 1];
            for (int i = start; i <= end; i++) {
                subarray[i - start] = arr[i];
            }
            subarrays.add(subarray);
        }
        for (int i = start; i < end; i++) {
            findSubarrays(arr, targetSum, start, i, subarrays);
            findSubarrays(arr, targetSum, i + 1, end, subarrays);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int targetSum = 5;
        List<int[]> subarrays = new ArrayList<>();
        findSubarrays(arr, targetSum, 0, arr.length - 1, subarrays);
        System.out.println("Cac mang con:");
        for (int[] subarray : subarrays) {
            System.out.print("Mang: ");
            for (int i : subarray) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
