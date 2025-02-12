package com.appname.streamapi;

public class StudentPojo {
	
	private String name;

	private int rollNumber;
	private int marks;
	private int age;
	
	
	StudentPojo(String name, int rollNumber, int marks, int age){
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "StudentPojo [name=" + name + ", rollNumber=" + rollNumber + ", marks=" + marks + ", age=" + age + "]";
	}

	
	
	
	

}
