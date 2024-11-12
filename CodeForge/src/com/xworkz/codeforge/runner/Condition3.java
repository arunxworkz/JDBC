package com.xworkz.codeforge.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Condition3 {

	public static void main(String[] args) {
		try {
			
			Connection connection = null;
			
			connection = DriverManager.getConnection(EnumConnection.URL.getValue(), EnumConnection.USERNAME.getValue(), EnumConnection.PASSWORD.getValue());
			
			Statement statement = connection.createStatement();
			
			String query = "select event_type from eventdetails where sponsor= 'SoundWave' and location = 'New York, NY'";
			ResultSet resultSet = statement.executeQuery(query);
			while(resultSet.next()) {
				System.out.println(resultSet.getString("event_type"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}


	}


