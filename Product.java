package com.xworkz.dmartApp.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private int productId;
    private String productName;
    private int quantity;
    private String mfgBy;
    private String mfgDate;
    private String expDate;
    private String email;
    private int tollFreeNo;
    private double price;
    private String batchNo;



}
