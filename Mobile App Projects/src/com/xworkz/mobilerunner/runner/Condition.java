package com.xworkz.mobilerunner.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Condition {

	public static void main(String[] args) {
		try {

			Connection connection = null;

			connection = DriverManager.getConnection(EnumConnection.URL.getValue(), EnumConnection.USERNAME.getValue(),
					EnumConnection.PASSWORD.getValue());

			Statement statement = connection.createStatement();

			String query = "select operatinsystem from mobiledetails where processor = 'A15 Bionic'";
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				System.out.println(resultSet.getString("operatinsystem"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}


	}


