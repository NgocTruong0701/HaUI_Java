/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Lê Ngọc Trường
 */
public class ThueBaoTheoDL extends ThueBao{
    private int soMBUse;
    private int cuocUse;

    public ThueBaoTheoDL() {
        super();
        soMBUse = cuocUse = 0;
    }

    public ThueBaoTheoDL(int soMBUs, String name, String address, String phoneNumber) {
        super(name, address, phoneNumber);
        this.soMBUse = soMBUs;
        this.cuocUse = 30000 + soMBUs*50;
    }

    public int getSoMBUse() {
        return soMBUse;
    }

    public int getCuocUse() {
        return cuocUse;
    }

    public void setSoMBUse(int soMBUse) {
        this.soMBUse = soMBUse;
    }

    public void setCuocUse(int cuocUse) {
        this.cuocUse = cuocUse;
    }
}
