package com.BrigdeLabz.EmployeeWageComputation;

public class CompanyEmployeeWage {
	public final String companyName;
	public final int employeeRatePerHour;
	public final int numOfWorkingDays;
	public final int maxHoursInMonth;
	public int totalEmployeeWage;

	public CompanyEmployeeWage(String companyName, int employeeRatePerHour, int numOfWorkingDays, int maxHoursInMonth) {
		super();
		this.companyName = companyName;
		this.employeeRatePerHour = employeeRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursInMonth = maxHoursInMonth;
	}
	
	public void setTotalEmployeeWage(int totalEmployeeWage) {
		this.totalEmployeeWage = totalEmployeeWage;
	}
	
	@Override
	public String toString() {
		return "Total Employee wage for " + companyName + " is: " + totalEmployeeWage;
	}
}
