package com.student.scientific;
import java.util.*;
public class Opertion {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		 System.out.println("Welcome to the Calculator!");

	        while (true) {
	            System.out.println("\nChoose an operation:");
	            System.out.println("1. Addition");
	            System.out.println("2. Subtraction");
	            System.out.println("3. Multiplication");
	            System.out.println("4. Division ");
	            System.out.println("5. Square root");
	            System.out.println("6. Exponentiation");
	            System.out.println("7. Exit");

	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            if (choice == 7) {
	                System.out.println("Exiting Calculator. Goodbye!");
	                break;
	            }
	        switch (choice) {
            case 1:
            	System.out.println("Enter the first number:");
            	   double num1= scanner.nextDouble();
            	   System.out.println("Enter the Second number:");
            	   double num2 = scanner.nextDouble();
                Addition add = new Addition();
                add.add(num1, num2);
                break;
            case 2:
            	System.out.println("Enter the first number:");
            	   double a= scanner.nextDouble();
            	   System.out.println("Enter the Second number:");
            	   double b = scanner.nextDouble();
                Subtraction subtraction = new Subtraction();
                subtraction.subtract(a, b);
                break;
            case 3:
            	System.out.println("Enter the first number:");
         	   double a1= scanner.nextDouble();
         	   System.out.println("Enter the Second number:");
         	   double b1 = scanner.nextDouble();
                Multiplication multiplication = new Multiplication();
                multiplication.multiply(a1, b1);;
                break;
            case 4:
            	System.out.println("Enter the numerator:");
         	   double a2= scanner.nextDouble();
         	  System.out.println("Enter the denominator:");
         	   double b2 = scanner.nextDouble();
                Division division = new Division();
                division.divide(a2, b2);
                break;
            case 5:
            	System.out.println("Enter the number:");
          	   double num= scanner.nextDouble();
                SquareRoot square = new SquareRoot();
                square.square(num);;
                break;
            case 6:
            	 System.out.println("Enter the base:");
            	   double base= scanner.nextDouble();
            	   System.out.println("Enter the exponent:");
            	   double exponent = scanner.nextDouble();
                Exponentiation exp = new Exponentiation();
                exp.exponent(base, exponent);
                break;
            default:
                System.out.println("Invalid choice! Please choose again.");
        }
}
	        scanner.close();
	}
	}





	
	