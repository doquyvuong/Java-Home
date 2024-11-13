package Day16.utils.menu;

public class AdminMenuUitls {

    public static final int LIMIT_MENU_ADMIN = 4;

    public static void adminMenu() {
        System.out.println("1. Quản lý sản phẩm");
        System.out.println("2. Quản lý tài khoản");
        System.out.println("3. Quản lý đơn hàng");
        System.out.println("4. Thoát");
    }

    public static final int LIMIT_MENU_ADMIN_ORDER = 4;

    public static void orderAdminMenu() {

        System.out.println("1. Xem tất cả order của người dùng");
        System.out.println("2. Xem chi tiết order");
        System.out.println("3. Chuyển trạng thái order từ Ordered -> Shipped");
        System.out.println("4. Trở về");
    }


    public static final int LIMIT_MENU_ADMIN_PRODUCT = 5;

    public static void productAdminMenu() {
        System.out.println("1. Hiển thị danh sách sản phẩm");
        System.out.println("2. Thêm sản phẩm");
        System.out.println("3. Xóa sản phẩm");
        System.out.println("4. Cập nhật sản phẩm");
        System.out.println("5. Trở về");
    }

    public static final int LIMIT_MENU_ADMIN_ACCOUNT = 5;

    public static void accountAdminMenu() {
        System.out.println("1. Hiển thị danh sách tài khoản");
        System.out.println("2. Tìm kiếm tài khoản theo username");
        System.out.println("3. Xóa tài khoản");
        System.out.println("4. Cập nhật mật khẩu"); // => Sau này cần kết hợp với cả bảng Customer lôi thông tin cá nhân
        System.out.println("5. Trở về");
    }

}
