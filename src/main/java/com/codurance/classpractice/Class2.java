package com.codurance.classpractice;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Class2 {
  public static void main(String[] args) throws SQLException {
    final Class1 class1 = new Class1();
    final int value = class1.value;

    DataSource dataSource = null;


    try (final Connection conn = dataSource.getConnection();
         PreparedStatement ps = conn.prepareStatement("select * from hello");) {

    }
  }
}
