package com.revature.exceptions.demo;

public class FirstExceptionExample {
public static void main(String[] args) {
	int [] myArray=new int [5];
	int x=20,y=0;
	int result;
	
	myArray[2]=15;
	
	//Exceptions
	try {
		System.out.println("Inside Try ...");
	myArray[6]=25;
	System.out.println("Still inside try");
	
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	catch (Exception e) {
		//TODO: handle exception
	}
	finally {
		System.out.println("always execute whether exeption or no exeption");
	}
	
	try {
		result=x/y;
	}
	catch(ArithmeticException e)
	{
		e.printStackTrace();
	}
	finally {
		System.out.println("Divide by Zero");
	}
	System.out.println("This program is complete. . .");
	}
}

