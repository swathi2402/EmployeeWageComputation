package com.BrigdeLabz.EmployeeWageComputation;

public class EmployeeWageCalculator {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	private String companyName;
	private int employeeRatePerHour;
	private int numOfWorkingDays;
	private int maxHoursInMonth;
	
	private EmployeeWageCalculator(String companyName, int employeeRatePerHour, int numOfWorkingDays,
			int maxHoursInMonth) {
		super();
		this.companyName = companyName;
		this.employeeRatePerHour = employeeRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursInMonth = maxHoursInMonth;
	
		int employeeHours = 0;
		int totalEmployeeWage = 0;
		int totalEmployeeHours = 0;
		int totalWorkingDays = 0;
		while (totalEmployeeHours <= maxHoursInMonth && totalWorkingDays < numOfWorkingDays) {
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
			System.out.println("day: " + totalWorkingDays + " Employee Wage: " + employeeHours * employeeRatePerHour);
		}
		totalEmployeeWage = totalEmployeeHours * employeeRatePerHour;
		System.out.println("Total Employee wage for " +companyName + " is: " + totalEmployeeWage);
	}

	public static void main(String[] args) {
		System.out.println("***** Welcome to Employee Wage Computation *****");
		new EmployeeWageCalculator("DMart", 20, 20, 100);
		new EmployeeWageCalculator("Relaince", 30, 25, 150);
		
	}
}