package Inheritance2;

public class Employee extends Person {
	private double annualSalary;
	private int year;
	private String insuranceNumber;
	public Employee(String name, double annualSalary, int year, String insuranceNumber) {
		super(name);
		this.annualSalary = annualSalary;
		this.year = year;
		this.insuranceNumber = insuranceNumber;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getInsuranceNumber() {
		return insuranceNumber;
	}
	public void setInsuranceNumber(String insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
	
	
}
