package Day8.BT2trang86.management;

import Day8.BT2trang86.data.Mobiles;

import java.util.HashSet;

import java.util.Scanner;

import java.util.regex.Pattern;

import static Day8.BT2trang86.util.InputUtils.inputFloatDigit;
import static Day8.BT2trang86.util.InputUtils.inputString;


public class MobilesTest {
    private  final HashSet<Mobiles> mobilesList;
    Scanner sc = new Scanner(System.in);
    public MobilesTest() {
        mobilesList =new HashSet<>();
    }

    public void addMobile() {
         String newID = inputString("Nhập ID sản phẩm: ");
            if(!isID(newID)) {
                    System.out.println("ID khong hop le.");
            }
            for(Mobiles mbl: mobilesList){
                if(mbl.getMobile_ID().equals(newID)){
                    System.out.println("ID da ton tai");
                }
            }
         String model = getModelFromID(newID);
         String color = inputString("Nhập màu sản phẩm: ");
         if (color.isEmpty()) {
            System.out.println("Màu k được bỏ trống");
            return;
         }
         float price = inputFloatDigit(0,20000000,"Nhập giá tiền sản phẩm");
         mobilesList.add(new Mobiles(newID, model, color, price));
    }

    public boolean isID(String valueID){
        String customPattern = "^(SS|SM|NK|MT)\\d{4}$";
        return Pattern.matches(customPattern, valueID);
    }

    private String getModelFromID(String mobile_ID) {
        String prefix = mobile_ID.substring(0, 2);
        String modelNumber = mobile_ID.substring(2);
        switch (prefix) {
            case "SM": return "Seimen " + modelNumber;
            case "SS": return "Samsung " + modelNumber;
            case "MT": return "Motorola " + modelNumber;
            case "NK": return "Nokia " + modelNumber;
            default: return "Unknown";
        }
    }

    public void displayAll() {
        System.out.println("-------------------------------------------------");
        System.out.println("Danh sách sản phẩm: ");
        System.out.printf("%10s%20s%20s%20s", "ID", "Model","color","Giá sản phẩm\n");
        for (Mobiles mbl : mobilesList) {
            System.out.println(mbl);
        }
        System.out.println("-------------------------------------------------");
        System.out.printf("%70s", "Total products: " + mobilesList.size() + "\n");
    }

    public void delete(){
        String IDtoDelete = inputString("Nhập ID của điện thoại cần xoá: ");
        Mobiles mobileToDelete = null ;
        for (Mobiles mobile : mobilesList) {
            if (mobile.getMobile_ID().equals(IDtoDelete)) {
                mobileToDelete = mobile;
            }
        }
        if (mobileToDelete != null) {
            System.out.print("Bạn có chắc muốn xoá không? (y/n): ");
            String confirm = sc.nextLine();
            if (confirm.equalsIgnoreCase("y")) {
                mobilesList.remove(mobileToDelete);
                System.out.println("Điện thoại đã được xoá thành công.");
            } else {
                System.out.println("Huỷ bỏ quá trình xoá.");
            }
        }else {
            System.out.println("Điện thoại không tồn tại.");
        }
    }
}
