package com.xworkz.book.repository;

import com.xworkz.book.dto.BookDto;

import java.sql.SQLException;

public interface BookRepo {
    public boolean save(BookDto dto);
    public  BookDto findById(int id);
    public  BookDto findByName(String name) throws SQLException;
    public boolean updateVersionByBookName( String bookName ,String version) ;
    public boolean deleteBookNameById(int id );
}
