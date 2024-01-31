package com.xworkz.book.service;

import com.xworkz.book.dto.BookDto;

import java.sql.SQLException;

public interface BookService {
    public boolean validateAndSave(BookDto dto);
    public BookDto findById(int id);

    public  BookDto findByName(String bookName) throws SQLException;

    public  boolean updateVersionByBookName( String bookName ,String version) ;
    public boolean deleteBookNameById(int id );
}
