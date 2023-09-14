class Spotify{

String songNames[] = new String[11];
int index;

public boolean addSongName(String songName){
System.out.println("invoked addSongName()");
boolean isAdded = false;
if(songName != null){
System.out.println("validation is proper.. proceed to add song name");
songNames[index]= songName;
index++;
isAdded  = true;
System.out.println(songName +"is got added successfully!!");
}
return isAdded;
}
 public void  getSongNames(){
System.out.println("List Of chats are: ");
for(int index = 0;index <songNames.length; index++){

System.out.println(songNames[index]);

}
}
}