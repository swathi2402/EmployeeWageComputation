package com.BrigdeLabz.EmployeeWageComputation;

public class EmployeeWageCalculator {
	public static void main(String[] args) {
		System.out.println("***** Welcome to Employee Wage Computation *****");
		int employeePresent = 1;
		double isEmployeePresent = Math.floor(Math.random() * 10) % 2;
		if (isEmployeePresent == employeePresent) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}
	}
}
