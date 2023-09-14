class CricketTeam{

String playerNames[] = new String[11];
int index;

public boolean addPlayerName(String playerName){
System.out.println("invoked addFoodName()");
boolean isAdded = false;
if(playerName != null){
System.out.println("validation is proper.. proceed to add Player name");
playerNames[index]= playerName;
index++;
isAdded  = true;
System.out.println(playerName+"is got added successfully!!");
}
return isAdded;
}
public void  getplayerNames(){
System.out.println("List Of Player  are: ");
for(int index = 0;index < playerNames.length; index++){

System.out.println(playerNames[index]);

}
}
}