package com.xworkz.vehicledetails.runner;


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
			String query = "select furltype from vehicle where model = '2018' and model = '2016'";
			ResultSet restSet = statement.executeQuery(query);
			while(restSet.next()) {
				System.out.println(restSet.getString("furltype"));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
