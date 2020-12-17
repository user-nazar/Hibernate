package ua.lviv.iot.persistance;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {
    private static final String URL = "jdbc:mysql://localhost:3306/laboratorna4?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    private static Connection connection = null;

    private ConnectionManager() {
    }

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            if (connection == null || connection.isClosed()) {
                try {
                    connection = DriverManager.getConnection(URL, USER, PASSWORD);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

}
