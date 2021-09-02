package com.cts.hrms.model;

import java.util.ArrayList;
import java.util.Collections;

public class App1 {

	public static void main(String[] args) {
		ArrayList<Employee> employeeList=new ArrayList<>();
		employeeList.add(new Employee(1, "Rama", "Krishna", 123456.0));
		employeeList.add(new Employee(22, "Abdul", "Raheem", 191919.0));
		employeeList.add(new Employee(32, "Rama", "Rajan", 373737.0));
		employeeList.add(new Employee(24, "Suresh", "Krishna", 182736.0));
		employeeList.add(new Employee(53, "Suresh", "Raina", 92929.0));
		employeeList.add(new Employee(36, "Zaheer", "Khan", 161514.0));
		employeeList.add(new Employee(73, "Suresh", "Peters", 123256.0));
		employeeList.add(new Employee(84, "John", "Peters", 22222.0));
		employeeList.add(new Employee(49, "Radha", "Krishna", 232312.0));
		
		Collections.sort(employeeList);
		
		for(Employee e:employeeList)
		{
			System.out.println(e);
		}
	}

}
