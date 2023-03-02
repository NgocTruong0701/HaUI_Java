package Array;

public class Mang_1_chieu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrInt = new int[10];
		int arrInt2[];
		
		for(int i = 0 ; i < arrInt.length; i++) {
			arrInt[i] = i + 1;
		}
		
		arrInt2 = arrInt.clone();
		for(int value : arrInt2) {
			System.out.println(value);
		}
	}

}
