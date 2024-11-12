package com.xworkz.vehicledetails.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insertion {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver installed");
		}catch(ClassNotFoundException e) {
			System.err.println("Driver not installed");
			e.printStackTrace();
		}
		

		

		String insertQuery = "insert into vehicle(id, make, model, year, ownername, vehiclecol, color, enginetype, trrasmission, furltype, mileage)"
				+ "    values(1, 'Toyota', 'Corolla', '2020', 'John Doe', 'Sedan', 'Blue', 'V4', 'Automatic', 'Gasoline', '15000'),"
				+ "    (2, 'Ford', 'Mustang', '2019', 'Jane Smith', 'Coupe', 'Red', 'V6', 'Manual', 'Gasoline', '22000'),"
				+ "    (3, 'Tesla', 'Model S', '2021', 'Alice Johnson', 'Sedan', 'White', 'Electric', 'Automatic', 'Electric', '12000'),"
				+ "    (4, 'Honda', 'Civic', '2018', 'Bob Brown', 'Hatchback', 'Black', 'V4', 'Automatic', 'Gasoline', '30000'),"
				+ "    (5, 'Chevrolet', 'Impala', '2017', 'Charlie Wilson', 'Sedan', 'Silver', 'V6', 'Automatic', 'Gasoline', '45000'),"
				+ "    (6, 'BMW', 'X5', '2020', 'Megan Clark', 'SUV', 'Gray', 'V6', 'Automatic', 'Diesel', '25000'),"
				+ "    (7, 'Audi', 'A4', '2019', 'Emma Thomas', 'Sedan', 'Black', 'V4', 'Automatic', 'Gasoline', '18000'),"
				+ "    (8, 'Mercedes', 'C-Class', '2021', 'Lucas Brown', 'Sedan', 'White', 'V6', 'Automatic', 'Gasoline', '10000'),"
				+ "    (9, 'Kia', 'Optima', '2016', 'Olivia Taylor', 'Sedan', 'Blue', 'V4', 'Manual', 'Gasoline', '60000'),"
				+ "    (10, 'Hyundai', 'Tucson', '2018', 'James White', 'SUV', 'Green', 'V4', 'Automatic', 'Diesel', '35000'),"
				+ "    (11, 'Mazda', 'CX-5', '2021', 'Daniel Garcia', 'SUV', 'Red', 'V4', 'Automatic', 'Gasoline', '5000'),"
				+ "    (12, 'Volkswagen', 'Jetta', '2017', 'Mia Lopez', 'Sedan', 'Gray', 'V4', 'Manual', 'Gasoline', '52000'),"
				+ "    (13, 'Subaru', 'Outback', '2019', 'Chris Martinez', 'Wagon', 'White', 'V6', 'Automatic', 'Gasoline', '30000'),"
				+ "    (14, 'Nissan', 'Altima', '2018', 'Sophia Hernandez', 'Sedan', 'Black', 'V4', 'Automatic', 'Gasoline', '40000'),"
				+ "    (15, 'Jeep', 'Wrangler', '2020', 'Ethan Hall', 'SUV', 'Green', 'V6', 'Manual', 'Gasoline', '12000'),"
				+ "    (16, 'Toyota', 'Camry', '2015', 'Liam Lee', 'Sedan', 'Silver', 'V4', 'Automatic', 'Gasoline', '78000'),"
				+ "    (17, 'Ford', 'F-150', '2021', 'Noah Scott', 'Truck', 'Blue', 'V8', 'Automatic', 'Gasoline', '5000'),"
				+ "    (18, 'Chevrolet', 'Tahoe', '2019', 'Ava Adams', 'SUV', 'Black', 'V8', 'Automatic', 'Gasoline', '25000'),"
				+ "    (19, 'Honda', 'Accord', '2016', 'Isabella Perez', 'Sedan', 'Red', 'V4', 'Manual', 'Gasoline', '69000'),"
				+ "    (20, 'Tesla', 'Model 3', '2022', 'Mason Evans', 'Sedan', 'White', 'Electric', 'Automatic', 'Electric', '3000')";
		
		try {
			Connection connection = null;
			System.out.println("Connection established");
			connection = DriverManager.getConnection(EnumConnection.URL.getValue(), EnumConnection.USERNAME.getValue(),EnumConnection.PASSWORD.getValue());
			
			Statement statement = connection.createStatement();
			int value = statement.executeUpdate(insertQuery);
			if(value > 0) {
				System.out.println("Data saved");
			}else {
				System.err.println("Not saved");
			}
		}catch(SQLException e) {
			System.err.println("Connetion not established");
			e.printStackTrace();
		}

	}

}
