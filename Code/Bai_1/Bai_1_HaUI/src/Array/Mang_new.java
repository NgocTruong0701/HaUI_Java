package Array;

import java.util.ArrayList;
import java.util.List;

public class Mang_new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tạo một ArrayList
        List<String> list = new ArrayList<String>();
        // Thêm phần tử vào ArrayList
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Python");
        list.add("C");

        // Sử dụng vòng lặp for each để duyệt ArrayList
        list.forEach(item -> System.out.print(item + " "));
        
	}

}
