class TouristPlacesExecutor{

public static void main(String tour[]){
 
TouristPlaces place1 = new TouristPlaces("Eiffel Tower", "Paris, France","Iconic iron tower in the heart of Paris", 4.7,"9:00 AM - 11:00 PM", 20, "Visit during sunset for a breathtaking view."); 
TouristPlaces place2 = new TouristPlaces("Machu Picchu", "Cusco, Peru","Ancient Inca citadel in the Andes Mountains", 4.8,"6:00 AM - 5:30 PM", 60,  "Wear comfortable hiking shoes."); 
TouristPlaces place3 = new TouristPlaces("Great Wall of China", "Beijing, China","World's longest wall and historical landmark", 4.6,"8:00 AM - 6:00 PM", 45, "Visit less crowded sections for better photos."); 
TouristPlaces place4 = new TouristPlaces("Taj Mahal", "Agra, India","Magnificent marble mausoleum and UNESCO World Heritage Site", 4.9,"6:00 AM - 7:00 PM", 20, "Buy tickets online to skip the queue."); 
TouristPlaces place5 = new TouristPlaces("Grand Canyon", "Arizona, USA","Iconic natural wonder known for its stunning landscapes", 4.5,"24/7 (Open year-round)", 35,"Carry plenty of water and sunscreen."); 
place1.displayDetails();
System.out.println("Next Object is :");
place2.displayDetails();
System.out.println("Next Object is :");
place3.displayDetails();
System.out.println("Next Object is :");
place4.displayDetails();
System.out.println("Next Object is :");
place5.displayDetails();
}
}