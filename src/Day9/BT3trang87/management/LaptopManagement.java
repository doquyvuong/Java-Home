package Day9.BT3trang87.management;

import Day9.BT3trang87.data.Comparator;
import Day9.BT3trang87.data.Laptop;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;


import static Day9.BT3trang87.util.InputUtils.inputPriceDigit;
import static Day9.BT3trang87.util.InputUtils.inputString;


public class LaptopManagement {
    private  final TreeSet<Laptop> laptopList = new TreeSet<>();

    public void addLaptop() {
        Laptop laptop = new Laptop();
        String Laptop_ID = inputString("Xin mời nhập ID : ");
        if(laptop.customID(Laptop_ID)) {
            for(Laptop loop_LT: laptopList){
                if(loop_LT.getLaptop_ID().equals(Laptop_ID)){
                    System.out.println("ID đã tồn tại");
                    break ;
                }
            }
            String Laptop_name = inputString("Xin mời nhập tên laptop: ");
            laptop.customName(Laptop_name);
            String Laptop_country = inputString("Xin mời quốc gia: ");
            Laptop_country = laptop.customCountry(Laptop_country);
            float Laptop_price = inputPriceDigit(0,"Xin mời nhập giá: ");
            laptop = new Laptop(Laptop_ID,Laptop_name,Laptop_country,Laptop_price) ;
            laptopList.add(laptop) ;
        }else{
            System.out.println("ID không hợp lệ.");
        }

    }

    public void findAndDisplayLaptop() {
        String IDtoFind = inputString("Nhập ID của Laptop cần tìm: ");
        if(laptopList.isEmpty()) {
            System.out.println("Danh sách trống.");
        }
        for (Laptop loop_LT : laptopList) {
            if (loop_LT.getLaptop_ID().equals(IDtoFind)) {
                System.out.println("Đã tìm thấy Laptop.");
                System.out.printf("%10s%20s%20s%20s", "ID", "Name","Country","Giá Laptop\n");
                System.out.printf("%10s%20s%20s%20s\n",loop_LT.getLaptop_ID(),loop_LT.getName(), loop_LT.getCountry(),loop_LT.getPrice());
            } else {
                System.out.println("Không tìm thấy Laptop.");
            }
        }

    }

    public void sortAndDisplay(boolean isAsc) {
        List<Laptop> list_sort;
        list_sort = new ArrayList<>();
        Comparator comparator = new Comparator() ;
        if(isAsc){
            list_sort.sort(comparator.new SortByPriceAscending());
        } else {
            list_sort.sort(comparator.new SortByPriceDescending());
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Danh sách Laptop: ");
        System.out.printf("%10s%20s%20s%20s", "ID", "Name","Country","Giá Laptop\n");
        for (Laptop loop_LT : list_sort) {
            System.out.println(loop_LT);
        }
        System.out.println("-------------------------------------------------");
        System.out.printf("%70s", "Total products: " + list_sort.size() + "\n");
    }

}

