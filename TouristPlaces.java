class TouristPlaces{
     String  name;
     String location;
     String description;
     double rating;
     String openingHours;
     int entranceFee;
    
     String visitorTips;
	 
	 public TouristPlaces(){
		 this("Eiffel Tower", "Paris, France","Iconic iron tower in the heart of Paris", 4.7,"9:00 AM - 11:00 PM", 20, "Visit during sunset for a breathtaking view.");
	 }
	 
	 public TouristPlaces(String name, String location, String description, double rating,String openingHours, int entranceFee, String visitorTips) {
        this.name = name;
        this.location = location;
        this.description = description;
        this.rating = rating;
        this.openingHours = openingHours;
        this.entranceFee = entranceFee;
        
        this.visitorTips = visitorTips;
    }
	
	
public void displayDetails(){
System.out.println("name of the tourist place is : "+name);
System.out.println("Location is: "+location);
System.out.println("Description : "+description);
System.out.println("rating : "+rating);
System.out.println("opening Hours is  : "+openingHours);
System.out.println("entrance Fee is : "+entranceFee);
System.out.println("visitor Tips : "+visitorTips);
}
}