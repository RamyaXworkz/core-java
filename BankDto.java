package com.xworkz.bankApp.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BankDto {
private int id;
private String name;
private long contactNumber;
private String bankType;
private String email;

}
