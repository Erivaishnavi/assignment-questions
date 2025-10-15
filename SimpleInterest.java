package com.codegnan.fundamentals;
import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Principal: ");
	        double principal = sc.nextDouble();
	        System.out.print("Enter Rate of Interest (%): ");
	        double rate = sc.nextDouble();
	        System.out.print("Enter Time (years): ");
	        double time = sc.nextDouble();

	        double interest = (principal * rate * time) / 100;
	        double total = principal + interest;

	        System.out.printf("Simple Interest: %.2f\n", interest);
	        System.out.printf("Total Amount: %.2f\n", total);
	        sc.close();

	}

}
