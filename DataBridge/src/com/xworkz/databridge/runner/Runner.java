package com.xworkz.databridge.runner;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class Runner {
	public static void main(String[] args) {
		
		//Check the connection
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver installed");
		}catch(ClassNotFoundException e) {
			System.err.println("Driver not installed");
			e.printStackTrace();
		}
		
		//Details of database connectivity
		String dbUrl = "jdbc:mysql://localhost:3306/products";
		String dbUserName = "root";
		String password = "7483079907";
		
		//DriverManager for connection
		try {
			
			//Connect conneciton
			Connection connect = null; 
			
			//get connection
			connect = DriverManager.getConnection(dbUrl, dbUserName, password);
			System.out.println("Connection established");
			
			//insert query
			String insertQuery = "insert into producttable(id, producttablename, producttabletype) values(1, 'Pen', 'Stationary'),"
					+ "(2, 'Mobile', 'Electronic Device'), (3, 'Refrigerators', 'Home applicences'), (4, 'Clothing', 'Fashion'),"
					+ "(5, 'Skincare', 'Cosmetics'), (6, 'Cars', 'AutoMobiles'), (7, 'Sofas', 'Furniture'), (8, 'Fruits & Vegetables', ' Groceries'),"
					+ "(9, 'Magazines', 'Books and Media'), (10, 'Sports Equipment ', 'Sports and Outdoor'), (11, 'Board Games	', ' Toys and Games'),"
					+ "(12, 'Board Games','Toys and Games'), (13, 'Medical Supplies', 'Health and Wellness'), (14, 'Pet Food', '. Pet Supplies'),"
					+ "(15, 'Printing Supplies ', 'Office Supplies'), (16, 'Building Materials', 'Construction and Hardware'), "
					+ "(17, 'Plants and Seeds', 'Gardening and Landscaping'), (18, 'Baby Clothing', 'Baby and Maternity'),"
					+ "(19, 'Learning Kits', 'Educational and Learning Resources'), (20, 'Suitcases and Luggage Sets', ' Travel and Luggage')";
			
			
			//Stattement to create the take the query	
			Statement statement = connect.createStatement();
			
			int values = statement.executeUpdate(insertQuery);
			if(values > 0) {
				System.out.println("Data is saved");
			}else {
				System.err.println("Data is not saved");
			}
			
		} catch (SQLException e) {
			System.err.println("Connection not established");
			e.printStackTrace();
		}
	}
}
