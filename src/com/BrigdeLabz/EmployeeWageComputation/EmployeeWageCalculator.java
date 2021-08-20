package com.BrigdeLabz.EmployeeWageComputation;

public class EmployeeWageCalculator {
	public static void main(String[] args) {
		System.out.println("***** Welcome to Employee Wage Computation *****");
		int isPartTime = 1;
		int isFullTime = 2;
		int employeeRatePerHour = 20;
		int employeeHours = 0;
		int employeeWage = 0;
		double employeeCheck = Math.floor(Math.random() * 10) % 3;

		if (employeeCheck == isFullTime) {
			employeeHours = 8;
			
		} else if (employeeCheck == isPartTime) {
			employeeHours = 4;
			
		} else {
			employeeHours = 0;
		}

		employeeWage = employeeHours * employeeRatePerHour;
		System.out.println("Employee wage: " + employeeWage);
	}
}
