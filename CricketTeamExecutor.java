class CricketTeamExecutor{

public static void main(String team[]){

Bater playerName = new Bater();
playerName.addPlayerName("Virat Kohli");
playerName.addPlayerName("Faf Du Plessis");
playerName.addPlayerName("Wanindu Hasaranga");
playerName.addPlayerName("Glenn Maxwell");
playerName.addPlayerName("Mohammed siraj");
playerName.addPlayerName("Rajat Patidar");
playerName.addPlayerName("Dinesh Karthik");
playerName.addPlayerName("Rajat Patidar");
playerName.addPlayerName("Harshal Patel");
playerName.addPlayerName("Michael Bracewell");
playerName.addPlayerName("shahbaz Ahmed");
playerName.addPlayerName("Doni");

playerName.getplayerNames();
System.out.println("Searching Mania");
String pName = "Virat Kohli";
System.out.println("Searching for the player " + pName);
String playerNames =  playerName.searchByPlayerName(pName);
System.out.println("Thank You for searching " + pName);

boolean deletedPlayer = playerName.deleteBy("Dinesh Karthik");
System.out.println("The Dinesh Karthik player is deleted "+ deletedPlayer);
playerName.getDeletedplayerNames();
}
}