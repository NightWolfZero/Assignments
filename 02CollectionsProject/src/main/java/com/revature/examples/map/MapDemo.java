package com.revature.examples.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		//Map<String, Integer> myMap=new Hashtable<String, Integer>();
		Map<String, Integer> myMap=new HashMap<String, Integer>(); // HashMap allows you to have null values
		
		myMap.put("Mike", 2500); //.put stores values in Map
		myMap.put("Austin", 2500);
		myMap.put("Jem", 2501);
		myMap.put("Austin", 2600); // Takes most latest duplicated value
		myMap.put(null, null); // Map doesn't allow null
		
		System.out.println(myMap);
		System.out.println(myMap.get("Austin"));// .get  It returns the value
		
//		Set<String> myKeys=myMap.keySet();
//		for(String s: myKeys)
//			System.out.println(s + " - "+ myMap.get(s));
		
		//Map cannot be iterated
		//In order to iterate we use keySet() that returns -- a Set of Keys
		Set<String> myKeys = myMap.keySet();//.keySet() return a set of keys
		for(String s: myKeys)
			System.out.println(s + " - " + myMap.get(s));
	}

}
