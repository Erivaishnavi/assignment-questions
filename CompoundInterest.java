package com.codegnan.fundamentals;
import java.util.Scanner;
public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Principal: ");
	        double principal = sc.nextDouble();
	        System.out.print("Enter Rate of Interest (%): ");
	        double rate = sc.nextDouble();
	        System.out.print("Enter Time (years): ");
	        double time = sc.nextDouble();

	        double amount = principal * Math.pow((1 + rate / 100), time);
	        double compoundInterest = amount - principal;

	        System.out.printf("Compound Interest: %.2f\n", compoundInterest);
	        System.out.printf("Total Amount: %.2f\n", amount);
	        sc.close();

	}

}
