package com.demo.exceptions.checked.try_with_resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase"; // Replace with your database URL
        String user = "username"; // Replace with your database username
        String password = "password"; // Replace with your database password

        // Using try-with-resources to ensure resources are closed automatically
        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM mytable")) { // Replace with your query

            // Processing the result set
            while (resultSet.next()) {
                System.out.println("Column1: " + resultSet.getString("column1")); // Replace with your column name
                System.out.println("Column2: " + resultSet.getString("column2")); // Replace with your column name
            }
        } catch (SQLException e) {
            System.out.println("An error occurred while accessing the database: " + e.getMessage());
        }
    }
}