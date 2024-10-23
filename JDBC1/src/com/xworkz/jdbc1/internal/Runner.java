package com.xworkz.jdbc1.internal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Runner {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		// String url = "jdbc:mysql:/localhost:3306//trains"; trains database doesnot
		// exists and sysntax error
		String url = "jdbc:mysql://localhost:3306/irctc";
		String userName = "root";
		// long password = 7483079907l; -this can not be done
		// because the getConnection method will only take Stirng aruguments
		String password = "7483079907";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("Database is connected");
		} catch (SQLException e) {
			System.out.println("Failed to connect Database");
			e.printStackTrace();
		}

	}

}
