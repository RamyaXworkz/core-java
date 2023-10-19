package com.xworkz.playstore;

import com.xworkz.playstore.application.Application;
import com.xworkz.playstore.hub.SoftwareHub;

import java.util.Scanner;

public class AppExecutor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the no of Application to be added");
       int size = scanner.nextInt();
       SoftwareHub softwareHub = new SoftwareHub(size);

        for (int index = 0; index < size; index++) {

            Application application = new Application();

//            //System.out.println("Enter the Application Id ");
//            application.setAppId(scanner.nextInt());

            System.out.println("Enter the Application Name ");
            application.setAppName(scanner.next());

            System.out.println("Enter the Application type ");
            application.setAppType(scanner.next());

            System.out.println("Enter the Campony Name of the Application ");
            application.setCompanyName(scanner.next());

            System.out.println("Enter the Application Version ");
            application.setVersion(scanner.next());

            System.out.println("Enter the Application Release Date ");
            application.setReleaseDate(scanner.next());

            System.out.println("Enter the Application Size In Mb ");
            application.setSizeInMb(scanner.nextInt());

            softwareHub.addApplications(application);

        }
        softwareHub.getAllApplication();
        String input = null;
        do{
            System.out.println("Press 1: To get All the Applications");
            System.out.println("Press 2: To get Application By Name");
            System.out.println("Press 3: To get Application By Id");
            System.out.println("Press 4: To get Application By Type");
            System.out.println("Press 5: To get Application Name By Type");
            System.out.println("Press 6: To get Application Type By Name");
            System.out.println("Press 7: To get Application Size By Name");
            System.out.println("Press 8: To get Application CompanyName By Name");
            System.out.println("Press 9: To get Application Id By Name");


            int options = scanner.nextInt();
            switch (options){
                case 1 :   softwareHub.getAllApplication();
                           break;
                case 2:  System.out.println("Enter the Application Name ");
                    Application application2 = softwareHub.getApplicatonByName(scanner.next());
                    System.out.println(application2.getAppName()+" "+application2.getAppId()+ " " + application2.getAppName()+ " " + application2.getCompanyName()+ " " + application2.getVersion()+ " " + application2.getReleaseDate()+ " " + application2.getSizeInMb());

                    break;

                case 3: System.out.println("Enter the Application Id ");
                    Application app2 = softwareHub.getApplicatonById(scanner.nextInt());
                    System.out.println(app2.getAppId()+" "+app2.getCompanyName()+" "+app2.getSizeInMb()+" "+app2.getAppType()+" "+app2.getAppName()+" "+app2.getReleaseDate()+" "+app2.getVersion());
                    break;

                case 4:
                    System.out.println("Enter the Application Type ");
                    Application app3 = softwareHub.getApplicationByType(scanner.next());
                    System.out.println(app3.getAppId()+" "+app3.getCompanyName()+" "+app3.getSizeInMb()+" "+app3.getAppType()+" "+app3.getAppName()+" "+app3.getReleaseDate()+" "+app3.getVersion());
                    break;

                case 5:
                    System.out.println("Enter the Application Type ");
                    String appName = softwareHub.getApplicationNameByType(scanner.next());
                    System.out.println(appName);
                    break;

                case 6:
                    System.out.println("Enter the Application Name ");
                    String appType1 = softwareHub.getApplicationTypeByName(scanner.next());
                    System.out.println(appType1);
                    break;

                case 7:
                    System.out.println("Enter the Application Name ");
                    double appSize = softwareHub.getApplicationSizeByName(scanner.next());
                    System.out.println(appSize);
                    break;

                case 8:
                    System.out.println("Enter the Application Name ");
                    String companyName = softwareHub.getApplicationComapanyNameByName(scanner.next());
                    System.out.println(companyName);
                    break;

                case 9:
                    System.out.println("Enter the Application Name ");
                    int appId = softwareHub.getApplicationIdByName(scanner.next());
                    System.out.println(appId);
                    break;

                default:
                    System.out.println("Please Check the above cases");
            }
            System.out.println("Do you Want to continue : y/n");
            input = scanner.next();
        }while(input.equals("y"));
        System.out.println("Thank you For using our application!!!");

        /*

        Application application = new Application();
        application.setAppId(1);


        application.setAppType("E-commerce");


        application.setAppName("Amazon");


        application.setCompanyName("Amazon Mobile LLC");softwareHub.getAllApplication();

        application.setVersion("26.19.4.300");

        application.setReleaseDate("Dec-12-2014");

        application.setSizeInMb(79);


        softwareHub.addApplications(application);

        Application application1 = new Application();
        application1.setAppId(2);

        application1.setAppType("Food Delivery");

        application1.setAppName("Swiggy");

        application1.setCompanyName("Swiggy");

        application1.setVersion("26.19.4.299");

        application1.setReleaseDate("Jan-20-2022");

        application1.setSizeInMb(20);


        softwareHub.addApplications(application1);



        softwareHub.getAllApplication();
        softwareHub.updateVersionByAppName("26.19.4.301","Amazon");
        softwareHub.getAllApplication();


        softwareHub.getAllApplication();

        softwareHub.deleteApplicationByAppName("Amazon");


        Application application1 = new Application();
        application1.setAppId(2);
        application1.getAppId();
        application1.setAppType("Food Delivery");
        application1.getAppType();


        application1.setAppName("Swiggy");
        application1.getAppName();

        application1.setCompanyName("Swiggy");
        application1.getCompanyName();
        application1.setVersion("26.19.4.299");
        application1.getVersion();
        application1.setReleaseDate("Jan-20-2022");
        application1.getReleaseDate();
        application1.setSizeInMb(20);
        application1.getSizeInMb();

        softwareHub.addApplications(application1);
        //softwareHub.getAllApplication();


        Application application2 = new Application();
        application2.setAppId(3);
        application2.getAppId();
        application2.setAppType("Transportation");
        application2.getAppType();


        application2.setAppName("Red Bus");
        application2.getAppName();

        application2.setCompanyName("IRTC");
        application2.getCompanyName();
        application2.setVersion("26.13.39.231");
        application2.getVersion();
        application2.setReleaseDate("jun-20-2019");
        application2.getReleaseDate();
        application2.setSizeInMb(32.4);
        application2.getSizeInMb();

        softwareHub.addApplications(application2);
        // softwareHub.getAllApplication();


        Application application3 = new Application();
        application3.setAppId(4);
        application3.getAppId();
        application3.setAppType("Education");
        application3.getAppType();


        application3.setAppName("Udemy");
        application3.getAppName();

        application3.setCompanyName("Udemy");
        application3.getCompanyName();
        application3.setVersion("26.03.39.431");
        application3.getVersion();
        application3.setReleaseDate("jun-20-2019");
        application3.getReleaseDate();
        application3.setSizeInMb(435);
        application3.getSizeInMb();

        softwareHub.addApplications(application3);
        // softwareHub.getAllApplication();

        Application application4 = new Application();
        application4.setAppId(5);
        application4.getAppId();
        application4.setAppType("Video editer");
        application4.getAppType();


        application4.setAppName("inshot");
        application4.getAppName();

        application4.setCompanyName("hskfs");
        application4.getCompanyName();
        application4.setVersion("26.03.39.431");
        application4.getVersion();
        application4.setReleaseDate("dec-12-2012");
        application4.getReleaseDate();
        application4.setSizeInMb(135);
        application4.getSizeInMb();

        softwareHub.addApplications(application4);
        // softwareHub.getAllApplication();

        Application app = softwareHub.getApplicationByType("Video editer");
        System.out.println(app.getAppId()+" "+app.getCompanyName()+" "+app.getSizeInMb()+" "+app.getAppType()+" "+app.getAppName()+" "+app.getReleaseDate()+" "+app.getVersion());

        Application app1 = softwareHub.getApplicatonById(3);
        System.out.println(app1.getAppId()+" "+app1.getCompanyName()+" "+app1.getSizeInMb()+" "+app1.getAppType()+" "+app1.getAppName()+" "+app1.getReleaseDate()+" "+app1.getVersion());
        



        double appSize = softwareHub.getApplicationSizeByName("Udemy");
        System.out.println(appSize);


        String companyName = softwareHub.getApplicationComapanyNameByName("Red Bus");
        System.out.println(companyName);

        String appType = softwareHub.getApplicationTypeByName("Red Bus");
        System.out.println(appType);

        String appName = softwareHub.getApplicationNameByType("Transportation");
        System.out.println(appName);

        int appId = softwareHub.getApplicationIdByName("Red Bus");
        System.out.println(appId);

 */
    }
}
