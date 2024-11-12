package com.xxworkx.customerdetails.runner;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class Class3 {
	public static void main(String args[]) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		String query = "Select email from details where city = 'Chitradurga' and phno = 'product'";
		
		try {
			
			Connection connection = null;
			connection = DriverManager.getConnection(EnumConnection.URL.getValue(), EnumConnection.USERNAME.getValue(), EnumConnection.PASSWORD.getValue());
			
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery(query);
			
			while(resultSet.next()) {
				System.out.println("email is table ==" + resultSet.getString("email"));
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
