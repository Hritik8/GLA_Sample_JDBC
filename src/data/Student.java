/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 06/12/19
 *   Time: 12:04 AM
 */

package data;

public class Student {
    private int rollNumber;
    private String name;
    private int year;
    private double cpi;

    public Student(int rollNumber, String name, int year, double cpi) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.year = year;
        this.cpi = cpi;
    }

    @Override
    public String toString() {
        return String.format("|%-15d|%-20s|%-15d|%-15.2f|", this.getRollNumber(), this.getName(), this.getYear(), this.getCpi());
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getCpi() {
        return cpi;
    }

    public void setCpi(double cpi) {
        this.cpi = cpi;
    }
}
