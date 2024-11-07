package Day2;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        int LuongCoBan = 650000 ;
        float Heso ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap tham nien cong tac: ");
        float TNCT = scanner.nextFloat();
        if(TNCT <12) {
            System.out.println("Luong nhan vien = " +LuongCoBan*1.92);
        } else if(TNCT <36 && TNCT>=12) {
            System.out.println("Luong nhan vien = " +LuongCoBan*2.34);
        } else if (TNCT>=36 && TNCT<60) {
            System.out.println("Luong nhan vien = " +LuongCoBan*3);
        } else if (TNCT>=60) {
            System.out.println("Luong nhan vien = " +LuongCoBan*4.5);
        }
    }
}
