class GymExecutor{

public static void main(String args[]){
	Gym gym1 = new Gym();
	Gym gym2 = new Gym(2,"Janu fitness","Mandya",10,"10AM","6PM");
	Gym gym3 = new Gym(3,"Moni fitness","Mysuru",15,"8AM","8PM");
	Gym gym4= new Gym(4,"Nisu fitness","Ramnagar",25,"11AM","5PM");
	Gym gym5= new Gym(5,"LT Fitness","Srinagar",15,"10AM","9PM");
	
gym1.displayDetails();
System.out.println("Next Object is :");
gym2.displayDetails();
System.out.println("Next Object is :");
gym3.displayDetails();
System.out.println("Next Object is :");
gym4.displayDetails();
System.out.println("Next Object is :");
gym5.displayDetails();
}
}