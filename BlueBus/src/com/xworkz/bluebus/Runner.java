package com.xworkz.bluebus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Runner {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		String url = "jdbc:mysql://localhost:3306/passangerdetails";
		String name = "root";
		String password = "7483079907";

		String insertQuery = "insert into ticketdetails(passangerId, passangerName, source, destination) values(3, 'John', 'Mumbai', 'Bengaluru'),"
				+ "(4, 'Kiran', 'Chikkamagaluru', 'Haasan')";

		Connection connect = null;

		try {
			connect = DriverManager.getConnection(url, name, password);
			System.out.println("Connection established");

			Statement statement = connect.createStatement();
			int value = statement.executeUpdate(insertQuery);
			System.out.println("Query saved");
		} catch (SQLException e) {
			System.out.println("Connection not established");
			e.printStackTrace();
		}
	}

}
