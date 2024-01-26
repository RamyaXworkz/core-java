package com.xworkz.book.repository;

import com.xworkz.book.dto.BookDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookRepoImpl implements BookRepo{
    @Override
    public boolean save(BookDto dto) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/playstore","root","Ramya@1234");
            String query = "Insert into book values(?,?,?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1 , dto.getId());
            statement.setString(2,dto.getBookName());
            statement.setString(3,dto.getBookType());
            statement.setString(4,dto.getVersion());
            statement.setString(5,dto.getPublisher());
            statement.setString(6,dto.getAuthor());
            statement.setInt(7,dto.getPrice());

            int rowsAffected = statement.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}
