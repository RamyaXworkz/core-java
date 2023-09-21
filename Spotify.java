class Spotify{

String songNames[] = new String[11];
int index;

public boolean addSongName(String songName){
System.out.println("invoked addSongName()");
boolean isAdded = false;
if(index < songNames.length){
if(songName != null){
	boolean exist = checkIfSongNameExist(songName);
	if(exist == false){
System.out.println("validation is proper.. proceed to add song name");
songNames[index]= songName;
index++;
isAdded  = true;
System.out.println(songName +" is got added successfully!!");
}
else{
	System.out.println(songName+" Song name already exist .. please add other");
}
}
}
else {
System.out.println("Array index out of bound Exception");
}

return isAdded;
}
 public void  getSongNames(){
System.out.println("List Of chats are: ");
for(int index = 0;index <songNames.length; index++){

System.out.println(songNames[index]);

}
}
public boolean checkIfSongNameExist(String songName){
	System.out.println("Invoked checkIfFoodNameExist");
	boolean exist = false;
	for(int index = 0;index < songNames.length; index++){
    if(songNames[index] ==  songName){
	exist = true;
}
}
return exist;
}

public String searchBySongName(String songName){
	System.out.println("Invoked searchBySongName");
	String sName = null;
	for(int index = 0;index < songNames.length; index++){
    if(songNames[index] ==  songName){
	sName = songNames[index];
}
}
return sName;
}
String songNamesAfterDelete [] = new String[songNames.length-1];

public boolean deleteBy( String name){
	
	boolean isDeleted = false;
	
	
	int ind = 0;
	
for(int index = 0;index < songNames.length; index++){
	
	if(songNames[index] != name){
		
		songNamesAfterDelete[ind++] = songNames[index];
		isDeleted = true;
	}
}

return isDeleted;
}

 public void getDeletedsongNames(){
	System.out.println("List of songs After deleted are : ");
	for(int index = 0; index< songNamesAfterDelete.length ; index++){
		
		System.out.println(songNamesAfterDelete[index]);

}
}
}