package Day9.BT3trang87.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtils {

    public static String inputString(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }

    public static float inputPriceDigit(float min, String message) {
        float n = -1;
        boolean flag;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println(message);
                n = sc.nextInt();

                if (!(n >= min)) {
                    throw new InputMismatchException();
                }

                flag = true;
            } catch (InputMismatchException ex) {
                System.err.println("Nhập sai, nhập lại (Giá phải lớn hơn" + min +")");
                flag = false;
            }
        } while (!flag);
        return n;
    }

    // Validate, Custom, Validate Text, Date
    // Email, Password
    public static int inputDigit(int min, int max, String message) {
        int n = -1;
        boolean flag;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println(message);
                n = sc.nextInt();

                if (!((n >= min) && (n <= max))) {
                    throw new InputMismatchException();
                }
                flag = true;
            } catch (InputMismatchException ex) {
                System.err.println("Nhập sai, nhập lại (" + min + " -> " + max + ")");
                flag = false;
            }
        } while (!flag);
        return n;
    }
}
