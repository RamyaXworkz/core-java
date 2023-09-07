class Gym{
int gymId ;
String name ;
String location ;
int noOfEquipments  ;
String openTime;
String closingTime;

public Gym(){
	this(1,"Ramya fitness","Gangavati",5,"9AM","7PM");
}

 public Gym(int gymId ,String name,String location,int noOfEquipments,String openTime,String closingTime){
  this.gymId =  gymId;
  this.name =  name;
  this.location =  location;
  this.noOfEquipments =  noOfEquipments;
  this.openTime =  openTime;
  this.closingTime =  closingTime;
 
}

public void displayDetails(){
System.out.println("Gym Id is : "+gymId);
System.out.println("Gym name  is : "+name);
System.out.println("Gym location is : "+location);
System.out.println("Gym No Of Equipments : "+noOfEquipments);
System.out.println("Opening time  is : "+openTime);
System.out.println("Closing time is : "+closingTime);

}
}