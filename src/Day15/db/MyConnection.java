package Day15.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyConnection {

    private String url;
    private String ip;
    private String port;
    private String database;
    private String username;
    private String password;

    public MyConnection() {
        // Kết tới local database
        this.ip = "127.0.0.1"; // -- 127.0.0.1
        this.port = "3306";
        this.database = "classicmodels";
        this.username = "root";
        this.password = "aye@@123CLGT";
        this.url = "jdbc:mysql://" + this.ip + ":" + this.port + "/" + this.database;
        //jdbc:mysql://localhost:3306/classicmodels
        // Mỗi khi mà dùng new MyConnection -> thuộc tính là mặc định
    }

    public MyConnection(String ip, String port, String database, String username, String password) {
        this.ip = ip; // Code theo trình tự từ trên xuống dưới
        this.port = port;
        this.database = database;
        this.username = username;
        this.password = password;
        this.url = "jdbc:mysql://" + this.ip + ":" + this.port + "/" + this.database;
    }

//    public Connection connect() throws SQLException {
//        Connection connection =
//                DriverManager.getConnection(this.url, this.username, this.password);
//    // Giả dụ mà có error liên quan kết nối thì throw ra error ở class ngoài
//    }

    public Connection connect() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(this.url, this.username, this.password);
            // Exception, cái dòng mà sinh ra exception -> nhảy trực tiếp sang catch
            // Nếu mà không có error
//            System.out.println("Connected to database");
        } catch (SQLException ex) {
            System.err.println("Error while connecting to database");
        }
        return connection;
    }

    public void closeResultSet(ResultSet resultSet, String functionName) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (SQLException ex) {
            System.out.println(functionName + ": " + ex.getMessage());
        }
    }
}
