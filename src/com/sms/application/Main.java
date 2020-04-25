package com.sms.application;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Project: Student Management System
//        The student management system allows users to keep track of students' information, courses, exams and fees.
//        Create the possible classes and relationship between these classes.(Use OOP concepts)
    	
    	int x=0;
    	int code;
    	StudentInfo[] students = new StudentInfo[1];
    	
    	do {
    	
    	System.out.println("\t\t\tWELCOME TO THE PROJECT MANAGEMENT SYSTEM OF STUDENTS\t\t");
    	System.out.println("Press 1\t For Enroll new Student.\nPress 2\t For See the list.\nPress 3\t For Quit.");
    	 	
    	
        Scanner function = new Scanner(System.in);
		code = function.nextInt();
		switch(code)
		{
    	
    	case 1 :
    	
    		System.out.println("\t\t\tPLEASE FOLLOW THE ENROLLMENT PROCESS");
        	//Scanner in = new Scanner(System.in);
        	//TotalStudents = in.nextInt();
        		
        	for (int n = 0; n < 1; n++) {
        		students[n] = new StudentInfo();
        		students[n].Student();
        		students[n].courseEnrollment();
        		students[n].paidPayment();
        		students[n].AboutMakrs();
        		students[n].AboutPassorFail();
        		students[n].resultfinal();
        		System.out.println("-------xxxx------");
        		System.out.println("\n");
        		System.out.println("Your Final Info:");
        		System.out.printf(students[n].toFinalInfo());
        		students[n].resultfinal();
        	}
        
        break;
        
    	case 2:
    		
    	System.out.println("\t\t\tTHESE ARE THE STUDENTS THAT ENROLLED");
    	StudentInfo stu1 = new StudentInfo();
    	stu1.DumyData();
    	System.out.println("\t\t\tNEW STUDENT ADDED");
    	
    	for(int i=0;i<1;i++)
    	{
    				
    		System.out.println(students[i].toFinalInfo());			
    	
    	}
    	
    	break;
    	
    	default :
    		System.out.println("Thanks for visiting!!");
    	}
        	
		System.out.println("\nPress M for Main menu");
		Scanner Mainmenu = new Scanner(System.in);
		String Value = Mainmenu.nextLine();
        	
    	}
    	
    	while(x<10000);

    	}
    	
    }
    	


    	


    	
  
