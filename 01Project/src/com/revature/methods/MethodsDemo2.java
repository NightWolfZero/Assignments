package com.revature.methods;

import java.util.Scanner;

public class MethodsDemo2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter num1 : ");
	int n1=sc.nextInt();
	System.out.println("Enter num2 : ");
	int n2=sc.nextInt();
	int res=sum(n1,n2); //function call with arguments and a return value
	System.out.println("Sum of " +n1+ " and" + n2 + " is " + res);
}

//function definition - with parameter and returns
public static int sum(int x, int y) {
	int result =x+y;
	return result;
	}

}
