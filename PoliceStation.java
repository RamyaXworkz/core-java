package com.xworkz.policeApp.station;

import com.xworkz.policeApp.officer.Officer;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@ToString

public class PoliceStation {

    Officer officer[] ;
    public PoliceStation(int size){
        officer = new Officer[size];
    }
    int index;
    public boolean addOfficers(Officer officer){
        System.out.println("invoke addOfficers");
        boolean isAdded = false;
        if(officer != null){
            this.officer[index++] = officer;
            isAdded = true;
        }
        return isAdded ;
    }
    public void getAllOfficer(){
        System.out.println("Officer lists are");
        for(int index = 0; index < officer.length; index++)
        {
            System.out.println(officer[index].getOfficerId()+" "+officer[index].getName()+" "+officer[index].getGender()+" "+officer[index].getAge()+" "+officer[index].getPostName()+" "+officer[index].getBloodGroup()+" "+officer[index].getAddress());
        }
    }
    public String getAddressById(int id){
       String address = null ;
        for (int officerIndex = 0; officerIndex < this.officer.length; officerIndex++)
        {
            if (officer[officerIndex].getOfficerId() == id)
            {
                address = officer[officerIndex].getAddress();
                System.out.println("Application  name found.... please collect it in executor");

            }
        }
        return address;
    }

    public Officer getOfficeInfoById(int officerId){
        Officer officer1 = null;
        for (int officerIndex = 0; officerIndex < this.officer.length; officerIndex++) {
            if ( officer[officerIndex].getOfficerId()== officerId ){
                officer1 = officer[officerIndex];
                System.out.println("Application found.... please collect it in executor");
            }
        }
        return officer1;
    }
    public int getOfficerAgeByName(String officerName){
        int age = 0;
        for (int officerIndex = 0; officerIndex < this.officer.length; officerIndex++) {
            if ( officer[officerIndex].getName().equals(officerName) ){
                age = officer[officerIndex].getAge();
                System.out.println("Application found.... please collect it in executor");
            }
        }
        return age;
    }
    public String getPostNameByName(String officerName){
        String postName = null;
        for (int officerIndex = 0; officerIndex < this.officer.length; officerIndex++) {
            if ( officer[officerIndex].getName().equals(officerName)  ){
                postName = officer[officerIndex].getPostName();
                System.out.println("Application found.... please collect it in executor");
            }
        }
        return postName;
    }
    public String getPostNameById(int officerId){
        String postName = null;
        for (int officerIndex = 0; officerIndex < this.officer.length; officerIndex++) {
            if ( officer[officerIndex].getOfficerId() == officerId ){
                postName = officer[officerIndex].getPostName();
                System.out.println("Application found.... please collect it in executor");
            }
        }
        return postName;
    }


 public String[] getOfficersNamesByPostName(String postName){
     System.out.println("search officers by their post name");
     String[] officersNames = null;
     int newIndex = 0;

     for (int index = 0; index < officer.length; index++) {
         if (officer[index].getPostName().equals(postName) ){
             newIndex++;
         }
     }
     officersNames = new String[newIndex];
     newIndex= 0;
     for (int index = 0; index < officer.length; index++) {
         if (officer[index].getPostName().equals(postName) ){
             officersNames[newIndex++] = officer[index].getName();
         }
     }
     return officersNames;
 }

    public boolean updatePostNameByOfficerName(String updatedPostName, String exisistingOfficerName){
        boolean isPostNameUpdated = false ;
        for (int officerIndex = 0; officerIndex < this.officer.length; officerIndex++) {
            if ( officer[officerIndex].getName() == exisistingOfficerName ){
                officer[officerIndex].setPostName(updatedPostName);
                isPostNameUpdated = true;
            }
        }
        return isPostNameUpdated;
    }
    public void deleteOfficerById(int id) {
        System.out.println("invoked deleteOfficerById ");
        int index, newIndex;
        for (index = 0, newIndex = 0; index < this.officer.length; index++) {
            if (officer[index].getOfficerId() != id) {
                officer[newIndex++] = officer[index];
            }
            else {
                System.out.println("Given App Name is been deleted from the SoftwareHub");
            }
        }
        officer = Arrays.copyOf(officer, newIndex);
        getAllNewApplication(officer);
    }
    public void getAllNewApplication(Officer application[]){
        System.out.println("Get all new application");
        for (int index = 0; index < application.length; index++) {
            System.out.println(officer[index].getOfficerId()+" "+officer[index].getName()+" "+officer[index].getGender()+" "+officer[index].getAge()+" "+officer[index].getPostName()+" "+officer[index].getBloodGroup()+" "+officer[index].getAddress());
        }
    }

}
