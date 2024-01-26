package com.xworkz.book;

import com.xworkz.book.dto.BookDto;
import com.xworkz.book.service.BookService;
import com.xworkz.book.service.BookServiceImpl;

public class BookExecutor {
    public static void main(String[] args) {
        BookService service =new BookServiceImpl();
       BookDto dto=  new BookDto( 1 , "The Great Gatsby" , "Novel","1.0v","Charles Scribner's Sons","F.Scott Fitzgerald",149);
       service.validateAndSave(dto);
    }
}
