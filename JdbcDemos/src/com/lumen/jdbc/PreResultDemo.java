package com.lumen.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreResultDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/mysql";
		String username = "root";
		String password = "admin@123";
		String sql = "select * from newmovie where language=?";
		ResultSet finalResultSet = null;
//		String query = "insert into employee values('sham',102,'Hyderabad',20000)";
		try (Connection connection = DriverManager.getConnection(url, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet rs = preparedStatement.executeQuery()){
			preparedStatement.setString(1, "Telugu");
			finalResultSet = rs;
			while(finalResultSet.next()) {
			String name = rs.getString("moviename");
			int movieId = rs.getInt("movieId");
			String genre =rs.getString("genre");
			String language = rs.getString("language");

			System.out.println(name +"\t"+movieId+"\t"+genre+"\t"+language);}
//			System.out.println("table created:"+result);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
