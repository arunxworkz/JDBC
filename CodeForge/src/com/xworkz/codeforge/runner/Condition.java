package com.xworkz.codeforge.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.codeforge.runner.EnumConnection;

public class Condition {

	public static void main(String[] args) {
try {
			
			Connection connection = null;
			
			connection = DriverManager.getConnection(EnumConnection.URL.getValue(), EnumConnection.USERNAME.getValue(), EnumConnection.PASSWORD.getValue());
			
			Statement statement = connection.createStatement();
			
			String query = "select * from eventdetails";
			ResultSet resultSet = statement.executeQuery(query);
			while(resultSet.next()) {
				System.out.println(resultSet.getString("event_id") + " "+resultSet.getString("event_name")
				+" "+resultSet.getString("location")+" "+resultSet.getString("organizer")+" "+resultSet.getString("event_type")
				+" "+resultSet.getString("attendees_count")+" "+resultSet.getString("sponsor")+" "+resultSet.getString("ticket_price")
				+" "+resultSet.getString("duration_hours"));

				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	}


