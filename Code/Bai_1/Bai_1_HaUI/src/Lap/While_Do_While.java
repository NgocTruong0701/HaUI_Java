package Lap;

public class While_Do_While {
	
	public static void While() {
		int num = 0;
		System.out.println("Vong lap while:");
		while(num < 5) {
			System.out.println(num);
			num++;
		}
	}
	
	public static void Do_While() {
		int num = 0;
		System.out.println("Vong lap do while:");
		do {
			System.out.println(num);
			num++;
		}
		while(num < 5);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		While();
		Do_While();
	}

}
