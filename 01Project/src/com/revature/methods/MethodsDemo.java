package com.revature.methods;

import java.util.Scanner;

public class MethodsDemo {
	
	public static void main(String [] args) {
		sum(); // method call
		sub();
		div();
		mul();
	}
	//method definition ADDITION
	public static void sum() {
	Scanner sc=new Scanner(System.in); // Scans user input
	System.out.print("Enter Number 1 : ");
	int n1=sc.nextInt();
	System.out.print("Enter Number 2 : ");
	int n2=sc.nextInt();
	int result=n1+n2;
	System.out.println("Sum of "+n1+" and "+n2+" = "+result);
}
	//method definition SUBTRACTION
		public static void sub() {
		Scanner sc=new Scanner(System.in);// Scans user input
		System.out.print("Enter Number 1 : ");
		int n1=sc.nextInt();
		System.out.print("Enter Number 2 : ");
		int n2=sc.nextInt();
		int result=n1-n2;
		System.out.println("Subtraction of "+n1+" and "+n2+" = "+result);
	}
		//method definition DIVISION
				public static void div() {
				Scanner sc=new Scanner(System.in);// Scans user input
				System.out.print("Enter Number 1 : ");
				int n1=sc.nextInt();
				System.out.print("Enter Number 2 : ");
				int n2=sc.nextInt();
				int result=n1/n2;
				System.out.println("Division of "+n1+" and "+n2+" = "+result);
			}
				//method definition MULTIPLICATION
				public static void mul() {
				Scanner sc=new Scanner(System.in);// Scans user input
				System.out.print("Enter Number 1 : ");
				int n1=sc.nextInt();
				System.out.print("Enter Number 2 : ");
				int n2=sc.nextInt();
				int result=n1*n2;
				System.out.println("Multiplication of "+n1+" and "+n2+" = "+result);
			}
	//method definition
		public static void allFour() {
		Scanner sc=new Scanner(System.in); // Scans user input
		System.out.print("Enter Number 1 : ");
		int n1=sc.nextInt();
		System.out.print("Enter Number 2 : ");
		int n2=sc.nextInt();
		System.out.println("Sum of "+n1+" and "+n2+" = " +(n1 + n2));
		System.out.println("Subtraction of "+n1+" and "+n2+" = " +(n1 - n2));
		System.out.println("Multiplication of "+n1+" and "+n2+" = " +(n1 * n2));
		System.out.println("Division of "+n1+" and "+n2+" = " +(n1 / n2));
	}		


}
