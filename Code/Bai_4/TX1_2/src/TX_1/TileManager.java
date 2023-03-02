/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TX_1;

import java.util.List;

/**
 *
 * @author ngoct
 */
public interface TileManager {
    public boolean addTile(Tile t); // them 1 thong tin gach op lat vao he thong quan ly
    public boolean editTile(Tile t); // sua thong tin gach op lat da luu;
    public boolean delTile(Tile t); // xoa thong tin gach op lat da luu
    public List<Tile> searchTile(String name); // tim kiem theo ten, theo gia va theo thuoc tinh duoc de xuat o tile 
    public List<Tile> sortedTile(); // sap xep theo gia, theo kich thuoc, theo cong dung tu de xuat cua tile
}
