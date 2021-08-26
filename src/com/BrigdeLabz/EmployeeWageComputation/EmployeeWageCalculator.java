package com.BrigdeLabz.EmployeeWageComputation;

public class EmployeeWageCalculator {
	public static void main(String[] args) {
		System.out.println("***** Welcome to Employee Wage Computation *****");
		int isPresent = 1;
		double employeeCheck = Math.floor(Math.random() * 10) % 2;
		if (employeeCheck == isPresent) {
			System.out.println("Employee is Present");
		}
		else {
			System.out.println("Employee is Absent");
		}
	}
}
