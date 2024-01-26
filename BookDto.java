package com.xworkz.book.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BookDto {
 private int id;
 private String bookName;
 private String bookType;
 private String version;
 private String publisher;
 private String author;
 private int price;

}
