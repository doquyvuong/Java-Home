package Day16.service;

import Day16.db.MyConnection;
import Day16.model.Account;
import Day16.model.Customer;
import Day16.model.Order;
import Day16.model.OrderDetail;
import Day16.model.cart.OrderedProduct;
import Day16.utils.InputUtils;

import java.sql.*;
import java.util.List;
import java.util.Map;

import static Day16.utils.menu.AdminMenuUitls.LIMIT_MENU_ADMIN_ORDER;
import static Day16.utils.menu.AdminMenuUitls.orderAdminMenu;
import static Day16.utils.menu.UserMenuUitls.LIMIT_MENU_USER_ORDER;
import static Day16.utils.menu.UserMenuUitls.orderUserMenu;

public class OrderService {

    private final MyConnection myConnection;
    private final OrderDetailService orderDetailService;

    public OrderService() {
        myConnection = new MyConnection();
        orderDetailService = new OrderDetailService();
    }

    public void orderFunction(Account account, Customer customer) {
        String role = account.getRole();
        if (role.equalsIgnoreCase("admin")) {
            adminFunction(customer);
        } else {
            userFunction(customer);
        }
    }

    private void adminFunction(Customer customer) {
        int chon;
        do {
            orderAdminMenu();
            chon = InputUtils.inputDigit(1, LIMIT_MENU_ADMIN_ORDER, "Xin bạn chọn: ");
            switch (chon) {
                case 1:
                    showAllOrders(customer);
                    break;
                case 2:
                    int orderNumber = InputUtils.inputDigit(1, 100000, "Nhập order number: ");
                    Order foundOrder = findByOrderNumber(orderNumber);
                    if(foundOrder == null){
                        System.out.println("Order number không tồn tại");
                        break;
                    }
                    List<OrderDetail> orderDetails = orderDetailService.findByOrderNumber(orderNumber);
                    displayDetailOrder(foundOrder, orderDetails);
                    break;
                case 3:
                    int orderNumberToChange = InputUtils.inputDigit(1, 100000, "Nhập order number: ");
                    Order foundOrderToChange = findByOrderNumber(orderNumberToChange);
                    if(foundOrderToChange == null){
                        System.out.println("Order number không tồn tại");
                        break;
                    }
                   changeOrderStatus(orderNumberToChange);
                    break;
                default:
                    System.out.println("-- Quay lại");
                    break;
            }
        } while (chon != LIMIT_MENU_ADMIN_ORDER);
    }

    private void userFunction(Customer customer) {
        int chon;
        do {
            orderUserMenu();
            chon = InputUtils.inputDigit(1, LIMIT_MENU_USER_ORDER, "Xin bạn chọn: ");
            switch (chon) {
                case 1:
                    // Hiển thị order đã đặt
                    showOrders(customer);
                    break;
                case 2:
                    // Hiển thị chi tiết order
                    // Nhập id order đơn hàng
                    int orderNumber = InputUtils.inputDigit(1, 100000, "Nhập order number: ");
                    Order foundOrder = findByOrderNumber(orderNumber);
                    if(foundOrder == null){
                        System.out.println("Order number không tồn tại");
                        break;
                    }
                    // tồn tại rồi, thì đi show các thông tin trong orders
                    // Khi đặt hàng -> Insert 1 record vào orders -> insert n records vào orderdetail
                    // muốn xem thông tin order thì -> lấy thông tin orderNumber để
                    // lấy về tất cả orderdetail -> lớn hơn 1 object
                    List<OrderDetail> orderDetails = orderDetailService.findByOrderNumber(orderNumber);
                    // bao gồm productCode, price, quantity
                    displayDetailOrder(foundOrder, orderDetails);
                    break;
                default:
                    System.out.println("-- Quay lại");
                    break;
            }
        } while (chon != LIMIT_MENU_USER_ORDER);
    }

