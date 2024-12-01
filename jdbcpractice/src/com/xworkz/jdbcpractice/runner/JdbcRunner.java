package com.xworkz.jdbcpractice.runner;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

import com.xworkz.jdbcpractice.dbconnection.DbConnection;

public class JdbcRunner {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Installed");
		}catch(ClassNotFoundException e) {
			System.err.println("Driver Installed");
			e.printStackTrace();
		}
		
		try {
			Connection connection = null;
			connection = DriverManager.getConnection(DbConnection.DBURL.getValue(), DbConnection.DBUSERNAME.getValue(), DbConnection.DBPASSWORD.getValue());
			
			String insert = "insert into practicetable value('Prakash', '9632587412')";
			
			String upDate = "update practicetable set name = 'Praveen' where phno = '7456982314'";
			
			Statement stat = connection.createStatement();
			
			int value1 = stat.executeUpdate(insert);
			if(value1 > 0) {
				System.out.println("Data is saved");
			}else {
				System.err.println("data is not saved");
			}
			
			int value2 = stat.executeUpdate(upDate);
			if(value1 > 0) {
				System.out.println("Data is updated");
			}else {
				System.err.println("data is not updated");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
