package com.xxworkx.customerdetails.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.Result;

public class Class4 {
	public static void main(String[] args) {
		
		String query = "select email, city where product = 'Sandwich' and name = 'Sachin'";
		try {
			Connection connection = null;
			
			connection = DriverManager.getConnection(EnumConnection.URL.getValue(), EnumConnection.USERNAME.getValue(), EnumConnection.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery(query);
			while(resultSet.next()) {
				System.out.println(resultSet.getString("email")+ " "+resultSet.getString("city"));
			}
			
		}catch(SQLException e) {
			e.fillInStackTrace();
		}
		
	}
}
