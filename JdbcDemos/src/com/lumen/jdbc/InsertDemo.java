package com.lumen.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;

public class InsertDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/mysql";
		String username = "root";
		String password = "admin@123";
		
//		String query = "insert into employee values('sham',102,'Hyderabad',20000)";
		int result;
		try (Connection connection = DriverManager.getConnection(url, username, password);
				Statement statement = connection.createStatement();
						Scanner scanner = new Scanner(System.in)) {
			for(int i = 0;i<4;i++) {
				System.out.println("enter the name of the employee name");
				String name = scanner.next();
				System.out.println("enter the employee id");
				int employeeId = scanner.nextInt();
				System.out.println("enter the city");
				String city = scanner.next();
				System.out.println("enter the salary");
				float salary = scanner.nextFloat();
				
				String sql = "insert into employee values('"+name+"',"+employeeId+",'"+city+"',"+salary+")";
				result = statement.executeUpdate(sql);
				System.out.println(result);
				
			}
//			result = statament.execute(query);
//			System.out.println("table created" + result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
