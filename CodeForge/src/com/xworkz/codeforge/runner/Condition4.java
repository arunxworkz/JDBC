package com.xworkz.codeforge.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Condition4 {

	public static void main(String[] args) {
try {
			
			Connection connection = null;
			
			connection = DriverManager.getConnection(EnumConnection.URL.getValue(), EnumConnection.USERNAME.getValue(), EnumConnection.PASSWORD.getValue());
			
			Statement statement = connection.createStatement();
			
			String query = "select event_name from eventdetails where duration_hours=7 and location = 'Fashion Week'";
			ResultSet resultSet = statement.executeQuery(query);
			while(resultSet.next()) {
				System.out.println(resultSet.getString("event_name"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	}


