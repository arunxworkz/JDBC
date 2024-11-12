package com.xxworkx.customerdetails.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Read {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver installed");
		}catch(ClassNotFoundException e) {
			System.err.println("Driver not installed");
			e.printStackTrace();
		}
		
		String dbUrl = "jdbc:mysql://localhost:3306/customerdetails";
		String dbUserName = "root";
		String dbPassword = "7483079907";
		
		String read = "select * from details";
		
		try {
			Connection connection = null;
			connection = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
			System.out.println("Connection established");
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(read);
			
			while(resultSet.next()) {
				System.out.println("The details are: "+resultSet.getString("name"));
			}
			
		}catch(SQLException e) {
			System.err.println("Connetion not established");
			e.printStackTrace();
		}
	}
}
