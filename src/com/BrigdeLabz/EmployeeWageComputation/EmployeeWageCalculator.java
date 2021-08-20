package com.BrigdeLabz.EmployeeWageComputation;

public class EmployeeWageCalculator {
	public static void main(String[] args) {
		System.out.println("***** Welcome to Employee Wage Computation *****");
		int isFullTime = 1;
		int employeeRatePerHour = 20;
		int employeeHours = 0;
		int employeeWage = 0;
		double employeeCheck = Math.floor(Math.random() * 10) % 2;
		
		if(employeeCheck == isFullTime) {
			employeeHours = 8;
		} else {
			employeeHours = 0;
		}
		
		employeeWage = employeeHours * employeeRatePerHour;
		System.out.println("Employee wage: " + employeeWage);
	}
}
