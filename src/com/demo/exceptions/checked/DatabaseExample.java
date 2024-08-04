package com.demo.exceptions.checked;

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

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Establishing a connection
            connection = DriverManager.getConnection(url, user, password);

            // Creating a statement
            statement = connection.createStatement();

            // Executing a query
            resultSet = statement.executeQuery("SELECT * FROM mytable"); // Replace with your query

            // Processing the result set
            while (resultSet.next()) {
                System.out.println("Column1: " + resultSet.getString("column1")); // Replace with your column name
                System.out.println("Column2: " + resultSet.getString("column2")); // Replace with your column name
            }
        } catch (SQLException e) {
            System.out.println("An error occurred while accessing the database: " + e.getMessage());
        } finally {
            // Close the resources
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("An error occurred while closing the database resources: " + e.getMessage());
            }
        }
    }
}