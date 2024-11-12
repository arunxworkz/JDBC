package com.xxworkx.customerdetails.runner;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class Class1 {
	public static void main(String args[]) {
		
		String query = "select name from details where email = 'shashank@gmail.com' and city = 'Kalsa'";
		
		try {
			
			Connection connection = null;
			connection = DriverManager.getConnection(EnumConnection.URL.getValue(), EnumConnection.USERNAME.getValue(), EnumConnection.PASSWORD.getValue());
			
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery(query);
			
			while(resultSet.next()) {
				System.out.println("data from table ==" + resultSet.getString("name"));
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
