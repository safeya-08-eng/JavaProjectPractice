package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class DBconnection {
        public static Connection getConnection() throws SQLException {
            String url = "jdbc:mysql://localhost:3306/practice1";
            String uname = "root";
            String password = "Safeya@2005";
            return DriverManager.getConnection(url, uname, password);
        }
    }

