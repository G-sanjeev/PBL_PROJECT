package com.lumen.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreUpdateDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/mysql";
		String username = "root";
		String password = "admin@123";
		String sql = "update newmovie set language=? where movieId=?";
		
//		String query = "insert into employee values('sham',102,'Hyderabad',20000)";
		try (Connection connection = DriverManager.getConnection(url, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(sql);){
			preparedStatement.setString(1,"Telugu");
			preparedStatement.setInt(2,101);
			
			preparedStatement.execute();
//			System.out.println("table created:"+result);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
