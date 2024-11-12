package com.xxworkx.customerdetails.runner;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class class2 {

    public static void main(String[] args) {

        String query = "SELECT address FROM details WHERE name = 'Koramangala' AND phno = '6547893214'";

        try (Connection connection = DriverManager.getConnection(
                    EnumConnection.URL.getValue(), 
                    EnumConnection.USERNAME.getValue(), 
                    EnumConnection.PASSWORD.getValue());
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                System.out.println("Data from table: " + resultSet.getString("address"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