    private void displayDetailOrder(Order foundOrder, List<OrderDetail> orderDetails){
        int orderNumber = foundOrder.getOrderNumber();
        String orderStatus = foundOrder.getStatus();

        System.out.println("Order Number: " + orderNumber + " - Status: " + orderStatus);
        // details
        for(OrderDetail orderDetail: orderDetails){
            orderDetail.display();
        }
    }

    private Order changeOrderStatus(int orderNumberToChange) {
        String query = "UPDATE orders SET status = ? WHERE orderNumber = ? ";
        try (Connection connection = myConnection.connect();
             PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, "shipped");
            ps.setInt(2, orderNumberToChange);

            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                return new Order(orderNumberToChange, "shipped");
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return null;
    }



    private Order findByOrderNumber(int orderNumber){
        String query = "SELECT * FROM orders WHERE orderNumber = ?";
        try (Connection connection = myConnection.connect();
             PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, orderNumber);
            try (ResultSet rs = ps.executeQuery()) {
                if(rs.next()){
                    int orderNumberDB = rs.getInt("orderNumber");
                    Date orderDate = rs.getDate("orderDate");
                    Date requiredDate = rs.getDate("requiredDate");
                    Date shippedDate = rs.getDate("shippedDate");
                    String status = rs.getString("status");
                    String comments = rs.getString("comments");
                    return new Order(orderNumberDB, orderDate, requiredDate, shippedDate, status, comments);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return null;
    }

    private void showAllOrders(Customer customer) {
        String query = "SELECT * FROM orders";
        ResultSet resultSet = null;
        try (Connection connection = myConnection.connect();
             Statement statement = connection.createStatement()) {
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                    int orderNumber = resultSet.getInt("orderNumber");
                    String orderStatus = resultSet.getString("status");
                    System.out.println("Order Number: " + orderNumber + " - Status: " + orderStatus);
                }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    private void showOrders(Customer customer) {
        String query = "SELECT * FROM orders WHERE customerNumber = ?";
        try (Connection connection = myConnection.connect();
             PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, customer.getCustomerNumber());
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int orderNumber = rs.getInt("orderNumber");
                    String orderStatus = rs.getString("status");
                    System.out.println("Order Number: " + orderNumber + " - Status: " + orderStatus);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public void insertOrder(Customer customer) {
        //customer chứa customerNumber  = account.id
        // customer chứa cart = snapshot cart hiện tại
//        ProductService productService = new ProductService(); // private hết rồi,
        String query = "INSERT INTO orders ( orderDate, " +
                "requiredDate, shippedDate, status, comments, customerNumber) " +
                "VALUES ( ?, ?, ?, ?, ?, ?)";
        try (Connection connection = myConnection.connect();
             PreparedStatement ps = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            ps.setDate(1, new Date(System.currentTimeMillis()));
            ps.setDate(2, new Date(System.currentTimeMillis()));
            ps.setDate(3, new Date(System.currentTimeMillis()));
            ps.setString(4, "Ordered");
            ps.setString(5, "No Comment");
            ps.setInt(6, customer.getCustomerNumber());
            ps.executeUpdate();

            // Lấy ra key từ bảng order sau khi insert vào
            // và đồng insert thêm vào order details
            try (ResultSet rs = ps.getGeneratedKeys()) { // trả về key generated
                if (rs.next()) { // Lấy key vừa tạo ra
//                    customer.getCart()
                    // Map -> chứa list key-value: productCode và quantity
                    for (Map.Entry<String, OrderedProduct> entry : customer.getCart().getCart().entrySet()) {
                        int newOrderKey = rs.getInt(1); // Key vừa tạo ra
                        String productCode = entry.getKey();
//                        Integer quantity = entry.getValue();
                        OrderedProduct orderedProduct = entry.getValue();
                        // priceEach., nó trong bằng product
                        orderDetailService.insertOrderDetails(newOrderKey,
                                productCode,
                                orderedProduct.getQuantity(),
                                orderedProduct.getPriceEach());
                        System.out.println("Inserted order details");
                    }
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

}
