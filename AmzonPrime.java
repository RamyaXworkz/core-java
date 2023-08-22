class AmzonPrime{
static String englishMovies[] = {"Inception","The Dark Knight","Forrest Gump","Gladiator","Schindler's List","The Shawshank Redemption","Raiders of the Lost Ark","Saving Private Ryan","Goodfellas","The Goodfather "," Interstellar","The Matrix","FIght Club","Psycho","The lioin King","Pulp Fiction","The Usual Suspects","The Prestige","Avengers -End Game","The dark knight rises","Alien","Django Unchained","Se7en","Citizen","Seven Samurai"};
public static void main(String movie[]){
System.out.println("Main Started");
System.out.println("The length of Movies are: "+englishMovies.length);
System.out.println("The List Of Movies Are:");
for(int index=englishMovies.length-1 ; index>=0 ; index--){
System.out.println(englishMovies[index]);
}
System.out.println("Main Ended");
}
}