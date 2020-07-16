package Serilizations;

import java.io.Serializable;

public class Employee implements Serializable {
 String name;
 String dob;
 String dept;
 String desgn;
 double salary;
public void Employee(String name, String dob, String dept, String desgn, double salary) {
	
	this.name = name;
	this.dob = dob;
	this.dept = dept;
	this.desgn = desgn;
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getDesgn() {
	return desgn;
}
public void setDesgn(String desgn) {
	this.desgn = desgn;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", dob=" + dob + ", dept=" + dept + ", desgn=" + desgn + ", salary=" + salary
			+ "]";
}
 
}
