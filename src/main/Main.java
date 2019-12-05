/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 06/12/19
 *   Time: 12:31 AM
 */

package main;

import connection.DatabaseConnection;
import databaseHelper.StudentEntryHelper;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DatabaseConnection connection = new DatabaseConnection();
        connection.startConnection();
        connection.printConnectionStatus();
        StudentEntryHelper entryHelper = new StudentEntryHelper();
        int studentRollNumber = entryHelper.getRollNumberFromUser();
        String studentName = entryHelper.getNameFromUser();
        int studentYear = entryHelper.getYearFromUser();
        double studentCurrentCPI = entryHelper.getCPIFromUser();
    }
}
