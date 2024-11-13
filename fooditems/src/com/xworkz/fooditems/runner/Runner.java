package com.xworkz.fooditems.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.fooditems.EnumConnection.EnumConnetcion;



public class Runner {

	public static void main(String[] args) {
		
		//Load and install the Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//Create Connection
		try {
			Connection  connection = null;
			connection = DriverManager.getConnection(EnumConnetcion.URL.getValue(), EnumConnetcion.USERNAME.getValue(), EnumConnetcion.PASSWORD.getValue());
			
			//Create a Statement
			PreparedStatement prest1 = null;
			prest1 = connection.prepareStatement("insert into food(id, foodname, foodprice) values(?, ?, ?)");
			
			prest1.setString(1, "1");
			prest1.setString(2, "Idli");
			prest1.setString(3, "50");
			
			
			PreparedStatement prest2 = null;
			prest2 = connection.prepareStatement("insert into food(id, foodname, foodprice) values(?, ?, ?)");
			
			prest2.setString(1, "2");
			prest2.setString(2, "Masale Dose");
			prest2.setString(3, "60");
			
			
			PreparedStatement prest3 = connection.prepareStatement("insert into food(id, foodname, foodprice) values(?, ?, ?)");
			prest3.setString(1, "3");
			prest3.setString(2, "Benne Dose");
			prest3.setString(3, "Eerulli Dose");

			PreparedStatement prest4 = connection.prepareStatement("insert into food(id, foodname, foodprice) values(?, ?, ?)");
			prest4.setString(1, "4");
			prest4.setString(2, "Benne Malse Dose");
			prest4.setString(3, "100");
			
			PreparedStatement prest5 = connection.prepareStatement("insert into food(id, foodname, foodprice) values(?, ?, ?)");
			prest5.setString(1, "5");
			prest5.setString(2, "Palin Dose");
			prest5.setString(3, "30");
			
			PreparedStatement prest6 = connection.prepareStatement("insert into food(id, foodname, foodprice) values(?, ?, ?)");
			prest6.setString(1, "6");
			prest6.setString(2, "Set Dose");
			prest6.setString(3, "45");
			
			PreparedStatement prest7 = connection.prepareStatement("insert into food(id, foodname, foodprice) values(?, ?, ?)");
			prest7.setString(1, "7");
			prest7.setString(2, "Avrebele Dose");
			prest7.setString(3, "50");
			
			PreparedStatement prest8 = connection.prepareStatement("insert into food(id, foodname, foodprice) values(?, ?, ?)");
			prest8.setString(1, "8");
			prest8.setString(2, "Bisibelebath");
			prest8.setString(3, "60");
			
			PreparedStatement prest9 = connection.prepareStatement("insert into food(id, foodname, foodprice) values(?, ?, ?)");
			prest9.setString(1, "9");
			prest9.setString(2, "Kara Pongal");
			prest9.setString(3, "40");
			
			PreparedStatement prest10 = connection.prepareStatement("insert into food(id, foodname, foodprice) values(?, ?, ?)");
			prest10.setString(1, "10");
			prest10.setString(2, "Palav");
			prest10.setString(3, "30");
			
			PreparedStatement prest11 = connection.prepareStatement("insert into food(id, foodname, foodprice) values(?, ?, ?)");
			prest11.setString(1, "11");
			prest11.setString(2, "Pani puri");
			prest11.setString(3, "35");
			
			PreparedStatement prest12 = connection.prepareStatement("insert into food(id, foodname, foodprice) values(?, ?, ?)");
			prest12.setString(1, "12");
			prest12.setString(2, "Paddu");
			prest12.setString(3, "60");
			
			PreparedStatement prest13 = connection.prepareStatement("insert into food(id, foodname, foodprice) values(?, ?, ?)");
			prest13.setString(1, "13");
			prest13.setString(2, "Kesribath");
			prest13.setString(3, "40");
			
			PreparedStatement prest14 = connection.prepareStatement("insert into food(id, foodname, foodprice) values(?, ?, ?)");
			prest14.setString(1, "14");
			prest14.setString(2, "Totomato Bath");
			prest14.setString(3, "30");
			
			PreparedStatement prest15 = connection.prepareStatement("insert into food(id, foodname, foodprice) values(?, ?, ?)");
			prest15.setString(1, "15");
			prest15.setString(2, "Puri");
			prest15.setString(3, "60");
			
			//Execute queries
			int values1 = prest1.executeUpdate();
			int values2 = prest2.executeUpdate();
			int values3 = prest3.executeUpdate();
			int values4 = prest4.executeUpdate();
			int value5 = prest5.executeUpdate();
			int value6 = prest6.executeUpdate();
			int value7 = prest7.executeUpdate();
			int value8 = prest8.executeUpdate();
			int value9 = prest9.executeUpdate();
			int value10 = prest10.executeUpdate();
			int value11 = prest11.executeUpdate();
			int value12 = prest12.executeUpdate();
			int value13 = prest13.executeUpdate();
			int value14 = prest14.executeUpdate();
			int value15 = prest15.executeUpdate();
			
			
			
			
			int[] values = {values1, values2, values3, values4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15};
			for(int i: values) {
				if(i > 0) {
					System.out.println("Data is saved");
				}else {
					System.out.println("Data is not saved");
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
					
	}

}
