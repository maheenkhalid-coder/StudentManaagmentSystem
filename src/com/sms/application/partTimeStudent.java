package com.sms.application;

public class partTimeStudent extends StudentInfo {

	private String firstName;
	private String Lastname;
	private String Address;

	public void Student1() {

		System.out.print("Enter your First Name: ");
		this.firstName = in.nextLine();
		System.out.print("Enter your Last Name: ");
		this.Lastname = in.nextLine();
		System.out.println("Enter Your Address: ");
		this.Address = in.nextLine();

	}

	public String topartTimeInfo() {
		System.out.println("\n");
		return ("Name: " + firstName + " " + Lastname + "\nAddress: " + Address);
	}

	public String toCourseInfo() {
		
		return ("Your Courses:\nCourse.01: " + courseName1 +"\nCourse.02: " + courseName2 + "\nCourse.03: " + courseName3 + "\nYour total marks : "
				+ totalmarks);
	}
	public String toFeesrecord1() {
		if(isFeesPaid == true ) {
			System.out.println("Fees paid!!");
		}
		else if(isFeesPaid == false)  {
			System.out.println("Fees unpaid!!");
		}
		
		return ("\n");
	}
	
}
