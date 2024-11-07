package Day8.BT2trang86;


import Day8.BT2trang86.management.MobilesTest;
import Day8.BT2trang86.util.InputUtils;

import static Day8.BT2trang86.util.InputUtils.inputString;


public class MainMobile {
    public static void main(String[] args) {
        MobilesTest prdMobile = new MobilesTest() ;
        int chon;
        do {
            menu();
            chon = InputUtils.inputDigit(1, 4, "Xin bạn chọn: ");
            switch (chon) {
                case 1:
                    prdMobile.addMobile();
                    break;
                case 2:
                    prdMobile.delete();
                    break;
                case 3:
                    prdMobile.displayAll() ;
                    break;
                default:
                    System.out.println("---------Thoát chương trình--------");
            }
        } while (chon != 4);
    }

    public static void menu() {
        System.out.println("1. Thêm mới điện thoại");
        System.out.println("2. Tìm kiếm và xoá điện thoại trong danh sách");
        System.out.println("3. Hiển thị danh sách");
        System.out.println("4. Thoát");
    }
}
