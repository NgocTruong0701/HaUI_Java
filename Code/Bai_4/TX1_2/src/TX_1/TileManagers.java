/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TX_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ngoct
 */
public class TileManagers implements TileManager {

    static List<Tile> dsTile = new ArrayList<>();

    @Override
    public boolean addTile(Tile t) {
        if (dsTile.contains(t)) {
            return false;
        }
        dsTile.add(t);
        return true;
    }

    @Override
    public boolean editTile(Tile t) {
        int index = dsTile.indexOf(t);
        if (index != -1) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap Name: ");
            dsTile.get(index).setProduct_Name(sc.nextLine());
            System.out.println("Nhap gia: ");
            dsTile.get(index).setProduct_Price(sc.nextDouble());
            sc.nextLine();
            System.out.println("Nhap so luong: ");
            dsTile.get(index).setProduct_total(sc.nextInt());
            sc.nextLine();
            System.out.println("Nhap chieu dai gach: ");
            dsTile.get(index).setLength(sc.nextDouble());
            sc.nextLine();
            System.out.println("Nhap chieu rong gach: ");
            dsTile.get(index).setWidth(sc.nextDouble());
            sc.nextLine();
            System.out.println("Nhap do day gach: ");
            dsTile.get(index).setThickness(sc.nextDouble());
            sc.nextLine();
            return true;
        }
        return false;
    }

    @Override
    public boolean delTile(Tile t) {
        int index = dsTile.indexOf(t);
        if (index != -1) {
            dsTile.remove(index);
            return true;
        }
        return false;
    }

    // Tim kiem theo ten
    @Override
    public List<Tile> searchTile(String name) {
        List<Tile> dsSearchTile = new ArrayList<>();
        for (Tile t : dsTile) {
            if (t.getProduct_Name().equals(name)) {
                dsSearchTile.add(t);
            }
        }

        return dsSearchTile;
    }

    @Override
    public List<Tile> sortedTile() {
        Comparator<Tile> c = new Comparator<Tile>() {
            @Override
            public int compare(Tile o1, Tile o2) {
                return Double.compare(o1.getProduct_Price(), o2.getProduct_Price());
            }
        };
        List<Tile> dsSortTile = new ArrayList<>();
        dsSortTile.addAll(dsTile);

        dsSortTile.sort(c);
        return dsSortTile;
    }
}
