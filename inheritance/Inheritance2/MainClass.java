package Inheritance2;

public class MainClass {
public static void main(String[] args) {
	Employee e=new Employee("Jack",50000,2018,"28786hjsbd");
	System.out.println("Name :"+e.getName()+"\nSalary :"+e.getAnnualSalary()+"\nYear :"+e.getYear()+"\nInsurance Number :"+e.getInsuranceNumber());
}
}
