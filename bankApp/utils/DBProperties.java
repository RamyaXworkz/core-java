package com.xworkz.bankApp.utils;

public enum DBProperties {
    URL("jdbc:mysql://localhost:3306/playstore"),USER("root"),PASSWORD("Ramya@1234"),DRIVER_PATH("com.mysql.cj.jdbc.Driver");
public String value;
private DBProperties(String value){
    this.value = value;
}

}
