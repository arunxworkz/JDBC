package com.xworkz.standupcomedy.runner;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

public class VehicleRunner {

	public static void main(String[] args) {
		try {
			Connection connection = null;
			connection = DriverManager.getConnection(DBConnection1.URL.getValue(), DBConnection1.USERNAME.getValue(), DBConnection1.PASSWORD.getValue());
			
			PreparedStatement prst = null;
			
			prst = connection.prepareStatement("insert into vehiceldetails(id, owner_name, "
					+ "vehicle_make, vehicle_model, "
					+ "year, registrationdate, expiry_date, registartion_fee, transmissions) "
					+ "value(?, ?, ?, ?, ?, ?, ? , ?, ?)");
			
			prst.setInt(1, 1);
			prst.setString(2, "John Doe");
			prst.setString(3, "Toyota");
			prst.setString(4, "Camry");
			prst.setString(5, "2018");
			prst.setString(6, "2023-01-10");
			prst.setString(7, "2024-01-10");
			prst.setString(8, "150.00");
			prst.setString(9, "Manul");
			prst.addBatch();

				
				prst.setInt(1, 2);
				prst.setString(2, "Jane Smith");
				prst.setString(3, "Honda");
				prst.setString(4, "Civic");
				prst.setString(5, "2020");
				prst.setString(6, "2023-05-20");
				prst.setString(7, "2024-05-20");
				prst.setString(8, "145.00$");
				prst.setString(9, "Automatic");

				prst.addBatch();

				
				prst.setInt(1, 3);
				prst.setString(2, "Robert Brown");
				prst.setString(3, "Ford");
				prst.setString(4, "Mustang");
				prst.setString(5, "2019");
				prst.setString(6, "2022-07-15");
				prst.setString(7, "2023-07-15");
				prst.setString(8, "180.00$");
				prst.setString(9, "Manual");
				prst.addBatch();

				prst.setInt(1, 4);
				prst.setString(2, "Emily Davis");
				prst.setString(3, "Tesla");
				prst.setString(4, "Model S");
				prst.setString(5, "2021");
				prst.setString(6, "2023-03-22");
				prst.setString(7, "2024-03-22");
				prst.setString(8, "250.00$");
				prst.setString(9, "Automatic");
				prst.addBatch();

			
				prst.setInt(1, 5);
				prst.setString(2, "Chris Wilson");
				prst.setString(3, "BMW");
				prst.setString(4, "X5");
				prst.setString(5, "2017");
				prst.setString(6, "2023-06-30");
				prst.setString(7, "2024-06-30");
				prst.setString(8, "3000$");
				prst.setString(9, "MAnual");
				prst.addBatch();

				
				prst.setInt(1, 6);
				prst.setString(2, "Lisa Johnson");
				prst.setString(3, "Chevrolet");
				prst.setString(4, "Malibu");
				prst.setString(5, "2015");
				prst.setString(6, "2022-08-01");
				prst.setString(7, "2023-08-01");
				prst.setString(8, "5000$");
				prst.setString(9, "Automatic");

				prst.addBatch();

		
				prst.setInt(1, 7);
				prst.setString(2, "David White");
				prst.setString(3, "Nissan");
				prst.setString(4, "Altima");
				prst.setString(5, "2022");
				prst.setString(6, "2023-09-12");
				prst.setString(7, "2024-09-12");
				prst.setString(8, "160.00");
				prst.setString(9, "MAnual");
				prst.addBatch();

				prst.setInt(1, 8);
				prst.setString(2, "Sarah Miller");
				prst.setString(3, "Hyundai");
				prst.setString(4, "Elantra");
				prst.setString(5, "2016");
				prst.setString(6, "2023-02-28");
				prst.setString(7, "2024-02-28");
				prst.setString(8, "140.00");
				prst.setString(9, "MAnul");
				prst.addBatch();
				
		
				prst.setInt(1, 9);
				prst.setString(2, "Paul Martinez");
				prst.setString(3, "Mercedes");
				prst.setString(4, "C-Class");
				prst.setString(5, "2021");
				prst.setString(6, "2022-10-10");
				prst.setString(7, "2023-10-10");
				prst.setString(8, "300.00");
				prst.setString(9, "Manular");
				prst.addBatch();

	
				prst.setInt(1, 10);
				prst.setString(2, "Nancy Taylor");
				prst.setString(3, "Subaru");
				prst.setString(4, "Outback");
				prst.setString(5, "2019");
				prst.setString(6, "2023-04-05");
				prst.setString(7, "2024-04-05");
				prst.setString(8, "175.00");
				prst.setString(9, "Manula");
				prst.addBatch();

				

				// Execute the batch
				int[] results = prst.executeBatch();

				if(results.length > 0) {
					System.out.println("Data saved");
				}else {
					System.out.println("Data is not sived");
				}
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
