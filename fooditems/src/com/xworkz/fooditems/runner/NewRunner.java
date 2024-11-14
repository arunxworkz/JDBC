package com.xworkz.fooditems.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.fooditems.EnumConnection.EnumConnetcion;

public class NewRunner {

	public static void main(String[] args) {
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
			PreparedStatement prest1 = connection.prepareStatement("insert into new_table(id, productname, productprice) values(?, ?, ?)");
			prest1.setString(1, "1");
			prest1.setString(2, "Laptop");
			prest1.setString(3, "50000");

			PreparedStatement prest2 = connection.prepareStatement("insert into new_table(id, productname, productprice) values(?, ?, ?)");
			prest2.setString(1, "2");
			prest2.setString(2, "Smartphone");
			prest2.setString(3, "30000");

			PreparedStatement prest3 = connection.prepareStatement("insert into new_table(id, productname, productprice) values(?, ?, ?)");
			prest3.setString(1, "3");
			prest3.setString(2, "Tablet");
			prest3.setString(3, "20000");

			PreparedStatement prest4 = connection.prepareStatement("insert into food(id, productname, productprice) values(?, ?, ?)");
			prest4.setString(1, "4");
			prest4.setString(2, "Smartwatch");
			prest4.setString(3, "10000");

			PreparedStatement prest5 = connection.prepareStatement("insert into new_table(id, productname, productprice) values(?, ?, ?)");
			prest5.setString(1, "5");
			prest5.setString(2, "Headphones");
			prest5.setString(3, "3000");

			PreparedStatement prest6 = connection.prepareStatement("insert into new_table(id, productname, productprice) values(?, ?, ?)");
			prest6.setString(1, "6");
			prest6.setString(2, "Keyboard");
			prest6.setString(3, "1500");

			PreparedStatement prest7 = connection.prepareStatement("insert into new_table(id, productname, productprice) values(?, ?, ?)");
			prest7.setString(1, "7");
			prest7.setString(2, "Mouse");
			prest7.setString(3, "800");

			PreparedStatement prest8 = connection.prepareStatement("insert into new_table(id, productname, productprice) values(?, ?, ?)");
			prest8.setString(1, "8");
			prest8.setString(2, "Charger");
			prest8.setString(3, "500");

			PreparedStatement prest9 = connection.prepareStatement("insert into new_table(id, productname, productprice) values(?, ?, ?)");
			prest9.setString(1, "9");
			prest9.setString(2, "Power Bank");
			prest9.setString(3, "1200");

			PreparedStatement prest10 = connection.prepareStatement("insert into new_table(id, productname, productprice) values(?, ?, ?)");
			prest10.setString(1, "10");
			prest10.setString(2, "Speaker");
			prest10.setString(3, "2000");

			PreparedStatement prest11 = connection.prepareStatement("insert into new_table(id, productname, productprice) values(?, ?, ?)");
			prest11.setString(1, "11");
			prest11.setString(2, "USB Cable");
			prest11.setString(3, "300");

			PreparedStatement prest12 = connection.prepareStatement("insert into food(id, productname, productprice) values(?, ?, ?)");
			prest12.setString(1, "12");
			prest12.setString(2, "External Hard Drive");
			prest12.setString(3, "4000");

			PreparedStatement prest13 = connection.prepareStatement("insert into new_table(id, productname, productprice) values(?, ?, ?)");
			prest13.setString(1, "13");
			prest13.setString(2, "Router");
			prest13.setString(3, "2500");

			PreparedStatement prest14 = connection.prepareStatement("insert into new_table(id, productname, productprice) values(?, ?, ?)");
			prest14.setString(1, "14");
			prest14.setString(2, "Memory Card");
			prest14.setString(3, "600");

			PreparedStatement prest15 = connection.prepareStatement("insert into new_table(id, productname, productprice) values(?, ?, ?)");
			prest15.setString(1, "15");
			prest15.setString(2, "SSD");
			prest15.setString(3, "5000");

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
