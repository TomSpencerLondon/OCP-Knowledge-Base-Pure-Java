package com.codurance.ocppracticeexam;

import java.sql.*;

public class PreparedStatementPractice {
  private static java.sql.DriverManager DriverManager;

  public static void main(String[] args) throws SQLException, ClassNotFoundException {
    Class.forName("com.mysql.cj.jdbc.Driver");

    final Connection connection = DriverManager.getConnection(
        "jdbc:mysql://127.0.0.1:3306/sakila",
        "root",
        "password"
    );


    try (final PreparedStatement ps = connection.prepareStatement("SELECT * from actor where actor_id= ?;")){
      ps.setObject(1, 1);
      ps.execute();
      ResultSet rs = ps.getResultSet();
      while(rs.next()) {
        System.out.println(rs.getString("first_name"));
        System.out.println(rs.getString("last_name"));
      }
    }
  }
}
