package com.xworkz.codeforge.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Condition5 {

	public static void main(String[] args) {
try {
			
			Connection connection = null;
			
			connection = DriverManager.getConnection(EnumConnection.URL.getValue(), EnumConnection.USERNAME.getValue(), EnumConnection.PASSWORD.getValue());
			
			Statement statement = connection.createStatement();
			
			String query = "select event_id from eventdetails where duration_hours > 7";
			ResultSet resultSet = statement.executeQuery(query);
			while(resultSet.next()) {
				System.out.println(resultSet.getString("event_id"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	}


