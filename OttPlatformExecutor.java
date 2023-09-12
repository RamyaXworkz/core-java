class OttPlatformExecutor{
public static void main(String platform[]){
String movie[] = {"Sapta Sagara Dache Yallo","RRR","Avatar2","Priya saki","Prema Enta Madura","manikya"};
Voot movies = new Voot();
movies.getMovies(movie);
System.out.println(movies);
}
}