package Test;

import java.util.*;

public class check_NT {
	
	public static boolean checkNT(int x) {
		if(x <= 1)
			return false;
		int count = 0;
		for(int i = 2; i <= Math.sqrt(x);i++) {
			if(x % i == 0) {
				count++;
			}
		}
		
		if(count == 0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Moi nhap so can kiem tra:");
		int x = inputScanner.nextInt();
		System.out.print(checkNT(x) ? x + " la so nguyen to":x + " khong la so nguyen to");
		inputScanner.close();
	}
}
