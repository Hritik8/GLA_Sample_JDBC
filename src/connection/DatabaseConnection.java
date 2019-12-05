/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 05/12/19
 *   Time: 10:09 PM
 */

package connection;

import java.sql.Connection;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/GLA";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static Connection connection = null;

    public static Connection getConnection() {
        return connection;
    }
}
