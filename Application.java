package com.xworkz.playstore.application;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Application {

    private int appId;
    private String appName;
    private String  appType;
    private String version;
    private String releaseDate;
    private double sizeInMb;
    private String companyName;



}
