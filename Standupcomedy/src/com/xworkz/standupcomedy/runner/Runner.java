package com.xworkz.standupcomedy.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

public class Runner {

	public static void main(String[] args) {
		
		StandUpComedyDTO standUpComedyDTO = new StandUpComedyDTO(1, "Rajshekar", "Hydrbad", "2000");
		StandUpComedyDTO standUpComedyDTO1 = new StandUpComedyDTO(2, "Trevor noha", "US", "1500$");
		StandUpComedyDTO standUpComedyDTO2 = new StandUpComedyDTO(3, "Ramaya", "Pune", "600");
		try {
			Connection connection = null;
			connection = DriverManager.getConnection(DBConnection.URL.getValue(), DBConnection.USERNAME.getValue(), DBConnection.PASSWORD.getValue());
			
			PreparedStatement preparedStatement = null;
			preparedStatement = connection.prepareStatement("insert into  comediandetails(id, name, location, price) values(?, ?, ?, ?)");
			
			preparedStatement.setInt(1, 1);
			preparedStatement.setString(2, standUpComedyDTO.getName());
			preparedStatement.setString(3, standUpComedyDTO.getLocation());
			preparedStatement.setString(4, standUpComedyDTO.getPrice());
			
			preparedStatement.setInt(1, 2);
			preparedStatement.setString(2, standUpComedyDTO1.getName());
			preparedStatement.setString(3, standUpComedyDTO1.getLocation());
			preparedStatement.setString(4, standUpComedyDTO1.getPrice());
			preparedStatement.addBatch();
			
			preparedStatement.setInt(1, 3);
			preparedStatement.setString(2, standUpComedyDTO2.getName());
			preparedStatement.setString(3, standUpComedyDTO.getName());
			preparedStatement.setString(4, standUpComedyDTO2.getPrice());
			preparedStatement.addBatch();
			
			
			int[] value = preparedStatement.executeBatch();
			if(value.length > 0) {
				System.out.println("Data is saved");
			}else {
				System.out.println("Data is not saved");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
