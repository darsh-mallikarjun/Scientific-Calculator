package com.student.scientific;

import java.util.Scanner;

public class Subtraction {
		Scanner scanner = new Scanner(System.in);
		
		public void subtract() {
			
	   System.out.println("Enter the first number:");
	   double num1= scanner.nextDouble();
	   System.out.println("Enter the Second number:");
	   double num2 = scanner.nextDouble();
	   System.out.println("Result=" +(num1-num2));
	   
}
}
