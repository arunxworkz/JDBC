package com.xworkz.vehicledetails.runner;


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
			String query = "select year from vehicle where ownername = 'James White' and trrasmission = 'Automatic'";
			ResultSet restSet = statement.executeQuery(query);
			while(restSet.next()) {
				System.out.println(restSet.getString("year"));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
