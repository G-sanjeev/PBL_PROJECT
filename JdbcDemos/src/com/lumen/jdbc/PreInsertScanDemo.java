package com.lumen.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class PreInsertScanDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/mysql";
		String username = "root";
		String password = "admin@123";
		String sql = "insert into newmovie values(?,?,?,?)";
		
//		String query = "insert into employee values('sham',102,'Hyderabad',20000)";
		try (Connection connection = DriverManager.getConnection(url, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				Scanner scanner = new Scanner(System.in)){
			for(int i=0;i<1;i++) {
				System.out.println("enter the movie name:");
				String name = scanner.next();
				System.out.println("enter movie id");
				int movieId = scanner.nextInt();
				System.out.println("enter the movie genre");
				String genre = scanner.next();
				System.out.println("enter the movie language");
				String lang = scanner.next();
				preparedStatement.setString(1,name);
				preparedStatement.setInt(2, movieId);
				preparedStatement.setString(3, genre);
				preparedStatement.setString(4, lang);
				
			}
			boolean result = preparedStatement.execute();
			System.out.println("table created:"+result);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
