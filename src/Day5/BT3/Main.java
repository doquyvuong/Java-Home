package Day5.BT3;

import Day5.BT4.ThanhVien;
import Day5.BT4.VangLai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShapeCollection listshape = new ShapeCollection();
        Scanner sc = new Scanner(System.in) ;
        int chon;
        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Thêm hình tròn");
            System.out.println("2. Thêm hình chữ nhật");
            System.out.println("3. Xuất toàn bộ thông tin các hình học");
            System.out.println("4. Thoát chương trình");
            chon = sc.nextInt();
            switch (chon){
                case 1:
                    Circle circle =new Circle(5);
                    listshape.AddCircle(circle);
                    break;
                case 2:
                    Rectangle rectangle = new Rectangle(5,6);
                    listshape.AddRectangle(rectangle);
                    break;
                case 3:
                    listshape.show();
                    break;
                case 4:
                    System.out.println("Thoát chương trình"); break;
                default:
                    System.out.println("---------Moi chon lai--------");
            }

        }while (chon != 4);
    }
}
