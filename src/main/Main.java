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

        // create the connection to the database
        DatabaseConnection connection = new DatabaseConnection();
        connection.startConnection();
        connection.printConnectionStatus();

        // create an object to the Entry Helper Class
        StudentEntryHelper entryHelper = new StudentEntryHelper();

        // Input values for the Student object
        /*int studentRollNumber = entryHelper.getRollNumberFromUser();
        String studentName = entryHelper.getNameFromUser();
        int studentYear = entryHelper.getYearFromUser();
        double studentCurrentCPI = entryHelper.getCPIFromUser();

        // Create the Student object
        Student student = new Student(studentRollNumber, studentName, studentYear, studentCurrentCPI);

        // Send the student object to the database
        entryHelper.createNewStudentInDatabase(DatabaseConnection.getConnection(), student);
        entryHelper.checkIfStudentCreated();*/

        entryHelper.printResultSet(entryHelper.getAllRecordsFromDatabase(DatabaseConnection.getConnection()));

    }
}
