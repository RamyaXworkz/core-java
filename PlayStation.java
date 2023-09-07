class PlayStation{

int PlayStationId ;
int releaseYear;
int noOfGames ;
String gameNames[];
String typeOfGames;

String gameNames1[] = {"The Last of Us Part II", "Halo Infinite", "Animal Crossing: New Horizons", "The Witcher 3: Wild Hunt", "Cyberpunk 2077"};
public PlayStation(){
	this(1,2001,5,gameNames1,"indoor");
}

public PlayStation(int PlayStationId ,int releaseYear,int noOfGames,String gameNames[],String typeOfGames){
  this.PlayStationId =  PlayStationId;
  this.releaseYear =  releaseYear;
  this.noOfGames =  noOfGames;
  this.gameNames =  gameNames;
  this.typeOfGames =  typeOfGames;
}

public void displayDetails(){
System.out.println("PlayStation Id is : "+PlayStationId);
System.out.println("Release Year  is : "+releaseYear);
System.out.println("no Of Games : "+noOfGames);
for(int num =0;num<gameNames.length ;num++){	
System.out.println("Game Names : "+gameNames[num]);
}
System.out.println("Type Of Games : "+typeOfGames);
}
}
