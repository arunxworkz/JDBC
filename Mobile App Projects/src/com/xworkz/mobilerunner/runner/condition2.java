package com.xworkz.mobilerunner.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class condition2 {

	public static void main(String[] args) {
		try {

			Connection connection = null;

			connection = DriverManager.getConnection(EnumConnection.URL.getValue(), EnumConnection.USERNAME.getValue(),
					EnumConnection.PASSWORD.getValue());

			Statement statement = connection.createStatement();

			String query = "select brand from mobiledetails where price > 20000 and storagecapacity = '128GB'";
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				System.out.println(resultSet.getString("brand"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	}


