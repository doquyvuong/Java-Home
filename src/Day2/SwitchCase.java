package Day2;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap thang,nam : ");
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        switch ( month)
        { case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: System.out.println("Thang co 31 ngay"); break;
            case 4:
            case 6:
            case 9:
            case 11: System.out.println("Thang co 30 ngay"); break;
            case 2: if(year % 400 == 0 || year % 4 == 0 && year % 100 !=0){
                System.out.println("Day la nam nhuan,thang 2 co 29 ngay");
                    }else{
                System.out.println("Day la nam khong nhuan,thang 2 co 28 ngay");
                    }
                    break;
            default: System.out.println("Vui long nhap thang tu 1 --> 12 ");break;
        }
    }
}
