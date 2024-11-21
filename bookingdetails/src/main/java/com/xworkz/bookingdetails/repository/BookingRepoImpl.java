package com.xworkz.bookingdetails.repository;

import com.mysql.cj.protocol.Resultset;
import com.xworkz.bookingdetails.dbconnection.Dbconnection;
import com.xworkz.bookingdetails.dto.BookingDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookingRepoImpl implements BookingRepo{
    @Override
    public boolean save(BookingDTO bookingDTO) {
        boolean isValid = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver installed");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }

        try {
            Connection connection = null;
            PreparedStatement prepSt = null;
            connection = DriverManager.getConnection(Dbconnection.URL.getValue(), Dbconnection.USERNAME.getValue(), Dbconnection.PASSWOORD.getValue());

            prepSt = connection.prepareStatement("INSERT INTO details (name, email, phno, password, age, aadno) VALUES (?, ?, ?, ?, ?, ?)");


            prepSt.setString(1, bookingDTO.getName());
            prepSt.setString(2, bookingDTO.getEmail());
            prepSt.setString(3, bookingDTO.getPhNo());
            prepSt.setString(4, bookingDTO.getPassword());
            prepSt.setInt(5, bookingDTO.getAge());
            prepSt.setString(6, bookingDTO.getAadNo());

            int value = prepSt.executeUpdate();
            if(value > 0){
                System.out.println("Data is saved");
                isValid = true;
            }else{
                System.out.println("Data is not saved");
                isValid = false;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

        return false;
    }

    public List<BookingDTO> getList(int list){
        Connection connection = null;
        PreparedStatement prset = null;

        List<BookingDTO> li = new ArrayList<>();
        try{
            connection = DriverManager.getConnection(Dbconnection.URL.getValue(), Dbconnection.USERNAME.getValue(), Dbconnection.PASSWOORD.getValue());

            prset = connection.prepareStatement("select * from details where id > ?");
            prset.setInt(1, list);
            ResultSet set = prset.executeQuery();


            while (set.next()){

            }


        }catch(SQLException e){
            e.printStackTrace();
        }
        return li;
    }

    public String getNameEmail(String phNo){
        Connection connection = null;
        PreparedStatement prset = null;
        String nameEmail = null;
        try{
            connection = DriverManager.getConnection(Dbconnection.URL.getValue(), Dbconnection.USERNAME.getValue(), Dbconnection.PASSWOORD.getValue());

            prset = connection.prepareStatement("select name, email from details where phno =  ?");

            prset.setString(1, phNo);

            ResultSet set = prset.executeQuery();
            while(set.next()){
                String name = set.getString("name");
                String email = set.getString("email");
                nameEmail = name+ ", " + email;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return nameEmail;
    }


    public void delete(int id){
        Connection connection = null;
        PreparedStatement prset = null;
        try{
            connection = DriverManager.getConnection(Dbconnection.URL.getValue(), Dbconnection.USERNAME.getValue(), Dbconnection.PASSWOORD.getValue());

            prset = connection.prepareStatement("delete * from details where id = ?");
            prset.setInt(1, id);
            int deleted = prset.executeUpdate();
            if(deleted > 0){
                System.out.println("Data is deleted");
            }else{
                System.out.println("Data not deleted");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void update(int id, String name, String email) {
        Connection connection = null;
        PreparedStatement prset = null;

        try {
            // Establish the connection
            connection = DriverManager.getConnection(
                    Dbconnection.URL.getValue(),
                    Dbconnection.USERNAME.getValue(),
                    Dbconnection.PASSWOORD.getValue()
            );

            // SQL query for updating the record
            String sql = "UPDATE details SET name = ?, email = ? WHERE id = ?";

            // Prepare the statement
            prset = connection.prepareStatement(sql);

            // Set the parameters
            prset.setString(1, name);
            prset.setString(2, email);
            prset.setInt(3, id);

            // Execute the update
            int rowsUpdated = prset.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Record updated successfully.");
            } else {
                System.out.println("No record found with the given ID.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
