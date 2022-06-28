package com.revature.myemployees;

public class EmployeeManager {

	public static void main(String[] args) {

	//	int []myArr=new int[5];
		Employees [] employee=new Employees[5];
		
		//Create an object of Employee
		for (int i=0;i<employee.length;i++) 
			employee[i]=new Employees(); //
		employee[0].createEmployee(007, "Agent", "SuperSpy", 500000);
		employee[0].displayEmployee();
		
		employee[1].createEmployee(077, "Dr. Otto", "Mad Scientist", 750000);
		employee[1].displayEmployee();
		
		employee[2].createEmployee(001, "The OG", "Creator", 999999);
		employee[2].displayEmployee();
		
	}
}
