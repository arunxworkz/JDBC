package com.xworkz.printstatement.insert1;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.sql.Statement;

public class Runner {

	public static void main(String[] args) {

		// loading and installing the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {

			Connection connection = null;
			// Creating the connection
			connection = DriverManager.getConnection(EnumConnection.URL.getValue(), EnumConnection.USERNAME.getValue(),
					EnumConnection.PASSWORD.getValue());

			// Creating a statement
			PreparedStatement prst = null;

			// Execute Queries
			prst = connection.prepareStatement("insert into bottledetails values(?, ? , ?, ?)");

			prst.setString(1, "15");
			prst.setString(2, "2L");
			prst.setString(3, "Black and White");
			prst.setString(4, "2000");
			
//			prst.setString(1, "3");
//			prst.setString(2, "5L");
//			prst.setString(3, "Sprit");
//			prst.setString(4, "90");

			int value = prst.executeUpdate();

			if (value > 0) {
				System.out.println("Saved");
			} else {
				System.err.println("Data not saved");
			}

			// close the connection
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
