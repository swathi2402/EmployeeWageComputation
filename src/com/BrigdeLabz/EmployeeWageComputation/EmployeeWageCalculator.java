package com.BrigdeLabz.EmployeeWageComputation;

public class EmployeeWageCalculator {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMPLOYEE_RATE_PER_HOUR = 20;
	public static final int NO_OF_WORKING_DAYS = 20;
	public static final int MAX_HOURS_IN_MONTH = 100;

	public static void main(String[] args) {
		System.out.println("***** Welcome to Employee Wage Computation *****");
		int employeeHours = 0;
		int totalEmployeeWage = 0;
		int totalEmployeeHours = 0;
		int totalWorkingDays = 0;
		while (totalEmployeeHours <= MAX_HOURS_IN_MONTH && totalWorkingDays < NO_OF_WORKING_DAYS) {
			totalWorkingDays++;
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
			totalEmployeeHours += employeeHours;
			System.out.println("day: " + totalWorkingDays + " Employee Hour: " + employeeHours);
		}
		totalEmployeeWage = totalEmployeeHours * EMPLOYEE_RATE_PER_HOUR;
		System.out.println("Total Employee wage: " + totalEmployeeWage);
	}
}
