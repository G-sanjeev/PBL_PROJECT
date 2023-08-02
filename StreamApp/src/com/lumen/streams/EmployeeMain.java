package com.lumen.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class EmployeeMain {
	
	

	public static void main(String[] args) {
		List<Employee> employeeList= Arrays.asList(new Employee("Ram","Hyderabad",101),
				new Employee("Ankush","Delhi",102),
				new Employee("Bravo","Goa",103),
				new Employee("Karry","kerla",104),
				new Employee("Don","Madhyapradesh",105));
		
		
		
		//case 1
		employeeList.forEach(System.out::println);
		
		System.out.println("printing bassed on the city");
		List<Employee> employeeResult=employeeList.stream()
					.filter(str->str.getCity().equals("Hyderabad"))
					.collect(Collectors.toList());
		employeeResult.forEach(System.out::println);
		System.out.println("enter using sorted lambda");
		employeeList.stream()	
					.sorted((o1,o2)->o1.getCity().compareTo(o2.getCity()))
					.forEach(str->System.out.println(str));
		
//		Integer id=102;
		
		// employee name by employee id
		
	String result1 = employeeList.stream()
			.filter(emp-> emp.getEmployeeId()==(102))
			.map(Employee::getName)
		.findFirst()
			.orElseThrow(()-> new RuntimeException("the emloyee not exists with this id"));	
	System.out.println(result1);
		String result = employeeList.stream()
				.filter(name->name.getName().startsWith("K"))
				.map(Employee::getName)
				.findFirst()
				.orElse("not found");
		System.out.println(result);
		
	}

	

}
