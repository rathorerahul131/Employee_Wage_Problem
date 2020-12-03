package com.project;

//using java.util.Random; 
import java.util.Random;

public class EmployeeWage {
	public static int IS_FULL_TIME = 1;
	public static int IS_PART_TIME = 0;
	// public static int RATE_PER_HOUR = 20;
	// public static int WORK_DAYS = 20;
	// public static int MAX_HOURS = 100;

	public static int Wage(int MAX_HOURS, int WORK_DAYS, int RATE_PER_HOUR) {

		int empHours = 0;
		int totalHrs = 0;
		int totalWorkingDays = 0;

		while (totalHrs <= MAX_HOURS && totalWorkingDays <= WORK_DAYS) {
			totalWorkingDays++;
			Random rand = new Random();
			// Generate random integers in range 0 to 1
			int empCheck = rand.nextInt(2);

			switch (empCheck) {

			case 0:
				empHours = 8;
				break;
			case 1:
				empHours = 4;
				break;
			default:
				empHours = 0;

			}

			totalHrs += empHours;
			System.out.println("Day#: " + totalWorkingDays + " Employee Hours: " + empHours);

		}
		System.out.println("Total Working Days " + totalWorkingDays);
		System.out.println("Total Working hours " + totalHrs);
		int EmpWage = totalHrs * RATE_PER_HOUR;
		return EmpWage;

	}

	public static void main(String[] args) {
		System.out.println("Total Wage for TCS company is  " + Wage(100, 25, 22));
		System.out.println("Total Wage for Wipro company is  " + Wage(110, 28, 20));
		System.out.println("Total Wage for Infosys company is  " + Wage(120, 29, 27));
		System.out.println("Total Wage for Cybage company is  " + Wage(115, 26, 25));

	}

}
