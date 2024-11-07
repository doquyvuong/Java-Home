package Day1;

import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        Scanner Songuyen = new Scanner(System.in) ;
        int a ;
        int b ;
        System.out.println("Nhap 2 so nguyen : ");
        a = Songuyen.nextInt();
        b = Songuyen.nextInt();
        int Tong = a + b ;
        int Hieu = a-b ;
        int Tich = a*b ;
        float Thuong =(float) a / b;
        System.out.println("Tong = " +Tong +" Hieu = " +Hieu +" Tich = " +Tich + " Thuong = " +Thuong);
    }
}
