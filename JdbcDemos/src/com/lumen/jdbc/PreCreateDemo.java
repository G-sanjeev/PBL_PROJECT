package com.lumen.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreCreateDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/mysql";
		String username = "root";
		String password = "admin@123";
		String sql = "create table newmovie(moviename varchar(20),movieId int primary key, genre varchar(20),language varchar(20))";
		
//		String query = "insert into employee values('sham',102,'Hyderabad',20000)";
		boolean result;
		try (Connection connection = DriverManager.getConnection(url, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(sql);){
			result = preparedStatement.execute()	;
			System.out.println(result);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
