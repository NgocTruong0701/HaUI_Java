/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package example_jtable_student;

import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author ngoct
 */
class StatusCellRenderer extends JCheckBox implements TableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if(value instanceof Boolean){
            setSelected((Boolean)value);
            setText(isSelected ?"Ban" : "Ranh");
        }
        return this;
    }
    
}

public class Example_JTable_Student extends JFrame{

    public Example_JTable_Student() {
        // create table model with data
        Object[][] data = {{"1", "John", "20"}, {"2", "Mary", "19"}, {"3", "Tom", "21"}};
        String[] columnNames = {"ID", "Name", "Age"};
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        
        // add "Trang thai" column to the model
        model.addColumn("Trang thai", new Boolean[]{false, false, false});

        // create table with model
        JTable table = new JTable(model);

        // add checkbox column
        TableColumn checkboxColumn = new TableColumn(model.getColumnCount() -1);
        
        // Set custom renderer for "Trang thai" column
        TableColumn statusColumn = table.getColumn("Trang thai");
        statusColumn.setCellRenderer(new StatusCellRenderer());

        // add table to scroll pane
        JScrollPane scrollPane = new JScrollPane(table);

        // add scroll pane to frame
        add(scrollPane);

        // set frame properties
        setTitle("Student Table Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Example_JTable_Student();
    }
    
}
