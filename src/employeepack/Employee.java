/*
Author : Akshay Joshi
GitHub : https://github.com/ijoshi90
Created on 01-01-2020 at 17:15
*/

package employeepack;

public class Employee {

    //Date of Joining Object
    static DateOfJoining dateOfJoining(int day, int month, int year) {
        DateOfJoining doj = new DateOfJoining(day, month, year);
        return doj;
    }

    int empId;
    String empName;
    public double basicSal;

    public Employee(int empId, String empName, double basicSal) {
        this.empId = empId;
        this.empName = empName;
        this.basicSal = basicSal;
    }

    protected void showDetails() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Basic Salary : " + basicSal);
    }

    protected void calcSal() {
    }

}