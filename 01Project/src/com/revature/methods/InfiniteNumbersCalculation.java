package com.revature.methods;

public class InfiniteNumbersCalculation {
public static void main(String[] args) {
	int result=sum();
	System.out.println("Result = " +result);
}
// method with var args OR variable arguments
public static int sum(int ...num) {
	int res=0;
	for (int i=0;i<num.length;i++)
		res=res+num[i];
	
	return res;
}
}
