package com.project;

//using java.util.Random; 
import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
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

	}

}
