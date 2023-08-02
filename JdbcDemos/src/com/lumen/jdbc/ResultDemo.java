package com.lumen.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class ResultDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/mysql";
		String username = "root";
		String password = "admin@123";
		String sql= "select * from employee";
		boolean result;
		try (Connection connection = DriverManager.getConnection(url, username, password);
				Statement statement = connection.createStatement();
				ResultSet rs = statement.executeQuery(sql)) {
			while(rs.next()) {
				String employeename= rs.getString("name");
				int employeeId = rs.getInt("employeeId");
				String place = rs.getString("city");
				double salary= rs.getDouble("salary");
				System.out.println(employeename+"\t"+employeeId+"\t"+place+"\t"+salary);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
