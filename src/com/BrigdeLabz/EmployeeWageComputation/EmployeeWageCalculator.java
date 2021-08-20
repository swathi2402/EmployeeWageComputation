package com.BrigdeLabz.EmployeeWageComputation;

public class EmployeeWageCalculator {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMPLOYEE_RATE_PER_HOUR = 20;
	public static final int NO_OF_WORKING_DAYS = 20;

	public static void main(String[] args) {
		System.out.println("***** Welcome to Employee Wage Computation *****");
		int employeeHours = 0;
		int employeeWage = 0;
		int totalEmployeeWage = 0;
		for (int day = 0; day < NO_OF_WORKING_DAYS; day++) {
			int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (employeeCheck) {
			case IS_FULL_TIME:
				employeeHours = 8;
				break;

			case IS_PART_TIME:
				employeeHours = 4;
				break;

			case 0:
				employeeHours = 0;
				break;
			}

			employeeWage = employeeHours * EMPLOYEE_RATE_PER_HOUR;
			totalEmployeeWage += employeeWage;
			System.out.println("Employee wage: " + employeeWage);
		}
		System.out.println("Total Employee wage: " + totalEmployeeWage);
	}
}
