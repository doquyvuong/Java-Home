package Day9.BT5trang89;


import Day9.BT5trang89.data.Student;
import Day9.BT5trang89.manegement.StudentImplement;

import static Day9.BT5trang89.util.InputUtils.inputDigit;

public class StudentTest{
    public static void main(String[] args) {
        StudentImplement <String , Student> stdProduct = new StudentImplement<>();
            int chon;
            do {
                menu();
                chon = inputDigit(1, 4, "Xin bạn chọn: ");
                switch (chon) {
                    case 1:
                        stdProduct.addStudent();
                        break;
                    case 2:
                        stdProduct.displayAll();
                        break;
                    case 3:
                        System.out.println("Lưu danh sách học sinh vào cơ sở dữ liệu.");
                        break;
                    default:
                        System.out.println("---------Thoát chương trình--------");
                }
            } while (chon != 4);
        }


        public static void menu() {
            System.out.println("1. Đăng ký học sinh");
            System.out.println("2. Hiển thị tất cả học sinh");
            System.out.println("3. Lưu danh sách các học sinh");
            System.out.println("4. Thoát");
        }


}
