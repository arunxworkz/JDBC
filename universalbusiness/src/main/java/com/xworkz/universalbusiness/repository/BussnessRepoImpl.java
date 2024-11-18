package com.xworkz.universalbusiness.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.universalbusiness.cdconnection.DbConnection;
import com.xworkz.universalbusiness.dto.BusinessDTO;

public class BussnessRepoImpl implements BussinessRepsotiry{

	@Override
	public boolean save(BusinessDTO businessDTO) {
		boolean valid = true;
		try {
			Connection connection = null;
			connection = DriverManager.getConnection(DbConnection.URL.getValue(), DbConnection.USERNAME.getValue(), DbConnection.PASSWORD.getValue());
	
			PreparedStatement preparedStatement = null;
					
			preparedStatement = connection.prepareStatement("insert into details values(?, ?, ?, ?, ?, ?)");
			
			preparedStatement.setString(1, businessDTO.getName());
			preparedStatement.setString(2,businessDTO.getEmail());
			preparedStatement.setString(3, businessDTO.getPhNo());
			preparedStatement.setInt(4, businessDTO.getAge());
			preparedStatement.setString(5, businessDTO.getAddNo());
			preparedStatement.setString(6, businessDTO.getPanNo());
			
			int value = preparedStatement.executeUpdate();
			if(value > 0) {
				System.out.println("Saved");
				valid = true;
			}else {
				System.out.println("Not saving");
				valid =  false;
			}	
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return valid;
	}
	
	

}
