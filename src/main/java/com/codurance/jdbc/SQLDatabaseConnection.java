package com.codurance.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import static java.sql.DriverManager.*;

public class SQLDatabaseConnection {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/Northwind_SPP";
        Properties info = new Properties();
        info.put("user", "root");
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Loaded");

        String sql = "select * from Employees;";

        try (Connection connection = getConnection(url, info);
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("firstName"));
            }
        }
    }
}
