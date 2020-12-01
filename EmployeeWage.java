package com.project;

//using java.util.Random; 
import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		int Full_TIME_HOUR = 8;
		int PART_TIME_HOUR = 4;
		int RATE_PER_HOUR = 20;

		int WORK_DAYS_PER_MONTH = 20;

		int empHours = 0;

		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 0;
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

		int timeCheck = rand.nextInt(2);

		switch (timeCheck) {
		case 1:
			System.out.println("Employee works for Full Time, so ");
			empHours = 8;
			break;
		case 0:
			System.out.println("Employee works for Part Time so ");
			empHours = 4;
			break;
		default:
			System.out.println("Employee Unidentified");
		}

		int dailyWage = empHours * RATE_PER_HOUR;
		System.out.println("His Daily Wage is : " + dailyWage);
		int monthlyWage = dailyWage * WORK_DAYS_PER_MONTH;
		System.out.println("His Monthly Wage is : " + monthlyWage);

	}

}
