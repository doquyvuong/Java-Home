package Day16;


import Day16.model.Account;
import Day16.model.Customer;
import Day16.service.AccountService;
import Day16.service.CustomerService;
import Day16.service.OrderService;
import Day16.service.ProductService;
import Day16.utils.InputUtils;

import static Day16.utils.menu.AdminMenuUitls.LIMIT_MENU_ADMIN;
import static Day16.utils.menu.AdminMenuUitls.adminMenu;
import static Day16.utils.menu.UserMenuUitls.LIMIT_MENU_USER;
import static Day16.utils.menu.UserMenuUitls.userMenu;

public class Main {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        ProductService productService = new ProductService();
        OrderService orderService = new OrderService();
        //  Function nào chỉ dùng ở trong class, thì nên private, nếu mà dùng hơn 2 lần thì mới nên public
        // Giới hạn quyền sử dụng function đó


        Account isLoggedAccount = accountService.loginAndSignupFunction();
        System.out.println("isLogged: " + isLoggedAccount);
        // Đến đoạn này là người dùng đã đăng nhập vào hệ thống
        // Từ đây, mình phân quyền người dùng
        // Admin -> Quản lý product, account, order
        // User -> Xem product, tạo order, thêm sản phẩm vào giỏ hàng, cập nhật thông tin account

        String role = isLoggedAccount.getRole();
        if (role.equals("admin")) {
            // cũng nên lôi thông tin customer ra
            // nhma nó à admin, nên không nhất thiết
            admin(accountService, isLoggedAccount, productService,orderService);
        } else if (role.equals("user")) {
            // Là user -> lôi ra thông tin customer
            user(accountService, isLoggedAccount, productService, orderService);
        } else {
            System.out.println("Không xác định được role");
        }
    }


    private static void user(AccountService accountService,
                             Account loggedAccount,
                             ProductService productService,
                             OrderService orderService) {
        CustomerService customerService = new CustomerService();
        Customer customer = customerService.findByCustomerNumber(loggedAccount.getId());
        int chon;
        do {
            userMenu();
            chon = InputUtils.inputDigit(1, LIMIT_MENU_USER, "Xin bạn chọn: ");
            switch (chon) {
                case 1:
                    // Customer service nằm ở đây
                    accountService.accountFunction(loggedAccount);
                    break;
                case 2:
                    productService.productFunction(loggedAccount, customer);
                    break;
                case 3:
                    // Giả sử
                     orderService.orderFunction(loggedAccount, customer);
                    // Cập nhật thông tin customer
                default:
                    System.out.println("---------Thoát chương trình--------");
                    break;
            }
        } while (chon != LIMIT_MENU_USER);
    }

    private static void admin(AccountService accountService,
                              Account loggedAccount,
                              ProductService productService,
                              OrderService orderService) {
        CustomerService customerService = new CustomerService();
        Customer customer = customerService.findByCustomerNumber(loggedAccount.getId());
        int chon;
        do {
            adminMenu();
            chon = InputUtils.inputDigit(1, LIMIT_MENU_ADMIN, "Xin bạn chọn: ");
            switch (chon) {
                case 1:
                    productService.productFunction(loggedAccount, null);
                    break;
                case 2:
                    accountService.accountFunction(loggedAccount);
                    break;
                case 3:
                    //Quản lý đơn hàng
                    orderService.orderFunction(loggedAccount, null);
                default:
                    System.out.println("---------Thoát chương trình--------");
                    break;
            }
        } while (chon != LIMIT_MENU_ADMIN);
    }


}
