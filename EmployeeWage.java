package com.project;

//using java.util.Random; 
import java.util.Random;

public class EmployeeWage {

	public void monthlyWage(int totalWorkHours, int rate) {

		int salary = totalWorkHours * rate;
		System.out.println("The total monthly Wage is " + salary);

	}

	public static void main(String[] args) {

		int RATE_PER_HOUR = 20;

		int MAX_WORKDAYS_PER_MONTH = 20;
		int MAX_WORKHOURS_IN_MONTH = 100;

		int totalWorkDays = 0;
		int totalWorkHours = 0;
		int empHours = 0;

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
		// Loop till total hours reach 100 or workDays reach 20
		while (totalWorkHours <= MAX_WORKHOURS_IN_MONTH && totalWorkDays <= MAX_WORKDAYS_PER_MONTH) {
			switch (empCheck) {
			case 1:
				empHours = 8;
				break;
			case 0:
				empHours = 4;
				break;
			default:
				break;
			}
			totalWorkDays++;
			totalWorkHours += empHours;

		}

		EmployeeWage salary = new EmployeeWage();
		salary.monthlyWage(totalWorkHours, RATE_PER_HOUR);

	}

}
