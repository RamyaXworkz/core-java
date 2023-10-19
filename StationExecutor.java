package com.xworkz.policeApp;

import com.xworkz.policeApp.officer.Officer;
import com.xworkz.policeApp.station.PoliceStation;

import java.util.ArrayList;
import java.util.Scanner;

public class StationExecutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of Objects to be created");
        int size = scanner.nextInt();
        PoliceStation policeStation = new PoliceStation(size);
        for (int index = 0; index < size; index++) {
            Officer officer = new Officer();
            System.out.println("Enter the Id of the Officer");
            officer.setOfficerId(scanner.nextInt());
            System.out.println("Enter the Name of the Officer");
            officer.setName(scanner.next());
            System.out.println("Enter the Gender of the Officer");
            officer.setGender(scanner.next());
            System.out.println("Enter the Age of the officer");
            officer.setAge(scanner.nextInt());
            System.out.println("Enter the Post Name of the Officer");
            officer.setPostName(scanner.next());
            System.out.println("Enter the Blood group of the Officer");
            officer.setBloodGroup(scanner.next());
            System.out.println("Enter the Address of the Officer");
            officer.setAddress(scanner.next());
            policeStation.addOfficers(officer);
        }
        policeStation.getAllOfficer();


        String input = null;
        do{
            System.out.println("Press 1 : To get all the Officers");
            System.out.println("Press 2 : To get address of the Officer by Id");
            System.out.println("Press 3 : To get Officer Information By id");
            System.out.println("Press 4 : To get Officer age by name");
            System.out.println("Press 5 : To get post name of the Officer by name");
            System.out.println("Press 6 : To get post name of the Officer by id");
            System.out.println("Press 7 : To get Officer  names by post name");
            int options = scanner.nextInt();

            switch (options){
                case 1 : policeStation.getAllOfficer();
                          break;
                case 2 :
                         System.out.println("Enter the Id");
                         String address = policeStation.getAddressById(scanner.nextInt());
                         System.out.println(address);
                         break;

                case 3:
                         System.out.println("Enter the id");
                         Officer offic = policeStation.getOfficeInfoById(scanner.nextInt());
                         System.out.println(offic.getOfficerId()+" "+offic.getName()+" "+offic.getGender()+" "+offic.getAge()+" "+offic.getPostName()+" "+offic.getAddress()+" "+offic.getBloodGroup());
                         break;

                case 4:
                         System.out.println("Enter the Name");
                         int age = policeStation.getOfficerAgeByName(scanner.next());
                         System.out.println(age);
                         break;

                case 5:
                         System.out.println("Enter the Name");
                         String postName = policeStation.getPostNameByName(scanner.next());
                         System.out.println(postName);
                         break;

                case 6:
                         System.out.println("Enter the id");
                         String postName1 = policeStation.getPostNameById(scanner.nextInt());
                         System.out.println(postName1);
                         break;

                case 7:
                          System.out.println("Enter the Post Name");
                          String[] officernames = policeStation.getOfficersNamesByPostName(scanner.next());
                          for (int index = 0; index < officernames.length; index++) {
                          System.out.println(officernames[index]);
                          }
                         break;

                default:
                         System.out.println("Please check the above cases");
                         break;
            }
            System.out.println("Do you want to continue y/n");
            input = scanner.next();
        }while (input.equals("y"));
        System.out.println("Thank you for using our app");


    }
}
       /*
        Officer officer = new Officer();
        officer.setOfficerId(1);
        officer.setName("Pavan");
        officer.setGender("Male");
        officer.setAge(25);
        officer.setPostName("SP");
        officer.setBloodGroup("A+");
        officer.setAddress("Kottur");

        policeStation.addOfficers(officer);
        //policeStation.getAllOfficer();

        Officer officer1 = new Officer();
        officer1.setOfficerId(2);
        officer1.setName("Sagar");
        officer1.setGender("Male");
        officer1.setAge(23);
        officer1.setPostName("Constable");
        officer1.setBloodGroup("O+");
        officer1.setAddress("Gangavathi");

        policeStation.addOfficers(officer1);
       // policeStation.getAllOfficer();

        Officer officer2 = new Officer();
        officer2.setOfficerId(3);
        officer2.setName("Ramya");
        officer2.setGender("Female");
        officer2.setAge(23);
        officer2.setPostName("IG");
        officer2.setBloodGroup("O+");
        officer2.setAddress("HereJantakal");

        policeStation.addOfficers(officer2);
        //policeStation.getAllOfficer();

        Officer officer3 = new Officer();
        officer3.setOfficerId(4);
        officer3.setName("Niveditha");
        officer3.setGender("Female");
        officer3.setAge(24);
        officer3.setPostName("SI");
        officer3.setBloodGroup("B+");
        officer3.setAddress("Hassan");

        policeStation.addOfficers(officer3);
        //policeStation.getAllOfficer();

        Officer officer4 = new Officer();
        officer4.setOfficerId(5);
        officer4.setName("Chandana");
        officer4.setGender("Female");
        officer4.setAge(24);
        officer4.setPostName("IG");
        officer4.setBloodGroup("B-");
        officer4.setAddress("Halebidu");

        policeStation.addOfficers(officer4);
        //policeStation.getAllOfficer();


        String address = policeStation.getAddressById(2);
        System.out.println(address);

        Officer offic = policeStation.getOfficeInfoById(1);
        System.out.println(offic.getOfficerId()+" "+offic.getName()+" "+offic.getGender()+" "+offic.getAge()+" "+offic.getPostName()+" "+offic.getAddress()+" "+offic.getBloodGroup());

        int age = policeStation.getOfficerAgeByName("Niveditha");
        System.out.println(age);

        String postName = policeStation.getPostNameByName("Sagar");
        System.out.println(postName);

        String postName1 = policeStation.getPostNameById(5);
        System.out.println(postName1);

        policeStation.updatePostNameByOfficerName("SP","Sagar");

        policeStation.deleteOfficerById(4);

        String[] officerName = policeStation.getOfficersNamesByPostName("Sp");
        for (int index = 0; index < officerName.length; index++) {
            System.out.println(officerName[index]);
        }

      */

