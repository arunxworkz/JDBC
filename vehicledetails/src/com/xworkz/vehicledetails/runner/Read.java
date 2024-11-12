package com.xworkz.vehicledetails.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Read {

	public static void main(String[] args) {
		
		String query = "select * from vehicle";
		try {
			Connection connection = null;
			connection = DriverManager.getConnection(EnumConnection.URL.getValue(), EnumConnection.USERNAME.getValue(), EnumConnection.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery(query);
			while(resultSet.next()) {
				System.out.println(resultSet.getString("id") + " "+resultSet.getString("make")
				+" "+resultSet.getString("year")+" "+resultSet.getString("ownername")+" "+resultSet.getString("vehiclecol")
				+" "+resultSet.getString("color")+" "+resultSet.getString("enginetype")+" "+resultSet.getString("trrasmission")
				+" "+resultSet.getString("furltype")+" "+resultSet.getString("mileage"));

				
			}
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
