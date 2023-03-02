/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package example_linkedhashset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/**
 *
 * @author ngoct
 */
public class Example_LinkedHashSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Khai báo và khởi tạo tập hợp
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // Thêm các phần tử vào tập hợp
        set.add(5);
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(5); // thêm phần tử trùng lặp, tập hợp vẫn chỉ có 5 phần tử

        // In ra các phần tử trong tập hợp
        System.out.println("Các phần tử trong tập hợp là: " + set);

        // Lấy phần tử đầu tiên của tập hợp
        int first = set.iterator().next();
        System.out.println("Phần tử đầu tiên trong tập hợp là: " + first);

        // Xóa một phần tử khỏi tập hợp
        set.remove(3);
        System.out.println("Các phần tử trong tập hợp sau khi xóa 3 là: " + set);

        // Sửa một phần tử trong tập hợp
        set.remove(4);
        set.add(6);
        System.out.println("Các phần tử trong tập hợp sau khi sửa 4 thành 6 là: " + set);

        // Chuyển đổi tập hợp sang mảng
        Integer[] arr = set.toArray(new Integer[0]);
        System.out.println("Mảng chứa các phần tử trong tập hợp là: " + Arrays.toString(arr));

        // Tìm phần tử lớn nhất và nhỏ nhất trong tập hợp
        int min = Collections.min(set);
        int max = Collections.max(set);
        System.out.println("Phần tử nhỏ nhất trong tập hợp là: " + min);
        System.out.println("Phần tử lớn nhất trong tập hợp là: " + max);

        // Sắp xếp tập hợp theo thứ tự giảm dần
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
        LinkedHashSet<Integer> sortedSet = new LinkedHashSet<>(list);
        System.out.println("Các phần tử trong tập hợp sau khi sắp xếp giảm dần là: " + sortedSet);

    }

}
