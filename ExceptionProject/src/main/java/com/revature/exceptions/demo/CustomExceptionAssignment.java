package com.revature.exceptions.demo;

public class CustomExceptionAssignment extends Exception{
public CustomExceptionAssignment() {
	
}
public static void main(String [] args) throws ArrayIndexOutOfBoundsException {
	CustomExceptionAssignment a = new CustomExceptionAssignment();
	int [] command = new int[10];
	command[2]= 23;
try {
System.out.println("Start of try the block");

System.out.println("End of try the block");
//System.exit(0);
command[10] = 29;
throw new CustomExceptionAssignment();
} 
catch(ArrayIndexOutOfBoundsException CustomExceptionAssignment e)
{
	System.out.println("Start of catch block");
	System.out.println(e.getMessage());
	System.out.println("End of catch block");
}
finally {
System.out.println("Adios...");
}
}
}
