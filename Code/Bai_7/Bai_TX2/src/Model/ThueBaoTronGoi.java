/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Lê Ngọc Trường
 */
public class ThueBaoTronGoi extends ThueBao{
   private int soMBUse = -1;
   private final int CUOC = 350000;

    public ThueBaoTronGoi() {
        super();
        soMBUse = -1;
    }

    public ThueBaoTronGoi(String name, String address, String phoneNumber) {
        super(name, address, phoneNumber);
        this.soMBUse = -1;
    }

    public int getSoMBUse() {
        return soMBUse;
    }

    public int getCUOC() {
        return CUOC;
    }

    public void setSoMBUse(int soMBUse) {
        this.soMBUse = soMBUse;
    }
    
}
