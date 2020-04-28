package com.sms.application;

import java.util.Scanner;

public class StudentInfo {

	private String firstName;
	private String Lastname;
	private int StudentID;
	private String Department;
	private String Section;
	
	public void Student() {
		Scanner in = new Scanner(System.in);
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
	}
	public String toFinalInfo() {
		System.out.println("\n");
		return ("Name: " + firstName + " " + Lastname + "\nStudentID: " + StudentID + "\nSection and Department: "
				+ Section);
	}

}
