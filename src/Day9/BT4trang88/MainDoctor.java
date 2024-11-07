package Day9.BT4trang88;

import Day9.BT4trang88.data.Doctor;
import Day9.BT4trang88.management.DoctorManagement;

import static Day9.BT4trang88.util.InputUtils.*;


public class MainDoctor {
    public static void main(String[] args) {
        DoctorManagement prdDoctor = new DoctorManagement() ;
        int chon;
        do {
            menu();
            chon = inputDigit(1, 4, "Xin bạn chọn: ");
            switch (chon) {
                case 1:
                    String id = inputString("Nhập id: ");
                    String name = inputString("Nhập tên bác sĩ: ");
                    int avaihours = inputINT("Nhập giờ: ");
                    Doctor doctor = new Doctor(id,name,avaihours);
                    prdDoctor.addDoctor(id,doctor);
                    break;
                case 2:
                    String idtoFind = inputString("Nhập ID bác sĩ: ");
                    prdDoctor.search(idtoFind);
                    break;
                case 3:
                    prdDoctor.displayAll();
                    break;
                default:
                    System.out.println("---------Thoát chương trình--------");
            }
        } while (chon != 4);
    }


    public static void menu() {
        System.out.println("1. Đăng ký bác sĩ mới");
        System.out.println("2. Tìm kiếm bác sĩ theo mã số");
        System.out.println("3. In danh sách bác sĩ");
        System.out.println("4. Thoát");
    }
}
