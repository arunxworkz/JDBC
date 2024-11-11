package com.xworkz.databridge.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Updating {

	public static void main(String[] args) {
		
		int totalValues = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String dbUrl = "jdbc:mysql://localhost:3306/products";
		String dbUserName = "root";
		String dbPassword = "7483079907";
		
		try {
			
			//Connect conneciton
			Connection connect = null; 
			
			//get connection
			connect = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
			System.out.println("Connection established");
			
			//insert query
			String updateQuery1 = "update  producttable set producttablename = 'Pencil' where id = 1";
			String updateQuery2 = "update  producttable set producttablename = 'Laptops' where id = 2";
			String updateQuery3 = "update  producttable set producttablename = 'Washing Machines' where id = 3";
			String updateQuery4 = "update  producttable set producttablename = 'Accessories' where id = 4";
			String updateQuery5 = "update  producttable set producttablename = 'Makeup' where id = 5";
			String updateQuery6 = "update  producttable set producttablename = 'Tires' where id = 6";
			String updateQuery7 = "update  producttable set producttablename = 'Beds' where id = 7";
			String updateQuery8 = "update  producttable set producttablename = 'Snacks' where id = 8";
			String updateQuery9 = "update  producttable set producttablename = 'Video Games' where id = 9";
			String updateQuery10 = "update  producttable set producttablename = 'Bicycles' where id = 10";
			
			String[] queryArray = {updateQuery5, updateQuery6, updateQuery7, updateQuery8, 
					updateQuery9, updateQuery10};
			
			
			//Stattement to create the take the query	
			Statement statement = connect.createStatement();
			
			for(String query:queryArray) {
				int values = statement.executeUpdate(query);
				totalValues += values;
			}	
			if(totalValues > 0) {
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
