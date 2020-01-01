/*
Author : Akshay Joshi
GitHub : https://github.com/ijoshi90
Created on 01-01-2020 at 17:16
*/

package employeepack;

public class Faculty extends Employee {

    String Designation;
    String Grade;

    public Faculty(int empId, String empName, double basicSal) {
        super(empId, empName, basicSal);
    }

    public Faculty(int empId, String empName, double basicSal, String designation, String grade) {
        super(empId, empName, basicSal);
        Designation = designation;
        Grade = grade;
    }

    static DateOfJoining dateOfJoining(int day, int month, int year) {
        DateOfJoining doj = new DateOfJoining(day, month, year);
        return doj;
    }

    public void showDetails() {
        System.out.println("---- FACULTY CLASS ----");
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Basic Salary : " + basicSal);
        System.out.println("Designation : " + Designation);
        System.out.println("Grade : " + Grade);
    }

    void calcSal(double basic) {
        System.out.println("totalSal : " + basic);
    }

}