package com.student.scientific;

import java.util.Scanner;

public class Division {
Scanner scanner = new Scanner(System.in);
	
	public void div() {
		System.out.println("Enter the first number:");
		   double numerator= scanner.nextDouble();
		   System.out.println("Enter the Second number:");
		   double denominator= scanner.nextDouble();
		if(denominator!=0) {
			System.out.println("Result:"+(numerator/denominator));
		}
		else {
   System.out.println("Error! cannot divide by zero");
}
}
}
