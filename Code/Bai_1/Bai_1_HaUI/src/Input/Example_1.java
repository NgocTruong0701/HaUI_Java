package Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Method input int
		int n = 0;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Moi nhap 1 so nguyen bat ki: ");
			n = Integer.parseInt(input.readLine());
		}
		catch (IOException e){
			e.printStackTrace();
		}
		System.out.println("So vua nhap la: " + n);
	}

}
