/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 06/12/19
 *   Time: 12:09 AM
 */

package databaseHelper;

import connection.DatabaseConnection;
import data.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentEntryHelper {
    /*
     * We are going to include the CRUD operations as methods in this class.
     * */

    private static final Scanner scanner = new Scanner(System.in);
    private static boolean didCurrentOperationSucceed = false;

    /**
     * This method will help us to store the values of a student to the database
     */
    public void createNewStudentInDatabase(Connection connection, Student student) throws SQLException {
        String insertQuery = "INSERT INTO Student (rollNumber, name, year, cpi) VALUES (?, ?, ?, ?);";
        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
        preparedStatement.setInt(1, student.getRollNumber());
        preparedStatement.setString(2, student.getName());
        preparedStatement.setInt(3, student.getYear());
        preparedStatement.setDouble(4, student.getCpi());
        didCurrentOperationSucceed = preparedStatement.executeUpdate() >= 1;
    }

    /**
     * Call this method after calling the createNewStudentInDatabase method only
     */
    public void checkIfStudentCreated() {
        System.out.println(didCurrentOperationSucceed ? "Student Creation Succeeded" : "Student Creation Failed");
    }

    public int getRollNumberFromUser() {
        System.out.println("Enter the roll number of student: ");
        return Integer.parseInt(scanner.nextLine().trim());
    }

    public String getNameFromUser() {
        System.out.println("Enter the name of the student: ");
        return scanner.nextLine().trim();
    }

    public int getYearFromUser() {
        System.out.println("Enter the current year of the student: ");
        return Integer.parseInt(scanner.nextLine().trim());
    }

    public double getCPIFromUser() {
        System.out.println("Enter the current CPI of the student: ");
        return scanner.nextDouble();
    }

    private ResultSet getAllRecordsFromDatabase(Connection connection) throws SQLException {
        String selectAllQuery = "SELECT * FROM Student;";
        PreparedStatement preparedStatement = connection.prepareStatement(selectAllQuery);
        return preparedStatement.executeQuery();
    }

    private void printCurrentTableData(ResultSet resultSet) throws SQLException {
        System.out.println("\n----\n");
        while (resultSet.next()) {
            // retrieve all the fields of a student into variables
            int rollNumber = resultSet.getInt("rollNumber");
            String name = resultSet.getString("name");
            int year = resultSet.getInt("year");
            double cpi = resultSet.getDouble("cpi");
            Student student = new Student(rollNumber, name, year, cpi);
            System.out.println(student);
        }
        System.out.println("\n----\n");
    }

    public void readAllRecordsInStudentTable() throws SQLException {
        System.out.println("Student Table Records");
        this.printCurrentTableData(this.getAllRecordsFromDatabase(DatabaseConnection.getConnection()));
    }

}
