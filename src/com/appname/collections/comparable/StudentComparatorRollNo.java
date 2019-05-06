package com.appname.collections.comparable;

import java.util.Comparator;

public class StudentComparatorRollNo implements Comparator<Student_UsingComparator>{
	  @Override
	   public int compare(Student_UsingComparator obj1, Student_UsingComparator obj2){
		   
		   //Ascending Order by Roll No
		   //return obj1.rollno-obj2.rollno;
		   //Descending Order by Roll No
		   return obj1.getRollno()-obj2.getRollno();
	   } 

}
