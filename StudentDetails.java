package com.codegnan.fundamentals;
import java.util.Scanner;
public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Grade: ");
        String grade = sc.nextLine();
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        sc.close();
	}

}
