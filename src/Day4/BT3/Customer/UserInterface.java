package Day4.BT3.Customer;

import Day4.BT3.Music.CompactDisc;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CDCreator cdCreator = new CDCreator(10,12);

        int nguoidungchon;
        do {
            System.out.println("-------------------MENU-----------------------");
            System.out.println("1. Thêm 1 CD nhạc mới vào bộ sưu tập");
            System.out.println("2. Thêm 1 CD phim vào bộ sưu tập");
            System.out.println("3. Hiển thị toàn bộ CD nhạc trong bộ sưu tập");
            System.out.println("4. Hiển thị toàn bộ CD phim trong bộ sưu tập");
            System.out.println("5. Thoát chương trình");
            System.out.println("----------------------------------------------");
            System.out.println("Xin moi chon :");
            nguoidungchon =sc.nextInt();

            switch (nguoidungchon){
                case 1:
                    System.out.print("Nhap Title: ");
                    String musicTitle = sc.next();
                    System.out.print("Nhap Artist: ");
                    String artist = sc.next();
                    System.out.print("Nhap Price: ");
                    double musicPrice = sc.nextDouble();
                    System.out.print("Nhap Code: ");
                    String musicCode = sc.next();
                    CompactDisc newMusicCD = new CompactDisc(musicTitle,artist,musicPrice,musicCode);
                    cdCreator.addMusicCD(newMusicCD);
                    break;
                case 2:
                    System.out.print("Nhap Title: ");
                    String movieTitle = sc.next();
                    System.out.print("Nhap Price: ");
                    double moviePrice = sc.nextDouble();
                    System.out.print("Nhap Code: ");
                    String movieCode = sc.next();
                    Day4.BT3.Movie.CompactDisc newMovie = new Day4.BT3.Movie.CompactDisc(movieTitle,moviePrice,movieCode);
                    cdCreator.addMovieCD(newMovie);
                    break;
                case 3: cdCreator.displayAllMusic(); break;
                case 4: cdCreator.displayAllMovie(); break;
                case 5: System.out.println("Thoat."); break;
                default: System.out.println("<----------------Moi chon lai----------------->");
            }
        }while (nguoidungchon !=5);
    }
}
