/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lê Ngọc Trường
 */
public class Ex_KichCo extends Exception{
    public Ex_KichCo(double x){
        super("Loi: " + x + " khong hop le. Ban kinh phai lon hon 0");
    }
}

