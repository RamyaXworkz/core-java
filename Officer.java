package com.xworkz.policeApp.officer;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Officer {

    private int officerId;
    private String name;
    private String postName;
    private int age;
    private String gender;
    private String bloodGroup;
    private String address;

}
