package com.company.Tasks_Template.TasksForClasses.Itmathrepetitor_1.test_bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class test_bd_ladograd {
    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/test",
                "postgres", "postgres");
        Statement stmt = con.createStatement();
        ResultSet rs =stmt.executeQuery("SELECT * FROM ladograd");
        while (rs.next()) {
            System.out.println(rs.getLong(1) + " : " + rs.getString(2) + " : " + rs.getInt(3));
        }
    }
}
