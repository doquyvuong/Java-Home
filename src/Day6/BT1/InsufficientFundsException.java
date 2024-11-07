package Day6.BT1;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("Trong tài khoản không đủ tiền.");
    }

    public InsufficientFundsException(String message) {
        super(message);
    }
}