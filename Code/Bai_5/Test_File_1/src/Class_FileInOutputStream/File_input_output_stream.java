/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class_FileInOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author ngoct
 */
public class File_input_output_stream {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try{
            in = new FileInputStream("E:\\Download\\Nam_3_Ki_1\\Java\\Lession\\Lession_5\\Test.txt");
            out = new FileOutputStream("E:\\Download\\Nam_3_Ki_1\\Java\\Lession\\Lession_5\\Test.txt");
            int c ;
            while((c = in.read()) != -1){
                out.write(c);
            }
        }
        finally{
            if(in != null){
                in.close();
            }
            if(out != null){
                out.close();
            }
        }
    }
}
