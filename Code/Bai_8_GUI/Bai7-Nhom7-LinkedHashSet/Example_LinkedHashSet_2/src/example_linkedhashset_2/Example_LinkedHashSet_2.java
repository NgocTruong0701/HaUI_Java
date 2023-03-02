/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package example_linkedhashset_2;

import java.util.LinkedHashSet;

/**
 *
 * @author ngoct
 */
public class Example_LinkedHashSet_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedHashSet<Student> students = new LinkedHashSet<>();

// Thêm các đối tượng Student vào tập hợp
        students.add(new Student(1, "John", 18, "123 Main St"));
        students.add(new Student(2, "Jane", 20, "456 Park Ave"));
        students.add(new Student(3, "Bob", 19, "789 Elm St"));

// In ra tất cả các đối tượng Student trong tập hợp
        for (Student student : students) {
            System.out.println(student);
        }

// Xóa một đối tượng Student khỏi tập hợp
        students.remove(new Student(2, "Jane", 20, "456 Park Ave"));

    }

}
