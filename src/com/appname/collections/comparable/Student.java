package com.appname.collections.comparable;

import java.util.Comparator;

public class Student implements Comparable<Student> {
	//public class Student {
    private String studentname;
    private int rollno;
    private int studentage;

    public Student(int rollno, String studentname, int studentage) {
        this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
    }
  
   @Override
    public int compareTo(Student comparestu) {
       // int compareage=((Student)comparestu).getStudentage();
        int compareage=comparestu.getStudentage();
        // For Ascending order
       // return this.studentage-compareage;

         //For Descending order do like this 
        return compareage-this.studentage;
    }
   
   public static Comparator<Student> compareStudRollNo = new Comparator<Student>(){
	   public int compare(Student obj1, Student obj2){
		   return obj1.rollno-obj2.rollno;
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