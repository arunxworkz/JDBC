package com.xworkz.codeforge.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.codeforge.runner.EnumConnection;

public class Insertion {

	public static void main(String[] args) {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver installed");
			}catch(ClassNotFoundException e) {
				System.err.println("Driver not installed");
				e.printStackTrace();
			}
			

			String insertQuery = "INSERT INTO eventdetails (event_id, event_name, location, organizer, event_type, attendees_count, sponsor, ticket_price, duration_hours) "
			        + "VALUES "
			        + "(1, 'Tech Conference 2024', 'Los Angeles, 'CA', 'Tech Corp', 'Conference', 500, 'InnovateTech', 199.99, 8), "
			        + "(2, 'Music Festival', 'New York, NY', 'Live Music LLC', 'Festival', 2000, 'SoundWave', 99.99, 12), "
			        + "(3, 'Food Expo', 'Chicago, IL', 'Foodies United', 'Exhibition', 1500, 'TastyTreats', 50.00, 6), "
			        + "(4, 'Gaming Tournament', 'Las Vegas, NV', 'Game On', 'Tournament', 1000, 'PlayZone', 30.00, 10), "
			        + "(5, 'Art Show 2024', 'San Francisco, CA', 'Creative Arts', 'Exhibition', 300, 'GalleryNow', 25.00, 4), "
			        + "(6, 'Tech Startup Pitch', 'Austin, TX', 'Startup Hub', 'Conference', 150, 'VentureX', 100.00, 5), "
			        + "(7, 'Fashion Week', 'Paris, France', 'Fashion World', 'Fashion Show', 800, 'ChicDesigns', 250.00, 7), "
			        + "(8, 'Yoga Retreat', 'Sedona, AZ', 'ZenLife', 'Retreat', 100, 'TranquilLife', 350.00, 3), "
			        + "(9, 'Tech Hackathon', 'Seattle, WA', 'Code Masters', 'Hackathon', 200, 'TechX', 0.00, 24), "
			        + "(10, 'Food and Wine Gala', 'Miami, FL', 'Gourmet Events', 'Gala', 500, 'Tasteful Wines', 150.00, 5), "
			        + "(11, 'Film Festival', 'Cannes, France', 'CineMasters', 'Festival', 1500, 'CinemaCo', 200.00, 4), "
			        + "(12, 'Startup Expo', 'Boston, MA', 'Innovators Hub', 'Exhibition', 1200, 'Venture Partners', 75.00, 6), "
			        + "(13, 'Music Awards', 'Nashville, TN', 'Music Stars', 'Awards Ceremony', 1000, 'SoundGear', 120.00, 5), "
			        + "(14, 'Charity Run', 'San Diego, CA', 'Healthy Living', 'Sports', 500, 'RunForCause', 25.00, 2), "
			        + "(15, 'Science Expo', 'Houston, TX', 'SciTech Innovations', 'Exhibition', 600, 'FutureMinds', 40.00, 7), "
			        + "(16, 'Craft Fair', 'Portland, OR', 'Handmade Creations', 'Fair', 800, 'CraftingLove', 20.00, 6), "
			        + "(17, 'Wine Tasting Event', 'Sonoma, CA', 'Vino Ventures', 'Tasting', 200, 'GrapeVine', 100.00, 4), "
			        + "(18, 'Comic Convention', 'Atlanta, GA', 'GeekWorld', 'Convention', 1000, 'HeroShop', 60.00, 8), "
			        + "(19, 'Photography Workshop', 'Los Angeles, CA', 'PhotoPro Academy', 'Workshop', 50, 'LensMaster', 150.00, 3), "
			        + "(20, 'Dance Marathon', 'Dallas, TX', 'StepUp Events', 'Marathon', 300, 'MoveGroove', 30.00, 10)";

			
			try {
				Connection connection = null;
				System.out.println("Connection established");
				connection = DriverManager.getConnection(EnumConnection.URL.getValue(), EnumConnection.USERNAME.getValue(),EnumConnection.PASSWORD.getValue());
				
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

