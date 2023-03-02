/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLPhongThi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author IT Supporter
 */
public class DBEngine {

    /**
     * Serial 1 đối tượng xuống file
     *
     * @param fileName file chỉ định
     * @param obj: đối tượng cần serial
     * @throws Exception
     */
    public void luuFile(String fileName, Object obj) throws Exception {
        //Tạo luồng ghi file
        FileOutputStream fs = new FileOutputStream(fileName);
        //Tạo luồng để serial đối tượng
        ObjectOutputStream os = new ObjectOutputStream(fs);
        //chuyển tải đối tượng tới đích (tập tin)
        os.writeObject(obj);
        //đóng luồng
        fs.close();
        os.close();
    }

    /** 
     * khoi phuc (deserial) 1 doi tuong da duoc serial truoc do len bo nho
     * @param fileName : file chi dinh
     * @return doi tuong duoc phuc hoi
     * @throws Exception
     */
    public Object docFile(String fileName) throws Exception{
        Object kq = null;
        // Tao luong doc file da duoc serial
        FileInputStream fi = new FileInputStream(fileName);
        // Tao luong de Deserialize doi tuong
        ObjectInputStream ois = new ObjectInputStream(fi);
        // Tien hanh khoi phuc doi tuong
        kq = ois.readObject();
        // dong luong
        fi.close();
        ois.close();
        
        return kq;
    }
}
