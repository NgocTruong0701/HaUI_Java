package Array;

import java.util.*;

public class Mang_da_chieu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arrayInt = new int[2][2];
		int arrayInt2[][];
		
		for(int i = 0; i < 2;i++) {
			for(int j = 0 ; j < 2; j++)
			{
				System.out.print("Nhap phan tu: ");
				arrayInt[i][j] = new Scanner(System.in).nextInt();
			}
		}
		arrayInt2 = arrayInt.clone();
		System.out.print("Mang vua nhap: ");
		for(int[] row : arrayInt2) {
			{
				System.out.println();
				for(int value : row) {
					System.out.print(value + " ");
				}
			}
		}
	}

}
