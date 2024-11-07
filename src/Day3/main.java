package Day3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập thông tin nhân viên 1:");
        NhanVien nhanvien1 = new NhanVien("NV1",600);
        nhanvien1.setSoSP(400);
        System.out.println(nhanvien1);


        System.out.println("Nhập thông tin nhân viên 2:");
        System.out.print("Mã NV: ");
        String maNV2 = sc.nextLine();
        System.out.print("Số SP: ");
        int soSP2 = sc.nextInt();
        NhanVien nhanvien2 = new NhanVien(maNV2, soSP2);
        System.out.println(nhanvien2);
    }
}
