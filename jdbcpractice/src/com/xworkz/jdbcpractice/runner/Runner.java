package com.xworkz.jdbcpractice.runner;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.xworkz.jdbcpractice.dbconnection.DbConnection;

public class Runner {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver installed");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.err.println("Driver not installed");
		}
		
		Connection connection = null;
		try {
			connection = DriverManager.getConnection( DbConnection.DBURL.getValue(), DbConnection.DBUSERNAME.getValue(), DbConnection.DBPASSWORD.getValue());
			
			Statement stat = connection.createStatement();
			String query = "update practicetable set phno = '7483079907' where name = 'Karthik'";
			
			int value = stat.executeUpdate(query);
			if(value > 0) {
				System.out.println("Datat is Updated");
			}else {
				System.out.println("Data is not updated");
			}
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}


}
