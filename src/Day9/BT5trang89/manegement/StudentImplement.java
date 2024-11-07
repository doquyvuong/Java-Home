package Day9.BT5trang89.manegement;

import Day9.BT5trang89.data.Student;

import java.util.HashMap;
import java.util.Map;

import static Day9.BT5trang89.util.InputUtils.inputString;

public class StudentImplement<K,V> {
    Map<K, V> StuHash ;

    public StudentImplement() {
        StuHash = new HashMap<>();
    }


    public void addStudent() {
        String ID = inputString("Nhập ID học sinh (định dạng VN.033/xxxxxx-xxxx): ");
        String name = inputString("Nhập tên học sinh: ");
        String phone = inputString("Nhập số điện thoại học sinh (định dạng xx-xxx-xxxxxx-xx): ");
        String address = inputString("Nhập địa chỉ học sinh: ");

        if (isID(ID) && !name.isEmpty() && isPhone(phone)) {
            Student student = new Student(ID, name, phone, address);
            StuHash.put((K) ID, (V) student);
            System.out.println("Thêm học sinh thành công.");
        } else {
            System.out.println("Dữ liệu không hợp lệ. Vui lòng thử lại.");
        }
    }

    private boolean isID(String id) {
        return id.matches("VN\\.033/\\d{6}-\\d{4}");
    }

    private boolean isPhone(String phone) {
        return phone.matches("\\d{2}-\\d{3}-\\d{6}-\\d{2}");
    }

    public void displayAll() {
        if (StuHash.isEmpty()) {
            System.out.println("Danh sách học sinh trống.");
        }else{
            System.out.println("-------------------------------------------------");
            System.out.println("Danh sách học sinh: ");
            System.out.printf("%10s%20s%20s%20s","ID","Name","Phone","Address\n");
            StuHash.forEach((key,student) -> System.out.println(student));
            System.out.println("-------------------------------------------------");
            System.out.printf("Số lượng học sinh: %50s",StuHash.size());
        }
    }
}
