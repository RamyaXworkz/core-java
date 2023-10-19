package com.xworkz.playstore.hub;

import com.xworkz.playstore.application.Application;
import lombok.Setter;
import sun.security.mscapi.CPublicKey;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
@Setter
public class SoftwareHub{

    Application[] application ;
    int id;

    public SoftwareHub(int size){

        application = new Application[size];

    }
    int index ;

    public boolean addApplications(Application application){
        System.out.println("invoke addApplications");
        boolean isAdded = false;
        if(application != null){
           application.setAppId(id++);
           this.application[index++] = application;
           isAdded = true;
        }
        return isAdded ;
    }

    public void getAllApplication(){
        System.out.println("Application lists are");
        for(int index = 0; index < application.length; index++)
        {

          System.out.println(application[index].getAppName()+" "+application[index].getAppId()+ " " + application[index].getAppName()+ " " + application[index].getCompanyName()+ " " + application[index].getVersion()+ " " + application[index].getReleaseDate()+ " " + application[index].getSizeInMb());
        }
    }

    public Application getApplicatonByName(String appName){
        Application application1 = null;
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex].getAppName().equals(appName) ){
                application1 = application[appIndex];
                System.out.println("Application found.... please collect it in executor");
            }
        }
        return application1;
    }

    public Application getApplicatonById(int appId){
        Application application3 = null;
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if ( application[appIndex].getAppId() == appId ){
                application3 = application[appIndex];
                System.out.println("Application found.... please collect it in executor");
            }
        }
        return application3;
    }
    public Application getApplicationByType(String apptype){

        Application application2 = null;
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex].getAppType().equals(apptype)  ){
                application2 = application[appIndex];
                System.out.println("Application found.... please collect it in executor");
            }
        }
        return  application2;
    }

    public String getApplicationNameByType(String appType){
        String appName = null;
        for (int appIndex = 0; appIndex < this.application.length; appIndex++)
        {
            if (application[appIndex].getAppType().equals(appType) )
            {
                appName = application[appIndex].getAppName();
                System.out.println("Application  name found.... please collect it in executor");

            }
        }
        return appName;
    }

    public  String getApplicationTypeByName(String appName){
        String appType = null;
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex].getAppName().equals(appName) ){
                appType = application[appIndex].getAppType();
                System.out.println("Application type found.... please collect it in executor");

            }
        }
        return appType;
    }

    public  double getApplicationSizeByName(String appName){
        double appSize = 0.0;
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex].getAppName().equals(appName)){
                appSize = application[appIndex].getSizeInMb();
                System.out.println("Application type found.... please collect it in executor");

            }
        }
        return appSize;
    }

    public  String getApplicationComapanyNameByName(String appName){
        String companyName = null;
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex].getAppName().equals(appName)){
                companyName = application[appIndex].getCompanyName();
                System.out.println("Application type found.... please collect it in executor");

            }
        }
        return companyName;
    }

    public  int getApplicationIdByName(String appName){
        int appId = 0;
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if (application[appIndex].getAppName().equals(appName)){
                appId = application[appIndex].getAppId();
                System.out.println("Application type found.... please collect it in executor");

            }
        }
        return appId;
    }


    public boolean updateVersionByAppName(String updatedVersion, String exisistingAppName){
        boolean isVersionUpdated = false ;
        for (int appIndex = 0; appIndex < this.application.length; appIndex++) {
            if(application[appIndex].getAppName().equals(exisistingAppName)){
                application[appIndex].setVersion(updatedVersion);
                isVersionUpdated = true;
            }
        }
        return isVersionUpdated;
    }
    public void deleteApplicationByAppName(String appName) {
        System.out.println("invoked deleteApplicationByAppName ");
        int index, newIndex;
        for (index = 0, newIndex = 0; index < this.application.length; index++) {
            if (application[index].getAppName() != appName) {
                application[newIndex++] = application[index];
            }
            else {
                System.out.println("Given App Name is been deleted from the SoftwareHub");

            }
        }
        application = Arrays.copyOf(application, newIndex);
        getAllNewApplication(application);
    }
    public void getAllNewApplication(Application application[] ){
        System.out.println("Get all new application");
        for (int index = 0; index < application.length; index++) {
            System.out.println(application[index].getAppName()+" "+application[index].getAppId()+" "+application[index].getCompanyName()+" "+application[index].getAppType()+" "+application[index].getVersion()+" "+application[index].getReleaseDate()+" "+application[index].getSizeInMb());
        }
    }
}
