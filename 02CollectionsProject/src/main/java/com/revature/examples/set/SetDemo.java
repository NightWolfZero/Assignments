package com.revature.examples.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

//		Set<String> mySet=new HashSet<String>(); //Duplicates aren't allowed and most recent is Overwrite
//		Set<String> mySet=new TreeSet<String>(); //Alphabetical order
		Set<String> mySet=new LinkedHashSet<String>();//Insertion Method is implemented

		
		mySet.add("Michael");
		mySet.add("Shayna");
		mySet.add("Jerry");
		mySet.add("AB");
		mySet.add("Jerry");
		mySet.add(null);
		
		for(String s: mySet)
			System.out.println(s);

	}

}
