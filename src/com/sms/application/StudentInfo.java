package com.sms.application;

import java.util.Scanner;

public class  StudentInfo {

	private String firstName;
	private String Lastname;
	private int StudentID;
	private String courses = "";
	private static int tutionfee = 5000;
	private  static int costofCourse = 1000;
	private int BlanceAmout;
	private static int id = 1000;
	private static int totalMArks = 500;
	private static int MarksperCourse = 100;
	private int YourMarks;
	private int English;
	private int Urdu;
	private int Pst;
	private int Math;
	private int Java;
	private int sum;

	
	
	public void Student() {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter Student First Name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter Student Last Name: ");
		this.Lastname = in.nextLine();
		
		System.out.print("Enter Student ID: ");
		this.StudentID = in.nextInt();
		
		setStudentID();  
			
	}
	private void setStudentID() {
		id++;
		this.StudentID = id;
		
	}
	
	public void courseEnrollment() {
		
	System.out.println("Enter your Courses:");
	Scanner course = new Scanner(System.in);
	String course1 = course.nextLine();
	String course2 = course.nextLine();
	String course3 = course.nextLine();
	String course4 = course.nextLine();
	String course5 = course.nextLine();

		}
		
	
	public void BlanceAmount() {
		System.out.println("Your Total Amount is: Rs: 5000");
		
	}
		
	public void paidPayment() {
		BlanceAmount();
		System.out.println("Enter your payemnt Rs:");
		Scanner in = new  Scanner(System.in);
		int payment = in.nextInt();
		tutionfee = tutionfee - payment;
		System.out.println   ("Thank you for your payemnt Rs:" + payment);
		System.out.println("Your Blance Amount is Rs: " +tutionfee);
			
	}
	
	public void AboutMakrs() {
		
		System.out.println("\t\t\tEXAM PROCESS");
		System.out.println("Enter your ENGLISH course marks: ");
		Scanner code = new Scanner(System.in);
		this.English = code.nextInt();
		System.out.println("Enter your URDU course marks: ");
		this.Urdu = code.nextInt();		
		System.out.println("Enter your PST course marks: ");
		this.Pst = code.nextInt();
		System.out.println("Enter your MATH course marks: ");
		this.Math = code.nextInt();
		System.out.println("Enter your JAVA course marks: ");
		this.Java = code.nextInt();
		
		sum = English + Urdu + Pst + Math + Java;
		
		
	}
	
	public void AboutPassorFail() {
		
		System.out.println("Your Total Marks are: " + sum);
		
		System.out.println("\n");
	}
	
		public void resultfinal() {
	    
	    if(sum > 250) {
	   
	    	
	    	System.out.println("Your Final result is: \nPASS");
	    	System.out.println("\n");
	    }
	    else {
	    	System.out.println("Your Final result is: \nFAil");
	    	System.out.println("\n");
	    	
	    }    		
	}
	
	public String toFinalInfo() {
		System.out.println("\n");
		return ("Name: " + firstName + " " + Lastname + "\nStudentID: " + StudentID + "\nCourses Enrolled:\n1.English.\n2.Urdu.\n3.Java.\n4.Pst.\n5.Math.\n");
		
			
		}
	public void DumyData() {
	
		System.out.println("Name: Sara Khan\nStudentID: 1009\nCourses Enrolled:\n1.English\n2.Urdu\n3.Math\n4.Java\n5.Pst.");
		System.out.println("\n");
		System.out.println("Name: Maria Rohail\nStudentID: 1002\nCourses Enrolled:\n1.English\n2.Urdu\n3.Math\n4.Java\n5.Pst.");
		System.out.println("\n");
		System.out.println("Name: Ali Khan\nStudentID: 1003\nCourses Enrolled:\n1.English\n2.Urdu\n3.Math\n4.Java\n5.Pst.");
		System.out.println("\n");
		System.out.println("Name: Saana Emaan\nStudentID: 1006\nCourses Enrolled:\n1.English\n2.Urdu\n3.Math\n4.Java\n5.Pst.");
	    }
	
		}
	

		

	
	
	