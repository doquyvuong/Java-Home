package Day2;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        int LuongCoBan = 650000 ;
        double Heso = 0 ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap tham nien cong tac: ");
        float TNCT = scanner.nextFloat();
        if(TNCT <12) {
            Heso = 1.92 ;
        } else if(TNCT <36 && TNCT>=12) {
            Heso = 2.34 ;
        } else if (TNCT>=36 && TNCT<60) {
            Heso = 3 ;
        } else if (TNCT>=60) {
            Heso = 4.5 ;
        }

        double Luong = LuongCoBan * Heso;

        System.out.println("Luong nhan vien = " +Luong+ " dong");
    }
}
