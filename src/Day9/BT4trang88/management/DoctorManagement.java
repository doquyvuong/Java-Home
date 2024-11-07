package Day9.BT4trang88.management;

import Day9.BT4trang88.data.Doctor;

import java.util.HashMap;

public class DoctorManagement {
    private HashMap<String, Doctor> doctorList;

    public DoctorManagement() {
        doctorList = new HashMap<>();
    }


    public void addDoctor(String id, Doctor doc) {
        if (id == null || doc == null || id.isEmpty()) {
            System.out.println("Không thể thêm bác sĩ.");
            return;
        }
        if (doctorList.containsKey(id)) {
            System.out.println("Bác sĩ với ID " + id + " đã tồn tại.");
        } else {
            doctorList.put(id, doc);
            System.out.println("Đã thêm bác sĩ thành công!");
        }
    }

    public void display(Doctor doctor){
        System.out.println(doctor);
    }

    public void displayAll() {
        if (doctorList.isEmpty()) {
            System.out.println("Danh sách bác sĩ trống.");
        }else{
            System.out.println("-------------------------------------------------");
            System.out.println("Danh sách bác sĩ: ");
            System.out.printf("%10s%20s%20s","ID","Doctor","availHours\n");
            for (Doctor loop_doc : doctorList.values()) {
                display(loop_doc);
            }
            System.out.println("-------------------------------------------------");
        }

    }

    public void search(String id) {
        Doctor doc = doctorList.get(id);
        if (doc != null) {
            System.out.println("Thông tin bác sĩ tìm thấy: ");
            System.out.printf("%10s%20s%20s","ID","Doctor","availHours\n");
            System.out.printf("%10s%20s%20s\n",doc.getId(),doc.getName(),doc.getAvailHours());
        } else {
            System.out.println("Không tìm thấy bác sĩ với ID: " + id);
        }
    }

}
