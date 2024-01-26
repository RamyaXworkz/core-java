package com.xworkz.book.service;

import com.xworkz.book.dto.BookDto;

public interface BookService {
    public boolean validateAndSave(BookDto dto);
}
