/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TX_1;

/**
 *
 * @author ngoct
 */
public class Tile extends Product {
    private double length;
    private double width;
    private double thickness;

    public Tile() {
        super();
        length = width = thickness = 0;
    }

    public Tile(double length, double width, double thickness, String product_ID, String product_Name, double product_Price, int product_total) {
        super(product_ID, product_Name, product_Price, product_total);
        this.length = length;
        this.width = width;
        this.thickness = thickness;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getThickness() {
        return thickness;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    @Override
    public String toString() {        
        return String.format(super.toString() + "%-10.2f %-10.2f %-10.2f %n", length, width, thickness);
    }
    
}
