import java.util.Scanner;

public class ScannerDemo{
	public static void main (String[] args){
	Scanner getInfo = new Scanner(System.in);
	
	System.out.println("Enter name, age, and favorite number:");

	//String input 
	String name = getInfo.nextLine();
		
	//Number Input
	int age = getInfo.nextInt();
	int favNum = getInfo.nextInt();

	//User
	System.out.println("Your Name: " + name);
	System.out.println("Your Age: " + age);
	System.out.println("Favorite Number: " + favNum);
}
}