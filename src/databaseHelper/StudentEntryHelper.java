/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 06/12/19
 *   Time: 12:09 AM
 */

package databaseHelper;

import data.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentEntryHelper {
    /*
     * We are going to include the CRUD operations as methods in this class.
     * */


    /**
     * This method will help us to store the values of a student to the database
     */
    public boolean createNewStudentInDatabase(Connection connection, Student student) throws SQLException {
        String insertQuery = "INSERT INTO Student (rollNumber, name, year, cpi) VALUES (?, ?, ?, ?);";
        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
        preparedStatement.setInt(1, student.getRollNumber());
        preparedStatement.setString(2, student.getName());
        preparedStatement.setInt(3, student.getYear());
        preparedStatement.setDouble(4, student.getCpi());
        return preparedStatement.executeUpdate() >= 1;
    }

    private void showEntryPromptForField(String fieldName) {
        System.out.println("Please enter " + fieldName + ": ");
    }


}
