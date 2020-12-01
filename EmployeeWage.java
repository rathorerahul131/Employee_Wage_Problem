package com.project;

//using java.util.Random; 
import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		int Full_DAY_HOUR = 8;
		int RATE_PER_HOUR= 20;
		int empHours = 0 ;
		// print welcome message
		System.out.println("Welcome to The Employee Wage System");
		// create instance of Random class
		Random rand = new Random();
		// Generate random integers in range 0 to 1
		int empCheck = rand.nextInt(2);
		if (empCheck == 0) {
			System.out.println("Employee is Absent");
			empHours = 0;
			
		} else {
			System.out.println("Employee is Present");
			empHours = 8;
		}
		
		int salary = empHours*RATE_PER_HOUR;
    	System.out.println("So Salary of the Employee is : " + salary);

	}

}
