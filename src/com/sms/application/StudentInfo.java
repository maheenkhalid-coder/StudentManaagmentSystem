package com.sms.application;

import java.util.Scanner;

public class StudentInfo {
	
	boolean isFeesPaid = false;
	int fullpaid;
	private String firstName;
	private String Lastname;
	private int StudentID;
	private String Department;
	private String Section;
	private String Address;
	private int EnrollmentYear;

	int courseMarks = 100;
	int totalmarks = 300;
	String courseName1;
	String courseName2;
	String courseName3;
	Scanner scan = new Scanner(System.in);
	int Fees = 5000;
	int payment;
	Scanner in = new Scanner(System.in);

	public void Student() {
		System.out.print("Enter your First Name: ");
		this.firstName = in.nextLine();

		System.out.print("Enter your Last Name: ");
		this.Lastname = in.nextLine();

		System.out.print("Enter your Student ID: ");
		this.StudentID = in.nextInt();

		System.out.println("Enter your Department ");
		this.Department = in.nextLine();

		System.out.println("  and Section: ");
		this.Section = in.nextLine();

		System.out.println("Enter Your Address: ");
		this.Address = in.nextLine();

		System.out.println("Enter your Enrollment Year: ");
		this.EnrollmentYear = in.nextInt();

	}

	public void CoursesAddition() {
		System.out.printf("Please Select your courses from given list:");
		System.out.println(
				"\n1.\tENGLISH\n2.\tMATH.\n3.\tJAVA.\n4.\tURDU.\n5.\tCOMPUTER.\n6.\tSCIENCE.\n7.\tSTRINGS.\n8.\tBIT COINS.\n9.\tINTERNET.\n10.\tADVANCE ENGINEERING.");
		
		System.out.println("Course:01");
		this.courseName1 = scan.nextLine();
		System.out.println("Course marks: " + courseMarks);
		System.out.println("Course:no02");
		this.courseName2 = scan.nextLine();
		System.out.println("Course marks: " + courseMarks);
		System.out.println("Course:no03");
		this.courseName3 = scan.nextLine();
		System.out.println("Course marks: " + courseMarks);

	}

	public void Fees() {
		System.out.println("\n");
		System.out.println("Course total marks: " + totalmarks);
		System.out.println("Your Total Fess is Rs: " + Fees);
		System.out.println("Enter your payemnt Rs:");
		this.payment = scan.nextInt();
		if (payment == 5000) {
			isFeesPaid = true;
			System.out.println("Thank you for your payemnt!!");
		} else {
			Fees = Fees - payment;
			isFeesPaid = false;
			System.out.println("Your Blance Amount is Rs: " + Fees);
		}
	}


	public String toFinalInfo() {
		System.out.println("\n");
		return ("Name: " + firstName + " " + Lastname + "\nStudentID: " + StudentID + "\nSection and Department: "
				+ Section + "\nAddress: " + Address + "\nEnrollment year: " + EnrollmentYear);
	}

}
