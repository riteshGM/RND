package com.appname.collections.comparable;

import java.util.Comparator;

public class Student_UsingComparator {
	//public class Student {
    private String studentname;
    private int rollno;
    private int studentage;

    public Student_UsingComparator(int rollno, String studentname, int studentage) {
        this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
    }
   
    //Sort by Roll No property
   public static Comparator<Student_UsingComparator> compareStudRollNo = new Comparator<Student_UsingComparator>(){
	   @Override
	   public int compare(Student_UsingComparator obj1, Student_UsingComparator obj2){
		   
		   //Ascending Order by Roll No
		   //return obj1.rollno-obj2.rollno;
		   //Descending Order by Roll No
		   return obj2.rollno-obj1.rollno;
	   }  
   };
   
   public static Comparator<Student_UsingComparator> compareStuAge = new Comparator<Student_UsingComparator>(){

	@Override
	public int compare(Student_UsingComparator o1, Student_UsingComparator o2) {
		//Ascending order by age
		return o1.studentage-o2.studentage;
	}
   };
   
   

    @Override
    public String toString() {
        return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
    }
    
	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getStudentage() {
		return studentage;
	}

	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}
}