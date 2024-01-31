package com.xworkz.book;

import com.xworkz.book.dto.BookDto;
import com.xworkz.book.service.BookService;
import com.xworkz.book.service.BookServiceImpl;

import java.sql.SQLException;

public class BookExecutor {
    public static void main(String[] args) throws SQLException {
        BookService service =new BookServiceImpl();
       //BookDto dto=  new BookDto( 2 , "mukajjiya kathe" , "novel","1.0v","Joe"," Dara bendre",390);
     // service.validateAndSave(dto);
     // BookDto dto = service.findById(1);
   //     System.out.println(dto);
     //   BookDto dto1 = service.findByName("mukajjiya kathe");
     //   System.out.println(dto1);
      //boolean version = service.updateVersionByBookName("mukajjiya kathe" ,"1.2v");
      //System.out.println(version);
       boolean delete = service.deleteBookNameById(4);
       System.out.println(delete);
    }
}
