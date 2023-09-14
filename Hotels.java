class Hotels{

String foodNames[] = new String[10];
int index;

public boolean addFoodName(String foodName){
System.out.println("invoked addFoodName()");
boolean isAdded = false;
if(foodName != null){
System.out.println("validation is proper.. proceed to add Food name");
foodNames[index]= foodName;
index++;
isAdded  = true;
System.out.println(foodName+"is got added successfully!!");
}
return isAdded;
}
 public void  getFoodNames(){
System.out.println("List Of Foods are: ");
for(int index = 0;index < foodNames.length; index++){

System.out.println(foodNames[index]);

}
}
}