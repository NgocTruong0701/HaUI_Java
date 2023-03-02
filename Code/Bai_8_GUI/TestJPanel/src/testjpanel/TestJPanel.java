/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testjpanel;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Lê Ngọc Trường
 */
public class TestJPanel extends JFrame{

    public TestJPanel() {
        // Create JFrame va setting 1 so thuoc tinh cua JFrame
        super("Example JPanel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        // Tao cac JPanel va thiet lap border
        JPanel panel1 = new JPanel(new BorderLayout());
        panel1.setBorder(new TitledBorder("Table Information"));
        
        JPanel panel2 = new JPanel(new BorderLayout());
        panel2.setBorder(new TitledBorder("Zone Button"));
        
        // Tao ArrayList Person de dua vao DefaultTableModel
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Le Van A", 19, "HN"));
        personList.add(new Person("Le Thi B", 20, "HCM"));
        personList.add(new Person("Hoang Van C", 21, "TH"));
        
        // Tao DefaultTableModel va them row tieu de, va row thong tin person
        DefaultTableModel model = new DefaultTableModel(){
            // Ghi de phương thức cho phép chỉnh sửa các ô trừ dòng đầu tiên (Dòng tiêu đề)
            @Override
            public boolean isCellEditable(int row, int column) {
                // không cho phép chỉnh sửa cột 0 và 1
                if(column == 0 || column == 1){
                    return false;
                }
                return true;
            }
            
            
        };
        // Them 3 cột tiêu đề
        model.addColumn("Name");
        model.addColumn("Age");
        model.addColumn("Address");
        
        // Dùng vòng lặp để duyệt qua mảng phần tử và add vào DefaultTableMode
        for(Person person : personList){
            Object[] row = {person.getName(), person.getAge(), person.getAddress()};
            model.addRow(row);
        }
        
        // Tạo JTable vào truyền DefaultTableModel để truyền dữ liệu vào hiển thị trong bảng
        JTable table = new JTable(model);
        
        // Tạo JScrollPane để đảm bảo có thể cuộn dòng khi hiển thị quá nhiều dòng
        JScrollPane scrollPane = new JScrollPane(table);
        
        // Add table vào panel1 
        panel1.add(scrollPane, BorderLayout.CENTER);
        
        // Tao 2 button và thêm vào panel2
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        panel2.add(btn1, BorderLayout.WEST);
        panel2.add(btn2, BorderLayout.EAST);
        
        // Create 1 Panel để hiển thị thông tin của 1 dòng vào các TextField
        JPanel panel3 = new JPanel(new BorderLayout());
        
        
        // Add Panel1 và Panel2 vào JFrame
        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.SOUTH);
        
        // cấu hình kích thước của khung chương trình cho phù hợp với các thành phần bên trong của nó
        pack();
        
        // Hiển thị lên màn hình
        setVisible(true);
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new TestJPanel();
    }
    
}
