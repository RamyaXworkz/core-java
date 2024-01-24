package com.xworkz.employee;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Setter
@Getter
@NoArgsConstructor

public class OrganizationTester  {


    public static void main(String[] args) {
        save(1,"Ramya","GAT",22,21500.00);
    }

    public static  void save( int employeeId, String employeeName, String  desiganation,int age,double salary){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");


        String jdbcUrl = "jdbc:mysql://localhost:3306/jan23";
        String userName = "root";
        String password = "Ramya@1234";

        Connection conn = null;
        PreparedStatement stmt = null;

            conn = DriverManager.getConnection(jdbcUrl, userName, password);
            String query = "insert into employee2 values (employeeId,employeeName,desiganation,age,salary)"+"VALUES(?,?,?,?,?)";

            stmt = conn.prepareStatement(query);
            stmt.setInt(1,employeeId);
            stmt.setString(2,employeeName);
            stmt.setString(3,desiganation);
            stmt.setInt(4,age);
            stmt.setDouble(5,salary);

            int rowsAdded = stmt.executeUpdate();
            System.out.println(rowsAdded);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();

        }

            }
        }




