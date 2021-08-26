package com.BrigdeLabz.EmployeeWageComputation;

public class EmployeeWageCalculator {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMPLOYEE_RATE_PER_HOUR = 20;
	
	public static void main(String[] args) {
		System.out.println("***** Welcome to Employee Wage Computation *****");
		int employeeHours = 0;
		int employeeWage = 0;
		int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
		if (employeeCheck == IS_FULL_TIME) {
			employeeHours = 8;
		}
		else if(employeeCheck == IS_PART_TIME) {
			employeeHours = 4;
		}
		else {
			employeeHours = 0;
		}
		employeeWage = employeeHours * EMPLOYEE_RATE_PER_HOUR;
		System.out.println("Employee wage: " + employeeWage);

	}
}
