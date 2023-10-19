package com.xworkz.accountApp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private int accId;
    private long accNo;

    private String AccounterName;

    private int ammout;
}
