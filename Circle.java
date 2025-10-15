package com.codegnan.fundamentals;
import java.util.Scanner;
public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
         System.out.print("Enter radius of the circle: ");
	        double radius = sc.nextDouble();
	        double area = Math.PI * radius * radius;
            System.out.printf("Area of the circle: %.2f\n", area);

	        sc.close();
	}

}
