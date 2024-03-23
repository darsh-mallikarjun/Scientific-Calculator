package com.student.scientific;

import java.util.Scanner;

public class Exponentiation {
Scanner scanner = new Scanner(System.in);
	
	public void exponent() {
		
   System.out.println("Enter the base:");
   double base= scanner.nextDouble();
   System.out.println("Enter the exponent:");
   double exponent = scanner.nextDouble();
   System.out.println("Result=" + Math.pow(base,exponent));
   
 
}
}
