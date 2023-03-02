
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author ngoct
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap thong tin nhan vien thu nhat: ");
        System.out.println("Nhap ma nhan vien: ");
        String maNV1 = sc.nextLine();
        System.out.println("Nhap so luong SP: ");
        int soSP1 = sc.nextInt();
        NhanVien nv1 = new NhanVien(maNV1, soSP1);

        System.out.println("Nhap thong tin nhan vien thu hai: ");
        System.out.println("Nhap ma nhan vien: ");
        sc.nextLine(); // Gọi lần đầu tiên để bỏ qua các dòng trống hoặc ký tự còn lại
        String maNV2 = sc.nextLine();
        System.out.println("Nhap so luong SP: ");
        int soSP2 = sc.nextInt();
        NhanVien nv2 = new NhanVien(maNV2, soSP2);

        NhanVien.inTieuDe();
        nv1.inDL();
        nv2.inDL();
        sc.nextLine();
        
        // Mo rong
        System.out.println("Nhap so luong nhan vien: ");
        int n = sc.nextInt();
        sc.nextLine();
        NhanVien[] dsNV = new NhanVien[n];
        System.out.println("Nhap thong tin nhan vien:");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhan vien thu " + (i + 1));
            dsNV[i] = new NhanVien();
            System.out.println("Nhap ma nhan vien:");
            dsNV[i].setMaNV(sc.nextLine());
            System.out.println("Nhap so luong SP:");
            dsNV[i].setSoSP(sc.nextInt());
            sc.nextLine();
        }
        
        System.out.println("Danh sach NV vuot chuan");
        NhanVien.inTieuDe();
        for(NhanVien nv : dsNV){
            if(nv.coVuotChuan()){
                nv.inDL();
            }
        }
    }

}

/*
Do việc sử dụng hàm nextInt() để nhập giá trị số lượng sản phẩm của nhân viên thứ nhất sẽ làm cho dòng kế tiếp (sau nextInt()) trống,
do đó khi gọi hàm nextLine() để nhập mã nhân viên thứ hai, nó sẽ trả về một chuỗi rỗng mà không yêu cầu nhập từ người dùng.
Để khắc phục, bạn có thể gọi một lần nextLine() trống sau nextInt() để xóa bỏ dòng trống.
 */
