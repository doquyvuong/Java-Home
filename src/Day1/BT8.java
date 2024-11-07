package Day1;

import java.util.Scanner;

public class BT8 {
    public static void main(String[] args) {
        Scanner canh = new Scanner(System.in) ;
        float a,b ;
        System.out.println("Nhap 2 canh cua hinh chu nhat : ");
        a = canh.nextFloat();
        b = canh.nextFloat();
        float dienTich = a*b ,chuVi = a+b ;
        System.out.println("Dien tich = " +dienTich+ " Chu vi = " +chuVi);
    }
}
