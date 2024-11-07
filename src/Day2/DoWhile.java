package Day2;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
                System.out.println("Lua chon bai kiem tra:");
            System.out.println("1) Aptitude");
            System.out.println("2) English");
            System.out.println("3) Mathematics");
            System.out.println("4) General Knowledge");
            System.out.println("5) Exit");
            chon  = sc.nextInt();

            switch (chon){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default: System.out.println("Lua chon cua ban khong co,vui long nhap lai.");
            }
        }while (chon != 5);
    }
}
