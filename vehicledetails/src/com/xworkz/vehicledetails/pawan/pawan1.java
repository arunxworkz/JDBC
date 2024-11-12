package com.xworkz.vehicledetails.pawan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.vehicledetails.runner.EnumConnection;

public class pawan1 {

	public static void main(String[] args) {
		try {
			Connection connection = null;
			connection = DriverManager.getConnection(EnumConnection.URL.getValue(), EnumConnection.USERNAME.getValue(), EnumConnection.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			String query = "select make from vehicle where model = '2022'";
			ResultSet restSet = statement.executeQuery(query);
			while(restSet.next()) {
				System.out.println(restSet.getString("make"));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
