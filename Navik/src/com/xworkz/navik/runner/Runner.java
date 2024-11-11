package com.xworkz.navik.runner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class Runner {
	
	static String inserting(){
		return "insert into application (applicationname, company) values('Inshot', 'InShot Inc')";
	}
	
	static String deleting() {
		return "delete from application where id between 8 and 15";
	}

	static String updating() {
		 return "update application set company = 'Entertinment Platform' where id = 5";
	}
	public static void main(String[] args) {
		
		//Install the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver installed");
		}catch(ClassNotFoundException e) {
			System.err.println("Driver not installed");
			e.printStackTrace();
		}
		
		//Details for database connection
		String dburl = "jdbc:mysql://localhost:3306/taks";
		String dbName = "root";
		String dbPassword = "7483079907";
		
		//Connection for database
		Connection connection = null;
		
		//DriverManager for connection
		try {
			connection = DriverManager.getConnection(dburl, dbName, dbPassword);
			System.out.println("Conection established");
			
			//Statement class for passing the data into database
			PreparedStatement preparedStatement = null;
			
			//insert queries
			String insertQuery = "insert into application (applicationname, company) values('Myntra', 'Flipkart'),"
					+ "('PlayStore', 'Google'), ('TrueCaller', 'True Software Scandinavia AB'), ('Prime Video', 'Amazon'), "
					+ "('Netflix', 'Vanguard Group and BlackRock'), ('Whatsapp', 'Meta'), ('MyJio', 'JIO'), ('DigiLocker', 'Ministry of Electronics and IT'),"
					+ "('PhonePay', 'WallMart'), ('SanpChat', 'Snap Inc'), ('Where is myTrain', 'Google'), ('IRCTC', 'Ministry of Railways'),"
					+ "('VLC', 'VideoLAN'), ('Ola', 'ANI Technologies Pvt Ltd'), ('Candy Crush', 'King Digital Entertainment'),"
					+ "('Zepto', 'KiranaKart Technologies Private Limited'), ('TATA 1mg', 'TATA'), ('SSBCrack', 'Pankaj Singh Negi'),"
					+ "('BlinkIT', 'Zomato'), ('SonyLIV', 'Sony'), ('SanpSeed', 'Google'), ('MXPlayer', 'Amazon'), ('Udemy', 'Udemy.Inc')";
			
			
			//deleting
			//String delete = "delete from application where id = 1";
					
			
			preparedStatement = connection.prepareStatement(updating());
			
			//statement will retur int value
			int value = preparedStatement.executeUpdate();
			
			//Confirm the data is saved or not
			if(value > 0) {
				System.out.println("Data is saved");
			}else {
				System.err.println("Data is not saved");
			}
			
		}catch(SQLException e) {
			System.err.println("Connection not established");
			e.printStackTrace();
		}
		
	}

}
