
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Lê Ngọc Trường
 */
public class File {

    String path = "E:\\HaUI\\Nam_3_Ki_1\\Java\\Code\\Bai_7\\DSHinhTron.txt";

    public void ghiFIle(Object obj) {
        try {
            // Tao luong ghi file
            FileOutputStream fout = new FileOutputStream(path);
            // Tao luong ghi doi tuong
            ObjectOutputStream ob = new ObjectOutputStream(fout);
            // chuyen doi tuong vao file tong qua luong ghi doi tuong
            ob.writeObject(obj);
            fout.close();
            ob.close();
        } catch (Exception e) {
            System.out.println("Co loi: " + e.toString());
        }
    }

    public Object docFile() {
        Object kq = null;
        try {
            // tao luong doc file
            FileInputStream fin = new FileInputStream(path);
            // tao luong doc doi tuong tu luong file
            ObjectInputStream obin = new ObjectInputStream(fin);
            kq = obin.readObject();
            fin.close();
            obin.close();
        }catch(Exception e){
            System.out.println("Co loi: " + e.toString());
        }
        return kq;
    }
}
