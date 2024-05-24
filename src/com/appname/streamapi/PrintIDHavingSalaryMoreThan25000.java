package com.appname.streamapi;


import java.util.Arrays;
import java.util.List;

/**
 * Find Employees having Salary Greater than 25000 and print Employee ID of such Employees
 * @author admin
 *
 */

public class PrintIDHavingSalaryMoreThan25000 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<EmployeePojo> employeeList = Arrays.asList(
				new EmployeePojo(1,"Ritesh",1200),
				new EmployeePojo(2,"Kumar",12000),
				new EmployeePojo(12121,"Prasad",120000),
				new EmployeePojo(32121,"Manish",1200000)
				);
		
		employeeList.stream().filter(eachEmp -> eachEmp.salary > 25000)
		.forEach(eachEmp -> System.out.println(eachEmp.id +" with Name "+ eachEmp.name.toUpperCase() ));
		

	}

}
