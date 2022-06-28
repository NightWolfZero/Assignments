package com.revature.examples.list;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ListDemo {
public static void main(String[] args) {
	List<String> myList=new ArrayList<String>();
	myList.add("Mike");
	myList.add("Carl");
	myList.add("Josh");
	myList.add("Blaine");
	myList.add("Josh");
//	myList.add(1);//	myList.add(5);
	
	System.out.println(myList);
	
	// 1st way to display
	for(int i=0;i<myList.size();i++)
		System.out.println(myList.get(i)+ " , ");
	
	//2nd way -- using an iterator
	Iterator myListItr=myList.iterator();
	while(myListItr.hasNext())
		System.out.println(myListItr.next()+ " - ");
	
	//3rd way -- using Enhanced For Loop
	for(String s: myList)
		System.out.println(s + " # ");
	
	myList.add("Angela");
	myList.add("Abigail");
	
	for(String s: myList)
		System.out.println(s);
	
	myList.remove("Josh");
	
	for(String s: myList)
		System.out.println(s);
	
	List<String> myList2=new ArrayList<String>();
	myList2.add("Jamari");
	myList2.add("Khoa");
	
	myList.addAll(myList2);
	
	for(String s: myList)
		System.out.print(s + " $ ");
	System.out.println();
	System.out.println("Does The list contain me " +myList.contains("Khoa"));
}
}
