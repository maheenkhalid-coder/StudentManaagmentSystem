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

	public void DumyData() {

		System.out.println(
				"Name: Sara Khan\nStudentID: 1009\nCourses Enrolled:\n1.English\n2.Urdu\n3.Math\n4.Java\n5.Pst.");
		System.out.println("\n");
		System.out.println(
				"Name: Maria Rohail\nStudentID: 1002\nCourses Enrolled:\n1.English\n2.Urdu\n3.Math\n4.Java\n5.Pst.");
		System.out.println("\n");
		System.out.println(
				"Name: Ali Khan\nStudentID: 1003\nCourses Enrolled:\n1.English\n2.Urdu\n3.Math\n4.Java\n5.Pst.");
		System.out.println("\n");
		System.out.println(
				"Name: Saana Emaan\nStudentID: 1006\nCourses Enrolled:\n1.English\n2.Urdu\n3.Math\n4.Java\n5.Pst.");
	}

}
