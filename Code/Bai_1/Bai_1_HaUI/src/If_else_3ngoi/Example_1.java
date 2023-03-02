package If_else_3ngoi;

public class Example_1 {
	public static void main(String args[]) {
		char ch ='0';
		System.out.println((ch >= '0' && ch <= '9')? "La so":"Khong la so");
		
		if(ch >= '0' && ch <='9') {
			System.out.println("La so");
		}
		else {
			System.out.println("Khong la so");
		}
	}
	
}
