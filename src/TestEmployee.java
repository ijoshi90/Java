/*
Author : Akshay Joshi
GitHub : https://github.com/ijoshi90
Created on 01-01-2020 at 17:17
*/

import java.util.Scanner;

import employeepack.*;


public class TestEmployee {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number of Managers : ");
        int numOfManager = scan.nextInt();

        System.out.print("Enter the Number of Faculty : ");
        int numOfFaculty = scan.nextInt();

        //Creation of objects
        Manager[] man = new Manager[numOfManager];
        Faculty[] fac = new Faculty[numOfFaculty];

        DateOfJoining[] dateOfJoining = new DateOfJoining[(numOfManager + numOfFaculty)];

        //Taking Values for Manager object
        for (int i = 0; i < numOfManager; i++) {
            System.out.print("\n\nEnter the " + (i + 1) + " Manager Details");
            System.out.print("\nEnter the EmpI : ");
            int empId = scan.nextInt();
            System.out.print("\nEnter the Name : ");
            String name = scan.next();
            System.out.print("\nEnter the Basic Sal : ");
            double basicSal = scan.nextDouble();
            System.out.print("\nEnter the Designation : ");
            String desig = scan.next();
            System.out.print("\nEnter the Grade : ");
            String grade = scan.next();
            //Taking in Date OF Joining
            System.out.println("\n--- Enter the DOJ ---");
            System.out.print("\nEnter the Date :");
            int date = scan.nextInt();
            System.out.print("\nEnter the Month :");
            int month = scan.nextInt();
            System.out.print("\nEnter the Year :");
            int year = scan.nextInt();

            dateOfJoining[i] = new DateOfJoining(date, month, year);

            man[i] = new Manager(empId, name, basicSal, desig, grade);
            System.out.println("\nManager " + (i + 1) + " Created");
        }

        for (int i = 0; i < numOfFaculty; i++) {
            System.out.print("\nEnter the " + (i + 1) + " Faculty Details");
            System.out.print("\nEnter the EmpI : ");
            int empId = scan.nextInt();
            System.out.print("\nEnter the Name : ");
            String name = scan.next();
            System.out.print("\nEnter the Basic Sal : ");
            double basicSal = scan.nextDouble();
            System.out.print("\nEnter the Designation : ");
            String desig = scan.next();
            System.out.print("\nEnter the Grade : ");
            String grade = scan.next();

//			Taking in Date OF Joining
            System.out.println("\n--- Enter the DOJ ---");
            System.out.print("\nEnter the Date :");
            int date = scan.nextInt();
            System.out.print("\nEnter the Month :");
            int month = scan.nextInt();
            System.out.print("\nEnter the Year :");
            int year = scan.nextInt();

            dateOfJoining[i] = new DateOfJoining(date, month, year);


            fac[i] = new Faculty(empId, name, basicSal, desig, grade);
            System.out.println("Faculty " + (i + 1) + " Created");
        }

        for (int i = 0; i < numOfManager; i++) {
            System.out.print("\nManager" + (i + 1) + "Details\n");
            man[i].showDetails();
            man[i].calcSal(man[i].basicSal);
            dateOfJoining[i].showDate();
        }

        for (int i = 0; i < numOfFaculty; i++) {
            System.out.print("\nFaculty" + (i + 1) + "Details\n");
            fac[i].showDetails();
            dateOfJoining[i].showDate();
        }

    }

}