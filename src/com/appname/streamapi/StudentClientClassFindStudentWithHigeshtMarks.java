package com.appname.streamapi;
import java.util.*;

public class StudentClientClassFindStudentWithHigeshtMarks {

	public static void main(String[] args) {
		StudentPojo s1 = new StudentPojo("Ritesh", 1,98,19);
		StudentPojo s2 = new StudentPojo("Ritika", 4,96,19);
		StudentPojo s3 = new StudentPojo("Riyansh", 5,94,19);
		StudentPojo s4 = new StudentPojo("Darsh", 10,91,19);
		StudentPojo s5 = new StudentPojo("Deeya", 11,99,19);
		StudentPojo s6 = new StudentPojo("Ipsita", 15,80,19);
		StudentPojo s7 = new StudentPojo("Ikshit", 16,81,19);
		StudentPojo s8 = new StudentPojo("Mohit", 18,99,19);
		
		List<StudentPojo> studentsList = new ArrayList<StudentPojo>();
		studentsList.add(s1);
		studentsList.add(s2);
		studentsList.add(s3);
		studentsList.add(s4);
		studentsList.add(s5);
		studentsList.add(s6);
		studentsList.add(s7);
		studentsList.add(s8);
		
		//Find Highest Marks
		int hm = studentsList.stream().map(each -> each.getMarks()).max(Integer::compare).get();
		
		//Now Print Student Details who has Got Highest Marks
		
		studentsList.stream().filter(each -> each.getMarks() == hm).forEach(each -> System.out.println(each.toString()));
		
		
		
		  
		
	}

}
