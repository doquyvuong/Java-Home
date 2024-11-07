package Day6.BT1;

import java.util.Scanner;

public class Bank {
    private final Account[] accList;
    private int nextAccount = 0;

    public Bank() {
        int accMax = 10;
        accList = new Account[accMax];
    }

    public void createAccount() {
        Scanner sr = new Scanner(System.in);
        try {
            System.out.println("Nhập tên khách hàng: ");
            String name = sr.nextLine();
            System.out.println("Nhập số tài khoản: ");
            String accNum = sr.nextLine();
            System.out.println("Nhập số dư ban đầu (ít nhất 100): ");
            int balance = sr.nextInt();

            Account newAccount = new Account(name, accNum, balance);
            accList[nextAccount++] = newAccount;
            System.out.println("Tài khoản được tạo thành công!");
            newAccount.displayAccountDetails();
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Đầu vào không hợp lệ. Vui lòng thử lại.");
        }
    }

    public void deposit() {
        Scanner sr = new Scanner(System.in);
        try {
            System.out.println("Nhập số tài khoản: ");
            String accNum = sr.nextLine();
            System.out.println("Nhập số tiền cần gửi: ");
            int depositAmount = sr.nextInt();

            if (depositAmount < 0) {
                throw new InsufficientFundsException("Số tiền gửi phải dương.");
            }

            boolean found = false;
            for (int i = 0; i < nextAccount; i++) {
                if (accList[i].accountNumber.equals(accNum)) {
                    accList[i].accountBalance += depositAmount;
                    System.out.println("Gửi tiền thành công!");
                    accList[i].displayAccountDetails();
                    found = true;
                    break;
                }
            }

            if (!found) {
                throw new InsufficientFundsException("Không tìm thấy tài khoản.");
            }
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Đầu vào không hợp lệ. Vui lòng thử lại.");
        }
    }

    public void withdraw() {
        Scanner sr = new Scanner(System.in);
        try {
            System.out.println("Nhập số tài khoản: ");
            String accNum = sr.nextLine();
            System.out.println("Nhập số tiền cần rút: ");
            int withdrawAmount = sr.nextInt();

            boolean found = false;
            for (int i = 0; i < nextAccount; i++) {
                if (accList[i].accountNumber.equals(accNum)) {
                    if (withdrawAmount > accList[i].accountBalance || withdrawAmount < 0) {
                        throw new InsufficientFundsException("Không đủ tiền hoặc số tiền không hợp lệ.");
                    }
                    accList[i].accountBalance -= withdrawAmount;
                    System.out.println("Rút tiền thành công!");
                    accList[i].displayAccountDetails();
                    found = true;
                    break;
                }
            }

            if (!found) {
                throw new InsufficientFundsException("Không tìm thấy tài khoản.");
            }
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Đầu vào không hợp lệ. Vui lòng thử lại.");
        }
    }
}
