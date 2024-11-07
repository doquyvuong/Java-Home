package Day5.BT3;

import java.util.Arrays;
import java.util.Scanner;

import Day5.BT3.Circle;

public class ShapeCollection {

    Scanner sc =new Scanner(System.in) ;
    Shape[] listshape;
    int count = 0;

    public ShapeCollection()
    {
        listshape = new Shape[5];
        count = 0;
    }

    public void AddCircle(Shape newCircle) {
        if(count == 5){
            System.out.println("So luong da toi da.");
        }
        listshape[count++] = newCircle ;
        System.out.println("Them hinh tron thanh cong");
    }

    public void AddRectangle(Shape newRectangle) {
        if(count == 5){
            System.out.println("So luong da toi da.");
        }
        listshape[count++] = newRectangle ;
        System.out.println("Them hinh chu nhat thanh cong");
    }

    public void show() {
        for(int i=0 ; i < count ; i++) {
            System.out.println(listshape[i]);
        }
    }
}
