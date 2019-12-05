/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 06/12/19
 *   Time: 12:31 AM
 */

package main;

import connection.DatabaseConnection;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DatabaseConnection connection = new DatabaseConnection();
        connection.startConnection();
    }
}
