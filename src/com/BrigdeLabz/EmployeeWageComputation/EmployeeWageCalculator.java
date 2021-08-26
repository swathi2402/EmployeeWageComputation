package com.BrigdeLabz.EmployeeWageComputation;

public class EmployeeWageCalculator {
	public static final int EMPLOYEE_RATE_PER_HOUR = 20;
	
	public static void main(String[] args) {
		System.out.println("***** Welcome to Employee Wage Computation *****");
		int isPresent = 1;
		int employeeHours = 0;
		int employeeWage = 0;
		int employeeCheck = (int) Math.floor(Math.random() * 10) % 2;
		if (employeeCheck == isPresent) {
			employeeHours = 8;
		}
		else {
			employeeHours = 0;
		}
		employeeWage = employeeHours * EMPLOYEE_RATE_PER_HOUR;
		System.out.println("Employee wage: " + employeeWage);

	}
}
