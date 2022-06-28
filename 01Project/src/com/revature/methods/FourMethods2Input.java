package com.revature.methods;

import java.util.Scanner;

public class FourMethods2Input {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1 : ");
		int n1=sc.nextInt();
		System.out.println("Enter num2 : ");
		int n2=sc.nextInt();
		sum(n1,n2); //function call with arguments
		sub(n1,n2);
		mul(n1,n2);
		div(n1,n2);
	}

	//function definition - with parameters
	public static void sum(int x, int y) {
		int result =x+y;
		System.out.println("Sum of " +x+ " and " +y+ " is " + result);
		}
	
	public static void sub(int x, int y) {
		int result =x-y;
		System.out.println("Subtraction of " +x+ " and " +y+ " is " + result);
	}
	
	public static void mul(int x, int y) {
		int result =x*y;
		System.out.println("Multiplication of " +x+ " and " +y+ " is " +result);
	}
	
	public static void div(int x, int y) {
		int result =x/y;
		int remainder = x%y;
		System.out.println("Division of " +x+ " and " +y+ " is " +result+ ". Remainder= "+ remainder );
	}
	
	}
