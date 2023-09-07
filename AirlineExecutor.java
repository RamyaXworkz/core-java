/*class AirlineExecutor{

public static void main(String transport[]){

Airline transport1 = new Airline("Delta Airlines","New York","Lo Angeles",23250.00,73984);
Airline transport2 = new Airline("United Airlines","Lo Angeles","Mumbai",12490.00,62864);
Airline transport3 = new Airline("American Airlines","Chicago","Delhi",3123.00,79823);
Airline transport4 = new Airline("Emirates","Paris","Dubai",3132.00,78923);
Airline transport5 = new Airline("British Airways","California","Landon",4240.00,67832);
transport1.displayDetails();
System.out.println("Next Object is :");
transport2.displayDetails();
System.out.println("Next Object is :");
transport3.displayDetails();
System.out.println("Next Object is :");
transport4.displayDetails();
System.out.println("Next Object is :");
transport5.displayDetails();
}
}*/


class AirlineExecutor{

public static void main(String transport[]){

Airline transport1 = new Airline();
Airline transport2 = new Airline("United Airlines","Lo Angeles","Mumbai",12490.00,62864);
Airline transport3 = new Airline("American Airlines","Chicago","Delhi",3123.00,79823);
Airline transport4 = new Airline("Emirates","Paris","Dubai",3132.00,78923);
Airline transport5 = new Airline("British Airways","California","Landon",4240.00,67832);
transport1.displayDetails();
System.out.println("Next Object is :");
transport2.displayDetails();
System.out.println("Next Object is :");
transport3.displayDetails();
System.out.println("Next Object is :");
transport4.displayDetails();
System.out.println("Next Object is :");
transport5.displayDetails();
}
}