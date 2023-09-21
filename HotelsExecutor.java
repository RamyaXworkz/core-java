class HotelsExecutor{

public static void main(String food[]){

Veg foodName = new Veg();
foodName.addFoodName("Tikka Masala");
foodName.addFoodName("Butter Chicken");
foodName.addFoodName("Palav");
foodName.addFoodName("Malai Kofta");
foodName.addFoodName("Vindaloo");
foodName.addFoodName("Rogan Josh");
foodName.addFoodName("Karaikudi Curry");
foodName.addFoodName("Hydrabad Biriyani");
foodName.addFoodName("Kulcha");
foodName.addFoodName("Palav");
foodName.addFoodName("Mashroom Froed Rice");
foodName.getFoodNames();

System.out.println("Searching Mania");
String fName = "Kulcha";
System.out.println("Searching for the food " + fName);
String foodNames =  foodName.searchByFoodName(fName);
System.out.println("Thank You for searching " + fName);

boolean deletedfood = foodName.deleteBy("Kulcha");
System.out.println("The Kulcha food is deleted "+ deletedfood);
foodName.getDeletedfoodNames();
}
}