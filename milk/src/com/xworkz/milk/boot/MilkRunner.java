package com.xworkz.milk.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MilkRunner {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String userName = "root";
		String password = "7483079907";
		String insertQuery = "insert into milk_table values(3,'tea','20rs')";
		String updateQuery = "update milk_table set milkProductType ='GreenTea' where id=3 ";
		String deleteQuery = "Delete from milk_table  where id=2";

		try (Connection connection = DriverManager.getConnection(url, userName, password)) {

			Statement statement = connection.createStatement();
			int result = statement.executeUpdate(deleteQuery);
			if (result > 0) {
				System.out.println("this is saved");

			} else {
				System.out.println("this is not saved");
			}

		} catch (SQLException e) {
			// TODO: handle exception
		}

	}

}
