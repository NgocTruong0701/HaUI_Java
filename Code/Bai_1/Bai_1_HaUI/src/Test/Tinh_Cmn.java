/**
 * 
 */
package Test;

import java.util.Scanner;

/**
 * @author ngoct
 *
 */
public class Tinh_Cmn {

	/**
	 * @param args
	 */
	public static float TinhToan(int n, int k) {
		if(k < 1 || k > n)
			return -1;
		else {
			int tu = 1;
			int mau = 1;
			
			for(int i = n; i >= (n-k+1);i--) {
				tu *= i;
			}
			for(int i = 1; i <= k;i++) {
				mau *= i;
			}
			
			return (float)tu/mau;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inpScanner = new Scanner(System.in);
		System.out.println("Moi nhap so thu nhat: ");
		int n = inpScanner.nextInt();
		System.out.println("Moi nhap so thu hai: ");
		int k = inpScanner.nextInt();
		
		System.out.println(TinhToan(n, k));
		inpScanner.close();
	}

}
