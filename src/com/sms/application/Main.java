package com.sms.application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//        Project: Student Management System
//        The student management system allows users to keep track of students' information, courses, exams and fees.
//        Create the possible classes and relationship between these classes.(Use OOP concepts)

		boolean isExit = false;
		int code;
		StudentInfo[] studentArray = new StudentInfo[100];
		int numberOfStudent = 0;
		partTimeStudent[] Student2Array = new partTimeStudent[100];
		int numberofStudent2 = 0;
		FulltimeStudent[] Student3Array = new FulltimeStudent[100];
		int numberofStudent3 = 0;

		do {
			System.out.println("\t\t\tWELCOME TO THE PROJECT MANAGEMENT SYSTEM OF STUDENTS\t\t");
			System.out.println("Please choose your category:\nPress 1\t For full time Student.\nPress 2\t For part time student.\nPress 3\t For Quit!");
	
			Scanner scanner = new Scanner(System.in);
			code = scanner.nextInt();
			switch (code) {

			case 1:

				System.out.println("\t\t\tPLEASE FOLLOW THE ENROLLMENT PROCESS");
				
				FulltimeStudent addition = new FulltimeStudent();
				//student = new StudentInfo();
				addition.Student();
				addition.CoursesAddition();
				addition.Fees();
				addition.toFinalInfo();
				addition.toCourseInfo();
				System.out.println("\n");
				studentArray[numberOfStudent++] = addition;
				System.out.println("\t\t\tPLEASE CHECK YOUR FINAL INFO");
				for (int i = 0; i < numberOfStudent; i++) {
					System.out.println(studentArray[i].toFinalInfo());
					
					Student3Array[numberofStudent3++] = addition;
			    for (int x = 0; x < numberofStudent3; x++) {
			    	System.out.println(Student3Array[i].toCourseInfo());
			    	System.out.println(Student3Array[i].toFeesrecord1());
			    	System.out.println("\n");
			    }
				}
				break;

			case 2:

				partTimeStudent Stu1 = new partTimeStudent();
				Stu1.Student1();
				Stu1.CoursesAddition();
				Stu1.Fees();
				Stu1.topartTimeInfo();
				Stu1.toCourseInfo();
				System.out.println("\n");
				Student2Array[numberofStudent2++] = Stu1;
				System.out.println("\t\t\tPLEASE CHECK YOUR FINAL INFO");
				for (int a = 0; a < numberofStudent2; a++) {
					System.out.println(Student2Array[a].topartTimeInfo());
					System.out.println(Student2Array[a].toCourseInfo());
					System.out.println(Student2Array[a].toFeesrecord1());
				}
				break;

			case 3:

				isExit = true;
				break;

			default:
			}

		} while (!isExit);

	}

}
