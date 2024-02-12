package com.xworkz.hospital.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HospitalUtils {
    public static Connection getConnection(){
        try {
            Class.forName(DBProperties.DRIVER_PATH.value);
            return DriverManager.getConnection(DBProperties.URL.value,DBProperties.USER.value, DBProperties.PASSWORD.value);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
