/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 05/12/19
 *   Time: 10:09 PM
 */

package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/GLA";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static Connection connection = null;

    public static Connection getConnection() {
        return connection;
    }

    public boolean startConnection() throws SQLException {
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        return connection != null;
    }

    public void printConnectionStatus() {
        System.out.println(getConnection() != null ? "Connection is active" : "Connection is active");
    }
}
