package com.revature.examples.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSort {

	public static void main(String[] args) {
		List<String> myList=new ArrayList<String>();
		
		myList.add("Brooke");
		myList.add("Nicholas");
		myList.add("Archerie");
		myList.add("Zidan");
		myList.add("August");
		
		System.out.println(myList);
		
		// Collections is a class -- do not confuse it by Collection (NO S) interface
		Collections.sort(myList);
		
		System.out.println(myList);
		
		Collections.sort(myList, Collections.reverseOrder());
		
		System.out.println(myList);
	}

}
