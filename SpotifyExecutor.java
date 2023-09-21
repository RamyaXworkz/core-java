class SpotifyExecutor{

public static void main(String song[]){

PlayList songName = new PlayList();
songName.addSongName("Nudisale");
songName.addSongName("Muddagi Neenu");
songName.addSongName("Udisuve");
songName.addSongName("Yenu Helabeku");
songName.addSongName("O kogile Naa");
songName.addSongName("Nenne tanaka");
songName.addSongName("Maleye malaye");
songName.addSongName("Aparanji Chinnavo");
songName.addSongName("Swathi Muttina Male Haniye");
songName.addSongName("O kogile Naa");
songName.addSongName("Bhale Bhale Chandadha");
songName.addSongName("megha bantu megha");

songName.getSongNames();
System.out.println("Searching Mania");
String sName = "O kogile Naa";
System.out.println("Searching for the song " + sName);
String songNames =  songName.searchBySongName(sName);
System.out.println("Thank You for searching " + sName);


boolean deletedsong = songName.deleteBy("O kogile Naa");
System.out.println("The O kogile Naa song is deleted "+ deletedsong);
songName.getDeletedsongNames();
}
}