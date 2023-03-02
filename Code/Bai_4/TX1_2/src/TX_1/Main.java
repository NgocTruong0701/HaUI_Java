/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TX_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ngoct
 */
public class Main {
    public static void main(String[] args) {
        TileManagers ds = new TileManagers();
        Scanner sc = new Scanner(System.in);
        int luachon = 0;
        do{
            System.out.println("1. Them gach vao danh sach.");
            System.out.println("2. Sua thong tin gach trong danh sach.");
            System.out.println("3. Xoa thong tin gach trong danh sach.");
            System.out.println("4. Tim kiem gach trong danh sach.");
            System.out.println("5. Sap xep danh sach gach theo gia.");
            System.out.println("6. Thoat.");
            luachon = sc.nextInt();
            switch(luachon){
                case 1:
                    sc.nextLine();
                    System.out.println("Nhap thong tin gach can them:");
                    System.out.println("Nhap ID: ");
                    String id = sc.nextLine();
                    System.out.println("Nhap Name: ");
                    String name = sc.nextLine();
                    System.out.println("Nhap Gia: ");
                    double price = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Nhap so luong: ");
                    int total = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhap chieu dai gach: ");
                    double length = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Nhap chieu rong gach:");
                    double width = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Nhap do day gach: ");
                    double thickness = sc.nextDouble();
                    sc.nextLine();
                    Tile t = new Tile(length, width, thickness, id, name, price, total);
                    if(ds.addTile(t)){
                        System.out.println("Them thanh cong.");
                    }
                    else{
                        System.out.println("Them khong thanh cong.");
                    }
                    break;
                    
                case 2:
                    Tile t_edit = new Tile();
                    System.out.println("Nhap ID gach can sua:");
                    sc.nextLine();
                    t_edit.setProduct_ID(sc.nextLine());
                    if(ds.editTile(t_edit))
                    {
                        System.out.println("Them thanh cong.");
                    }
                    else{
                        System.out.println("Khong tim thay gach co ten nay ");
                    }
                    break;
                    
                case 3:
                    Tile t_del = new Tile();
                    System.out.println("Nhap ID gach can xoa:");
                    sc.nextLine();
                    t_del.setProduct_ID(sc.nextLine());
                    if(ds.delTile(t_del))
                    {
                        System.out.println("Xoa thanh cong.");
                    }
                    else{
                        System.out.println("Xoa khong thanh cong.");
                    }
                    break;
                    
                case 4:
                    System.out.println("Nhap ten gach can tim kiem: ");
                    sc.nextLine();
                    String nameSearch = sc.nextLine();
                    List<Tile> dsSearch = new ArrayList<>();
                    dsSearch.addAll(ds.searchTile(nameSearch));
                    if(dsSearch.isEmpty()){
                        System.out.println("Khong tim thay ten gach nay");
                    }
                    else{
                        System.out.println("Danh sach gach co ten tim duoc: ");
                        for(Tile tt : dsSearch){
                            System.out.print(tt.toString());
                        }
                    }
                    break;
                    
                case 5:
                    List<Tile> dsSorted = new ArrayList<>();
                    System.out.println("Danh sach sau khi da sap xep theo gia: ");
                    dsSorted.addAll(ds.sortedTile());
                    for(Tile t1 : dsSorted){
                        System.out.print(t1.toString());
                    }
                    break;
                    
                case 6:
                    return;
                default:
                    return;
            }
        }
        while(luachon != 6);
    }
}
