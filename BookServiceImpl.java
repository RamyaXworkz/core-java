package com.xworkz.book.service;

import com.xworkz.book.dto.BookDto;
import com.xworkz.book.repository.BookRepoImpl;

public class BookServiceImpl implements BookService {
BookRepoImpl repo = new BookRepoImpl();
    @Override
    public boolean validateAndSave(BookDto dto) {
        if (dto != null) {
            if (dto.getId() > 0) {
                if (dto.getBookName() != null && dto.getBookType() != null) {
                    if (dto.getPrice() <= 500) {
                        System.out.println("Book is validated");
                        return  repo.save(dto);
                    }
                }
            }

        }
        return false;
    }
}
