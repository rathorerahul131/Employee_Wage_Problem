package com.project;

//using java.util.Random; 
import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		int Full_TIME_HOUR = 8;
		int PART_TIME_HOUR = 4;
		int RATE_PER_HOUR = 20;
		// print welcome message
		System.out.println("Welcome to The Employee Wage System");
		// create instance of Random class
		Random rand = new Random();
		// Generate random integers in range 0 to 1
		int empCheck = rand.nextInt(2);
		if (empCheck == 0) {
			System.out.println("Employee is Absent");

		} else {
			System.out.println("Employee is Present");
		}

		int salary = RATE_PER_HOUR * Full_TIME_HOUR;
		System.out.println("Salary for the Full Time Employee is " + salary);

		int partTimeSalary = RATE_PER_HOUR * PART_TIME_HOUR;
		System.out.println("Salary for the part Time Employee is " + partTimeSalary);

	}

}
