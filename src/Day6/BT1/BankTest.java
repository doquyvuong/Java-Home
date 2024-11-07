package Day6.BT1;

import java.util.Scanner;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sr = new Scanner(System.in);

        while (true) {
            System.out.println("Menu ngân hàng:");
            System.out.println("1. Tạo tài khoản mới");
            System.out.println("2. Gửi tiền");
            System.out.println("3. Rút tiền");
            System.out.println("4. Thoát");

            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = sr.nextInt();

            switch (choice) {
                case 1:
                    bank.createAccount();
                    break;
                case 2:
                    bank.deposit();
                    break;
                case 3:
                    bank.withdraw();
                    break;
                case 4:
                    System.out.println("Thoát khỏi chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
            }
        }
    }
}

