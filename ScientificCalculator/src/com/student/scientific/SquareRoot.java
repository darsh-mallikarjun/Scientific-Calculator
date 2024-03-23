package com.student.scientific;

import java.util.Scanner;

public class SquareRoot {
Scanner scanner = new Scanner(System.in);
	
	public void square() {
		
   System.out.println("Enter the number:");
   double num= scanner.nextDouble();
   if(num>=0) {
	   
   System.out.println("Result:" +Math.sqrt(num));
   }
   else {  
   System.out.println("connot calcaulate squre root of a negative number!");
   }
	}
}
