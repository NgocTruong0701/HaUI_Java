package String;

public class some_APIs_String_process {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * charAt(int) - Lay ki tu tai vi tri xac dinh 
		 * endsWith(String) - Ket thuc voi chuoi nao do
		 * equals(Object) - So sanh voi doi tuong xac dinh
		 * indexOf(int) - lay ra vi tri dau tien khi gap ki tu
		 * lastIndexOf(int) - lay ra vi tri sau cung khi gap ki tu
		 * length() - lay ra kich thuoc cua chuoi
		 * replace(char, char) - thay the ki tu nay cho ki tu nay
		 * startsWith(string) - bat dau voi chuoi nao do
		 * substring(int) - chuoi con tu vi tri xac dinh
		 * trim() - căt bo khoang trong truoc, sau
		 * equalsIgnoreCase(String) - so sanh bo qua kieu chu
		 */
		
		String name = "Le Ngoc Truong";
		String name2 = "le ngoc truong";
		String name3 = "   Le Ngoc Truong     ";
		
		System.out.println(name.charAt(8)); // T
		System.out.println(name.endsWith("Truong")); // true
		System.out.println(name.equals(name2)); // False
		System.out.println(name.indexOf('N'));
		System.out.println(name.lastIndexOf('o'));
		System.out.println(name.length());
		System.out.println(name.replace('e','ê'));
		System.out.println(name.startsWith(name2)); // false
		System.out.println(name.substring(2)); 
		System.out.println(name3.trim());
		
		
		char[] arrChar = new char[2];
		arrChar[0] = 'a';
		arrChar[1] = 'b';
		String strValue = String.valueOf(arrChar);
		System.out.println(strValue);
		int n = 10;
		while(n%3 < n/ 3) {
			n--;
			System.out.println(1);
		}
	}

}
