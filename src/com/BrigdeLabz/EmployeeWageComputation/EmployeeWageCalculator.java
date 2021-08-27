package com.BrigdeLabz.EmployeeWageComputation;

public class EmployeeWageCalculator {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	private int numberOfCompany = 0;
	private CompanyEmployeeWage[] companyEmployeeWageArry;
	
	public EmployeeWageCalculator() {
		companyEmployeeWageArry = new CompanyEmployeeWage[5];
	}
	
	private void addCompanyEmployeeWage(String companyName, int employeeRatePerHour, int numOfWorkingDays, int maxHoursInMonth) {
		companyEmployeeWageArry[numberOfCompany] = new CompanyEmployeeWage(companyName, employeeRatePerHour, numOfWorkingDays, maxHoursInMonth);
		numberOfCompany++;
	}
	
	private void computeEmployeeWage() {
		for (int index = 0; index < numberOfCompany; index++) {
			companyEmployeeWageArry[index].setTotalEmployeeWage(this.computeEmployeeWage(companyEmployeeWageArry[index]));
			System.out.println(companyEmployeeWageArry[index]);
		}
	}

	public int computeEmployeeWage(CompanyEmployeeWage companyEmployeeWage) {
		int employeeHours = 0;
		int totalEmployeeHours = 0;
		int totalWorkingDays = 0;
		while (totalEmployeeHours <= companyEmployeeWage.maxHoursInMonth && totalWorkingDays < companyEmployeeWage.numOfWorkingDays) {
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
			System.out.println("day: " + totalWorkingDays + " Employee Wage: " + employeeHours * companyEmployeeWage.employeeRatePerHour);
		}
		return totalEmployeeHours * companyEmployeeWage.employeeRatePerHour;
	}

	public static void main(String[] args) {
		System.out.println("***** Welcome to Employee Wage Computation *****");
		EmployeeWageCalculator employeeWageCalculator = new EmployeeWageCalculator();
		employeeWageCalculator.addCompanyEmployeeWage("DMart", 20, 20, 100);
		employeeWageCalculator.addCompanyEmployeeWage("Relaince", 30, 25, 150);
		employeeWageCalculator.computeEmployeeWage();
	}
}