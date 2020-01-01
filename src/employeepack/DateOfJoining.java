/*
Author : Akshay Joshi
GitHub : https://github.com/ijoshi90
Created on 01-01-2020 at 17:17
*/

package employeepack;

public class DateOfJoining {
    int day;
    int month;
    int year;

    public DateOfJoining(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void showDate() {
        System.out.println("Joining date is : " + day + "-" + month + "-" + year);
    }

}