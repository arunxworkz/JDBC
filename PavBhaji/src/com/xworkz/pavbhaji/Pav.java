package com.xworkz.pavbhaji;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Pav {

	public static void main(String[] args) {

		// Providing the Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("The Driver is installed");
		} catch (ClassNotFoundException e) {
			System.out.println("Drivre is not installed");
			e.printStackTrace();
		}

		// Credentials for accessing the database
		String url = "jdbc:mysql://localhost:3306/tickets";
		String userNAme = "root";
		String password = "7483079907";

		// Request a connection to database
		Connection connection = null;

		// insert query
		String query = "insert into reservations (serialNumber, customerNAme, mobileNumber) values(5, 'Osama', 4563217896), "
				+ "(6, 'Sachin', '2396587415'), (7, 'Shamanth', '9874563156'), (8, 'Shashank', '6541987325'), (9, 'Deekpa', '7896325415'),"
				+ "(10, 'Chethan', '123695147'), (11, 'Charan', '789513462'), (12, 'Abhishek', '8523697412'), (13, 'Amoga', '7539514568'),"
				+ "(14, 'Omkar', '7891236547'), (15, 'Amith', '3124598761'), (16, 'Harisha', '123987456'), (17, 'Aiswaraya Rai', '7483099064'),"
				+ "(18, 'Ramaya', '749349907'), (19, 'Amita Bacchan', '7493077926'), (20, 'DBOSS(Enri Media)', '7895463201')";

		// Driver manager is responsible for extablishing the connection
		try {
			connection = DriverManager.getConnection(url, userNAme, password);
			System.out.println("The connection is established");

			// Statement is used to create create statements and insert the required query
			// Statement will always return integer value.
			Statement statement = connection.createStatement();
			int value = statement.executeUpdate(query);
			if (value > 0) {
				System.out.println("Saved");
			} else {
				System.out.println("Not saved");
			}
		} catch (SQLException e) {
			System.out.println("The connection is not established");
			e.printStackTrace();
		}

	}

}
