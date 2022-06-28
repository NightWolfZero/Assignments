package com.revature.myemployees;

public class Employees {
int id;
String name;
String department;
double salary;

public void createEmployee(int id, String name, String department, double salary)
{
	this.id = id;
	this.name = name;
	this.department = department;
	this.salary = salary;
}
	public void displayEmployee() {
		System.out.println("ID : " +this.id+ " Name : " +this.name+ " Department : " +this.department+ " Salary : " +this.salary);
	}
}
