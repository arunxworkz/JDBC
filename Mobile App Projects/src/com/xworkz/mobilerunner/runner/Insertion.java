package com.xworkz.mobilerunner.runner;

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
		

		

		String insertQuery = "INSERT INTO mobiledetails (id, modelname, brand, operatinsystem, screensize, ram, storagecapacity, processor, price, batterycapacity)"
				+ "VALUES (1, 'iPhone 14', 'Apple', 'iOS', '6.1', '6GB', '128GB', 'A15 Bionic', '799', '3279mAh'),"
				+ "(2, 'Galaxy S23', 'Samsung', 'Android', '6.1', '8GB', '128GB', 'Snapdragon 8 Gen 1', '999', '3900mAh'),"
				+ "(3, 'Pixel 7', 'Google', 'Android', '6.3', '8GB', '128GB', 'Google Tensor G2', '899', '4355mAh'),"
				+ "(4, 'OnePlus 11', 'OnePlus', 'Android', '6.7', '16GB', '256GB', 'Snapdragon 8 Gen 2', '699', '5000mAh'),"
				+ "(5, 'Xperia 5 IV', 'Sony', 'Android', '6.1', '8GB', '128GB', 'Snapdragon 8 Gen 1', '999', '5000mAh'),"
				+ "(6, 'Moto G Power', 'Motorola', 'Android', '6.5', '4GB', '64GB', 'MediaTek Helio G37', '249', '5000mAh'),"
				+ "(7, 'Nokia G50', 'Nokia', 'Android', '6.82', '4GB', '128GB', 'Snapdragon 480', '299', '5000mAh'),"
				+ "(8, 'Redmi Note 12', 'Xiaomi', 'Android', '6.67', '6GB', '128GB', 'Snapdragon 680', '199', '5000mAh'),"
				+ "(9, 'Galaxy Z Fold4', 'Samsung', 'Android', '7.6', '12GB', '512GB', 'Snapdragon 8+ Gen 1', '1799', '4400mAh'),"
				+ "(10, 'iPhone SE (2022)', 'Apple', 'iOS', '4.7', '4GB', '64GB', 'A15 Bionic', '429', '2018mAh'),"
				+ "(11, 'Realme GT Neo 3', 'Realme', 'Android', '6.7', '8GB', '256GB', 'Dimensity 8100', '649', '4500mAh'),"
				+ "(12, 'Huawei P50 Pro', 'Huawei', 'HarmonyOS', '6.', '8GB', '256GB', 'Kirin 9000', '1199', '4360mAh'),"
				+ "(13, 'Oppo Reno8 Pro', 'Oppo', 'Android', '6.7', '8GB', '256GB', 'Dimensity 8100', '749', '4500mAh'),"
				+ "(14, 'Galaxy A53', 'Samsung', 'Android', '6.5', '6GB', '128GB', 'Exynos 1280', '449', '5000mAh'),"
				+ "(15, 'Vivo V25', 'Vivo', 'Android', '6.44', '8GB', '128GB', 'MediaTek Dimensity 900', '499', '4500mAh'),"
				+ "(16, 'Zenfone 9', 'Asus', 'Android', '5.9', '8GB', '256GB', 'Snapdragon 8+ Gen 1', '699', '4300mAh'),"
				+ "(17, 'iPhone 14 Pro', 'Apple', 'iOS', '6.1', '6GB', '256GB', 'A16 Bionic', '999', '3200mAh'),"
				+ "(18, 'Galaxy S22 Ultra', 'Samsung', 'Android', '6.8', '12GB', '512GB', 'Snapdragon 8 Gen 1', '1199', '5000mAh'),"
				+ "(19, 'Nothing Phone 1', 'Nothing', 'Android', '6.55', '8GB', '128GB', 'Snapdragon 778G+', '399', '4500mAh'),"
				+ "(20, 'LG Velvet', 'LG', 'Android', '6.8', '6GB', '128GB', 'Snapdragon 765G', '599', '4300mAh')";
		
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
