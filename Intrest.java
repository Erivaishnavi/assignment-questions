package com.codegnan.fundamentals;
import java.util.Scanner;
public class Intrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Principal Amount: ");
	        double principal = sc.nextDouble();
	        System.out.print("Enter Annual Rate of Interest (%): ");
	        double rate = sc.nextDouble();
	        System.out.print("Enter Time (in months): ");
	        int months = sc.nextInt();

	        double timeYears = months / 12.0;
	        double simpleInterest = (principal * rate * timeYears) / 100;
	        double totalSI = principal + simpleInterest;

	        double amountCI = principal * Math.pow((1 + rate / 100), timeYears);
	        double compoundInterest = amountCI - principal;
	        double totalCI = principal + compoundInterest;

	        System.out.printf("Time in years: %.2f\n", timeYears);
	        System.out.printf("Simple Interest: %.2f | Total Amount (SI): %.2f\n", simpleInterest, totalSI);
	        System.out.printf("Compound Interest: %.2f | Total Amount (CI): %.2f\n", compoundInterest, totalCI);
	        sc.close();

	}

}
