package com.xworkz.myntra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Runner {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.getStackTrace();
		}
		
		
		String url = "jdbc:mysql://localhost:3306/bmtc";
		String name = "root";
		String password = "7483079907";
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(url, name, password);
			System.out.println("Connection established");
		} catch (SQLException e) {
			System.out.println("Connection not extablished");
			e.printStackTrace();
		}
		
		
	}

}
