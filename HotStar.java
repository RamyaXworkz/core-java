class HotStar{
static String hindiMovies[] = {"3 Idiots","Rang De Basanti","Mother India","Dangal","Dil Chahta Hai","Swades","Bhaag Milkha Bhaag","Udaan","Zindagi Na Milegi Dobara","Let's Go! India","Taare Zameen Par","Mughal-E-Azam","Sanju","Dilwale Dulhania Le Jayenge","Chennai Express","Queen","Sholay","Jaane Bhi Do Yaaro","Kal Ho Naa Ho","Gully Boy","Barfi!","Hera Pheri","Jab We Met","Yeh Jawaani Hai Deewani","The Shawshank Redemption",};
public static void main(String star[]){
System.out.println("Main Started");
System.out.println("The length of Movies are: "+hindiMovies.length);
System.out.println("The List Of Movies Are:");
for(int index=hindiMovies.length-1 ; index>=0 ; index--){
System.out.println(hindiMovies[index]);
}
System.out.println("Main Ended");
}
}