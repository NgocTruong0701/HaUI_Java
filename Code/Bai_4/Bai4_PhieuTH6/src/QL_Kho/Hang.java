/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_Kho;

/**
 *
 * @author ngoct
 */
abstract class Hang {
    public String maHang, tenHang;
    public int soLuongTon;
    public double donGia;

    abstract public void nhap();
    abstract public void xuat();
}
