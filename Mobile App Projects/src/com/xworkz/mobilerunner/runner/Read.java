package com.xworkz.mobilerunner.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.mobilerunner.runner.EnumConnection;

public class Read {

	public static void main(String[] args) {
		String query = "select * from mobiledetails";
		try {
			Connection connection = null;
			connection = DriverManager.getConnection(EnumConnection.URL.getValue(), EnumConnection.USERNAME.getValue(), EnumConnection.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery(query);
			while(resultSet.next()) {
				System.out.println(resultSet.getString("id") + " "+resultSet.getString("modelname")
				+" "+resultSet.getString("brand")+" "+resultSet.getString("operatinsystem")+" "+resultSet.getString("screensize")
				+" "+resultSet.getString("ram")+" "+resultSet.getString("storagecapacity")+" "+resultSet.getString("processor")
				+" "+resultSet.getString("price")+" "+resultSet.getString("batterycapacity"));

				
			}
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
