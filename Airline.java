/*class Airline{
String flightName ;
String departureCity ;
String destinationCity ;
double ticketPrice;
int bookingNumber ;

 public Airline(String flightName,String departureCity,String destinationCity,double ticketPrice,int bookingNumber){
  this.flightName =  flightName;
  this.departureCity =  departureCity;
  this.destinationCity =  destinationCity;
  this.ticketPrice =  ticketPrice;
  this.bookingNumber =  bookingNumber;
}

public void displayDetails(){
System.out.println("Flight Name is : "+flightName);
System.out.println("Departure city is : "+departureCity);
System.out.println("Destination city is : "+destinationCity);
System.out.println("Ticket Price is : "+ticketPrice);
System.out.println("Booking Number is : "+bookingNumber);
}
}*/


class Airline{
String flightName ;
String departureCity ;
String destinationCity ;
double ticketPrice;
int bookingNumber ;

public Airline(){
	this("Delta Airlines","New York","Lo Angeles",23250.00,73984);
}
 public Airline(String flightName,String departureCity,String destinationCity,double ticketPrice,int bookingNumber){
  this.flightName =  flightName;
  this.departureCity =  departureCity;
  this.destinationCity =  destinationCity;
  this.ticketPrice =  ticketPrice;
  this.bookingNumber =  bookingNumber;
}

public void displayDetails(){
System.out.println("Flight Name is : "+flightName);
System.out.println("Departure city is : "+departureCity);
System.out.println("Destination city is : "+destinationCity);
System.out.println("Ticket Price is : "+ticketPrice);
System.out.println("Booking Number is : "+bookingNumber);
}
}