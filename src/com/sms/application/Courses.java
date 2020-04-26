package com.sms.application;

import java.util.Scanner;

public class Courses {

	int totalMarks = 100;
	String courseName;
	Scanner scan = new Scanner(System.in);
	int yourMarks;
	int Fees = 1000;
	int payment;

	public void CoursesAddition() {

		System.out.printf("your course name: ");
		this.courseName = scan.nextLine();
		System.out.println("Course total marks: " + totalMarks);
	}

	public String toCourseInfo() {
		System.out.println("\n");
		return ("Your course name: " + courseName + "\nTotal marks : " + totalMarks);

	}

	public void AboutPassorFail() {

		System.out.printf("Enter your Course Marks: ");
		this.yourMarks = scan.nextInt();

	}

	public void resultfinal() {

		if (yourMarks > 50) {

			System.out.println("Result: \nPASS");
			System.out.println("\n");
		} else {
			System.out.println("Result: \nFAil");
			System.out.println("\n");

		}
	}

	public void Fees() {

		System.out.println("Your Total Fess is Rs: " + Fees);
		System.out.println("Enter your payemnt Rs:");
		this.payment = scan.nextInt();
		// Fees= Fees - payment;
		// System.out.println("Thank you for your payemnt Rs:" + payment);

		if (payment == 1000) {
			System.out.println("Thank you for your payemnt!!");
		} else {
			Fees = Fees - payment;
			System.out.println("Your Blance Amount is Rs: " + Fees);

		}
	}

}
