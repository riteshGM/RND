package com.appname.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Student{
	String name;
	int rollNo;
	String section;
	
	Student(String name,int rollNo,String section){
		this.name = name;
		this.rollNo = rollNo;
		this.section = section;
	}
}

public class FlatMapSample {
	
	public static void main(String args[]) {
		List<Student> list1 = Arrays.asList(
				new Student("Ritesh",1,"A"),
				new Student("Jai",2,"B"),
				new Student("Girish",3,"A")
				);
		
		List<Student> list2 = Arrays.asList(
				new Student("Hunny",4,"A"),
				new Student("Sandeep",5,"B"),
				new Student("Pankaj",6,"A")
				);
		
		List<List<Student>> inputList = Arrays.asList(list1,list2);
		
		List<String> outputList = 
				
				inputList.stream().flatMap(eachList -> eachList.stream())
						.filter(eachStu -> eachStu.section=="B")
						.map(eachStu -> eachStu.name)
						.collect(Collectors.toList());
		
		System.out.println(outputList);
		
	}
	
	
	

}
