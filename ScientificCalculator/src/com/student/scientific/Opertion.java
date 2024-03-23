package com.student.scientific;
import java.io.InputStream;
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
                Addition add = new Addition();
                add.add();
                break;
            case 2:
                Subtraction subtraction = new Subtraction();
                subtraction.sub();
                break;
            case 3:
                Multiplication multiplication = new Multiplication();
                multiplication.multiply();
                break;
            case 4:
                Division division = new Division();
                division.div();
                break;
            case 5:
                SquareRoot square = new SquareRoot();
                square.square();
                break;
            case 6:
                Exponentiation exp = new Exponentiation();
                exp.exponent();
                break;
            default:
                System.out.println("Invalid choice! Please choose again.");
        }
}
	        scanner.close();
	}
	}





	
	