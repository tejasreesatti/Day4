package com.capgemini.icici.domain;

public class Employee {
	private long employeeId;
	private String employeeName;
	private String employeeAddress;
	private String employeePhoneNumber;
	private double basicSalary;
	public static final double specialAllowance = 250.80;
	public static final double hRA = 1000.50;
	
	private static long employeeAccounts;
	
	public Employee() {
		employeeAccounts++;
	}
	
	public Employee(long employeeId, String employeeName, String employeeAddress, String employeePhoneNumber) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhoneNumber = employeePhoneNumber;
		
		employeeAccounts++;
	}
	
	public double calculateSalary(double basicSalary)
	{
		double salary = (basicSalary * (specialAllowance/ 100)) + (basicSalary * (hRA / 100));
		return salary;
	}
}
