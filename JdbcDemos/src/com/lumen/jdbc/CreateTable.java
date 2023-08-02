package com.lumen.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class CreateTable {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/mysql";
		String username = "root";
		String password = "admin@123";
		String query = "create table employee(name varchar(20),employeeId int primary key,city varchar(20),salary float)";
		boolean result;
		try (Connection connection = DriverManager.getConnection(url, username, password);
				Statement statament = connection.createStatement()) {
			result = statament.execute(query);
			System.out.println("table created" + result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
