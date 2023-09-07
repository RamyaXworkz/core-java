public class PostOffice{
private int postOfficeId ;
private String postOfficeName;
private int noOfMailBoxes;
private int noOfPostman;
private double revenue;
private int capacityOfMailBoxe;

public void setPostOfficeId(int postOfficeId){
this.postOfficeId = postOfficeId;
}
public int getPostOfficeId(){
return postOfficeId;
}

public void setPostOfficeName(String postOfficeName){
this.postOfficeName = postOfficeName;
}
public String getPostOfficeName(){
return postOfficeName;
}

public void setNoOfMailBoxes(int noOfMailBoxes){
this.noOfMailBoxes = noOfMailBoxes;
}
public int getNoOfMailBoxes(){
return noOfMailBoxes;
}

public void setNoOfPostman(int noOfPostman){
this.noOfPostman = noOfPostman;
}
public int getNoOfPostman(){
return noOfPostman;
}

public void setRevenue(double revenue){
this.revenue = revenue;
}
public double getRevenue(){
return revenue;
}
}