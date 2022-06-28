package com.revature.examples.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeManager {

	public static void main(String[] args) {
		List<Employee> empArList=new ArrayList<Employee>();
		
		System.out.println("This is implementing ArrayList");
		empArList.add(new Employee (01, "Jamari", "Gant", 9999));
		empArList.add(new Employee (02, "Jerry", "Reeve", 8888));
		empArList.add(new Employee (03, "Zidan", "Abdullah", 7777));
		empArList.add(new Employee (04, "Michael", "Eldredge", 6666));
		empArList.add(new Employee (05, "Connor", "Loskie", 5555));
		
		for(Employee s: empArList)
			System.out.println(s);
		
		Set<Employee> empHSet=new HashSet<Employee>();
		
		Employee e1=new Employee(06, "Jasdhir", "Singh", 4444 );
		Employee e2=new Employee(07, "Maduabuchi", "Nwankwo", 3333 );
		Employee e3=new Employee(8, "Mike", "Kight", 2222 );
		
		empHSet.add(e1);
		empHSet.add(e2);
		empHSet.add(e3);
	
		System.out.println("Sort by First Name ...");
		
		Collections.sort(empArList, new FirstNameComparator());
		System.out.println(empArList);

	}

}
