package com.xworkz.bhaji.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BhajiRunner {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/jdbc";
		String userName = "root";
		String password = "7483079907";
		String insertQuery = "insert into bhaji_table values (6,'200rs','dal')";
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url, userName, password);

			Statement statement = connection.createStatement();
			int value = statement.executeUpdate(insertQuery);
			if (value > 0) {
				System.out.println("thiis is saved");
			} else {
				System.err.println("this is not saved");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
