class Udyanavana{
int udyanavanaId ;
String name ;
String location ;
String flowers[] ;
String openTime;
String closingTime;
int noOfGates ;

 public Udyanavana(int udyanavanaId ,String name,String location,String flowers[],String openTime,String closingTime,int noOfGates){
  this.udyanavanaId =  udyanavanaId;
  this.name =  name;
  this.location =  location;
  this.flowers =  flowers;
  this.openTime =  openTime;
  this.closingTime =  closingTime;
  this.noOfGates = noOfGates;
}

public void displayDetails(){
System.out.println("Udyanavana Id is : "+udyanavanaId);
System.out.println("Udyanavana name  is : "+name);
System.out.println("Location is : "+location);
for(int num=0;num<flowers.length;num++){
System.out.println("Flowres types in udyanavana is : "+flowers[num]);
}
System.out.println("Opening time  is : "+openTime);
System.out.println("Closing time is : "+closingTime);
System.out.println("No Of Gates in udyanavana is : "+noOfGates);
}
}