package Input;

import java.util.Scanner;

public class Example_2_use_Scanner {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = "";
		int age = 0;

		try {
			System.out.print("Moi nhap ten: ");
			name = input.nextLine();
			System.out.print("Moi nhap tuoi: ");
			age = input.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
			// System.out.println(e);
		}
		input.close();

		System.out.println("Vay ten cua ban la " + name + ", co tuoi la " + age + " tuoi");
	}
}
