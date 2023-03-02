/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TX_1;

import java.util.Objects;

/**
 *
 * @author ngoct
 */
public class Product {
    private String product_ID, product_Name; // dinh danh san pham, ten san pham
    private double product_Price; // gia san pham
    private int product_total; // so luong

    public Product() {
        product_ID = product_Name = "";
        product_Price = 0;
        product_total = 0;
    }

    public Product(String product_ID, String product_Name, double product_Price, int product_total) {
        this.product_ID = product_ID;
        this.product_Name = product_Name;
        this.product_Price = product_Price;
        this.product_total = product_total;
    }

    public String getProduct_ID() {
        return product_ID;
    }

    public String getProduct_Name() {
        return product_Name;
    }

    public double getProduct_Price() {
        return product_Price;
    }

    public int getProduct_total() {
        return product_total;
    }

    public void setProduct_ID(String product_ID) {
        this.product_ID = product_ID;
    }

    public void setProduct_Name(String product_Name) {
        this.product_Name = product_Name;
    }

    public void setProduct_Price(double product_Price) {
        this.product_Price = product_Price;
    }

    public void setProduct_total(int product_total) {
        this.product_total = product_total;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-15s %-15.2f %-15d", product_ID, product_Name, product_Price, product_total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product_ID);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        return Objects.equals(this.product_ID, other.product_ID);
    }
    
    
}   
