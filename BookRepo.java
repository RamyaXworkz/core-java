package com.xworkz.book.repository;

import com.xworkz.book.dto.BookDto;

public interface BookRepo {
    public boolean save(BookDto dto);
}
