package com.revature.assignments;
import java.util.Arrays;import java.util.Collections;
import java.util.Random;


public class ArrayShowcase {
public static void main(String[] args) {
	Random rd = new Random(); // Creates random object
	int size=5;
	int[] arr = new int[size];
	//Regular For loop
	for(int i=0;i < arr.length;i++) { 
		arr[i] = rd.nextInt(); //Stores random integers in array
		//System.out.println("Using regular for loop "+arr[i]); // Print each element in array
	}
	//enhanced(arr);
	//sum(arr,size);
	//even(arr,size);
	//odd(arr, size);
	sumEvenOdd(arr, size);
}//main end

//Enhanced For loop
	public static void enhanced(int arr[]) {
	for(int randomShow : arr) {
		System.out.println("This is using enhanced For loop "+randomShow);
	}
}//End
	
	//Calculate and display the sum of the elements of the array
	public static int sum(int arr[], int size) {
	int sums=0;
	for(int i=0;i<size;i++) {
		sums+=+arr[i];
	}
	
	System.out.println("Sum of all the elements in array is " +sums );
	return sums;
	
}//END
	
	//Display all the even numbers in the array
	public static void even(int arr[], int size) {
		System.out.println("Even numbers in the array are :");
	for (int i=0;i<size;i++)
	{
		if (arr[i] % 2==0)
		{
			System.out.println("");
			System.out.println("Even numbers :"+arr[i]);
		}	
	}	
}//END
	public static void odd(int arr[], int size) {
	//Display odd numbers in the array
		System.out.println("Odd numbers in the array are: ");
for (int i = 0;i<size;i++) {
	if(arr[i]%2 != 0) {
		System.out.println(arr[i]+"");
	}
}
}//END

//Calculate and display the sum of even and odd numbers
	public static void sumEvenOdd(int arr[], int size) {
int evenNums = 0, oddNums = 0, i;

for (i=0;i<=size;i++)
{
	if(arr[i]%2==0)
	{
		evenNums=evenNums+arr[i];
	}
	else {
		oddNums=oddNums+arr[i];
	}
	System.out.println("The Sum of the Even Numbbers = " +evenNums );
	System.out.println("The Sum of the Odd Numbbers = " +oddNums );
}
	}//END

//Ascending Order
	public static void ascend(int arr[]) {
Arrays.sort(arr);
System.out.println("Sorted Array");
for (int num : arr)
{
	System.out.println(num+ "");
}
	}//END
	
//Descending Order
	public static void descend(int arr[]) {
ArrayUtils.reverse(arr);
System.out.println("Array in descending order"+Arrays.toString(arr));

//END
}
	public static void average(int arr[]) {
int sum= 0;
int length = arr.length;
for(int i=0;i<length;i++)
{
	sum +=arr[i];
}
double average = sum/length;
System.out.println("average of array: " +average);
}//END
	
}
