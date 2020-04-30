package com.sms.application;

public class FulltimeStudent extends StudentInfo {

	public String toCourseInfo() {
		return ("Your Courses:\n" + courseName1 + "\n" + courseName2 + "\n" + courseName3 + "\nYour total marks : "
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
