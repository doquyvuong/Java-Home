package Day9.BT3trang87;

import Day9.BT3trang87.management.LaptopManagement;
import static Day9.BT3trang87.util.InputUtils.inputDigit;


public class MainLaptop {
    public static void main(String[] args) {
        LaptopManagement prdLaptop = new LaptopManagement() ;
        int chon;
        do {
            menu();
            chon = inputDigit(1, 4, "Xin bạn chọn: ");
            switch (chon) {
                case 1:
                    prdLaptop.addLaptop();
                    break;
                case 2:
                    prdLaptop.findAndDisplayLaptop();
                    break;
                case 3:
                    prdLaptop.sortAndDisplay(true);
                    break;
                default:
                    System.out.println("---------Thoát chương trình--------");
            }
        } while (chon != 4);
    }

    public static void menu() {
        System.out.println("1. Thêm laptop mới");
        System.out.println("2. Tìm thông tin laptop và hiển thị");
        System.out.println("3. Xuất laptop tăng dần theo id");
        System.out.println("4. Thoát");
    }
}
