package org.jdbc.demo.myjdbcdemos;

public class Employee {

	int empId;
	String lastName;
	String firstName;
	String designation;
	long salary;
	
	
	
	public Employee(int empId, String lastName, String firstName, String designation, long salary) {
		super();
		this.empId = empId;
		this.lastName = lastName;
		this.firstName = firstName;
		this.designation = designation;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	
}
