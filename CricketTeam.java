class CricketTeam{

String playerNames[] = new String[11];
int index;

public boolean addPlayerName(String playerName){
System.out.println("invoked addFoodName()");
boolean isAdded = false;
if(index <  playerNames.length){
if(playerName != null){
	boolean exist = checkIfPlayerNameExist(playerName);
	if(exist == false){
System.out.println("validation is proper.. proceed to add Player name");
playerNames[index]= playerName;
index++;
isAdded  = true;
System.out.println(playerName+" is got added successfully!!");
}
else{
	System.out.println(playerName+" Player name already exist .. please add other");
}
}
}
else {
System.out.println("Array index out of bound Exception");
}

return isAdded;
}
public void  getplayerNames(){
System.out.println("List Of Player  are: ");
for(int index = 0;index < playerNames.length; index++){

System.out.println(playerNames[index]);

}
}
public boolean checkIfPlayerNameExist(String playerName){
	System.out.println("Invoked checkIfPlayerNameExist");
	boolean exist = false;
	for(int index = 0;index < playerNames.length; index++){
if(playerNames[index] ==  playerName){
	exist = true;
}
}
return exist;
}
}