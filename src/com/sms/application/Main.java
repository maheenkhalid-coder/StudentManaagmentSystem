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

		Courses[] coursesArray = new Courses[100];
		int numberofCourses = 0;

		do {
			System.out.println("\t\t\tWELCOME TO THE PROJECT MANAGEMENT SYSTEM OF STUDENTS\t\t");
			System.out.println(
					"Press 1\t For Enroll new Student.\nPress 2\t For See the Student list.\nPress 3\t For add courses.\nPress 4\t List of all added courses.\nPress 5\t For Examination Process.\nPress 6\t For Fees Structure.\nPress 7\t For Quit.");

			Scanner scanner = new Scanner(System.in);
			code = scanner.nextInt();
			switch (code) {

			case 1:

				System.out.println("\t\t\tPLEASE FOLLOW THE ENROLLMENT PROCESS");
				StudentInfo student = new StudentInfo();
				student = new StudentInfo();
				student.Student();
				System.out.println("\n");
				studentArray[numberOfStudent++] = student;
				break;

			case 2:

				System.out.println("\t\t\tTHESE ARE THE STUDENTS THAT ENROLLED");
				for (int i = 0; i < numberOfStudent; i++) {
					System.out.println(studentArray[i].toFinalInfo());
					System.out.println("\n");
				}
				break;

			case 3:

				Courses addition = new Courses();
				addition.CoursesAddition();
				System.out.println("\n");
				coursesArray[numberofCourses++] = addition;
				break;

			case 4:

				System.out.println("\t\t\tTHESE ARE THE COURSES THAT ADDED");
				for (int a = 0; a < numberofCourses; a++) {
					System.out.println(coursesArray[a].toCourseInfo());
					System.out.println("\n");
				}
				break;

			case 5:

				System.out.println("\t\t\tEXAMINATION PROCESS");
				Courses Exams = new Courses();
				Exams.CoursesAddition();
				Exams.AboutPassorFail();
				Exams.resultfinal();
				break;

			case 6:

				System.out.println("\t\t\tFEES STRUCTURE");
				Courses Fees = new Courses();
				Fees.toCourseInfo();
				Fees.Fees();
				System.out.println("\n");
				break;

			case 7:

				isExit = true;
				break;

			default:

			}

		} while (!isExit);

	}

}
