package com.xxworkx.customerdetails.runner;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class Runner {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver installed");
		}catch(ClassNotFoundException e) {
			System.err.println("Driver not installed");
			e.printStackTrace();
		}
		
		String dbUrl = "jdbc:mysql://localhost:3306/customerdetails";
		String dbUserName = "root";
		String dbPassword = "7483079907";
		

		String insertQuery = "insert into details(id, name, email, address, phno, gender, "
				+ "city, dateofbirth, contactmethod, cost, product) "
				+ "values(2, 'Shashank', 'shashank@gmail.com', 'Upparpete road', '9874563214', 'male', 'Kalsa', '2002-01-20','sms', '90', 'Pv Bhaji'),"
				+ "(3, 'Charan', 'charan@gmail.com', 'MG Road', '3579514562', 'male', 'Mysore', '2001-11-15', 'email', '100', 'Samosa'),"
				+ "(4, 'Ajay', 'ajay@gmail.com', 'Brigade Road', '35789514569', 'male', 'Bangalore', '2003-05-25', 'phone', '110', 'Coffee'),"
				+ "(5, 'Shamanth', 'shamanth@gmail.com', 'JP Nagar', '7412589632', 'male', 'Bellary', '2002-03-10', 'sms', '120', 'Tea'),"
				+ "(6, 'Manoj', 'manoj@gmail.com', 'Indiranagar', '368521478', 'male', 'Tumkur', '2001-09-09', 'email', '130', 'Biryani'),"
				+ "(7, 'Amoga', 'amoga@gmail.com', 'Yelahanka', '2583691473', 'male', 'Hubli', '2003-02-18', 'phone', '140', 'Burger'),"
				+ "(8, 'Sachin', 'sachin@gmail.com', 'HSR Layout', '7413698523', 'male', 'Belgaum', '2000-08-28', 'sms', '150', 'Sandwich'),"
				+ "(9, 'Abhishek', 'abhishek@gmail.com', 'Koramangala', '6547893214', 'male', 'Mangalore', '1999-12-12', 'email', '160', 'Pizza'),"
				+ "(10, 'Chetan', 'chetan@gmail.com', 'Whitefield', '2365417890', 'male', 'Bijapur', '2002-06-16', 'phone', '170', 'Fries'),"
				+ "(11, 'Osama', 'osama@gmail.com', 'Electronic City', '7854123690', 'male', 'Raichur', '2000-04-22', 'sms', '180', 'Ice Cream'),"
				+ "(12, 'Arun', 'arun@gmail.com', 'BTM Layout', '9874563311', 'male', 'Shimoga', '2001-01-30', 'email', '190', 'Noodles'),"
				+ "(13, 'Deepak', 'deepak@gmail.com', 'Bannerghatta Road', '1237896541', 'male', 'Udupi', '1998-07-05', 'phone', '200', 'Salad'),"
				+ "(14, 'Rajesh', 'rajesh@gmail.com', 'Richmond Road', '753469123', 'male', 'Davangere', '2001-05-14', 'email', '210', 'Hot Dog'),"
				+ "(15, 'Vikram', 'vikram@gmail.com', 'Malleshwaram', '1346798520', 'male', 'Chitradurga', '2002-10-10', 'sms', '220', 'Falooda'),"
				+ "(16, 'Naveen', 'naveen@gmail.com', 'Frazer Town', '1364978546', 'male', 'Chikkamagaluru', '2000-08-02', 'phone', '230', 'Dosa'),"
				+ "(17, 'Pradeep', 'pradeep@gmail.com', 'Sadashivnagar', '986325741', 'male', 'Hassan', '2003-11-25', 'email', '240', 'Paneer Tikka'),"
				+ "(18, 'Kiran', 'kiran@gmail.com', 'Kalyan Nagar', '4679132583', 'male', 'Gulbarga', '1999-01-30', 'sms', '250', 'Momos'),"
				+ "(19, 'Ravi', 'ravi@gmail.com', 'Jayanagar', '6235794128', 'male', 'Bidar', '2002-07-20', 'phone', '260', 'Tandoori'),"
				+ "(20, 'Suresh', 'suresh@gmail.com', 'Hennur Road', '74830799564', 'male', 'Mandya', '2001-04-18', 'email', '270', 'Chicken Roll')";
		
		try {
			Connection connection = null;
			connection = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
			System.out.println("Connection established");
			
			
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
