class OttPlatformsExecutor{

public static void main(String ott[]){

DisneyPlusHotstar platform = new DisneyPlusHotstar();

platform.addMovieName("Priya Saki");
platform.addMovieName("Anna Tangi");
platform.addMovieName("Halli Mestru");
platform.addMovieName("Mr and Miss Ramachari");
platform.addMovieName("Anna Tangi");
platform.addMovieName("Bhale Bhale Chennada");
platform.getMovieNames();

System.out.println("Searching Mania");
String mName = "Sapta sagaradache yello";
System.out.println("Searching for the Movie " + mName);
String MovieNames =  platform.searchByMovieName(mName);
System.out.println("Thank You for searching " + mName);


boolean deletedMovie = platform.deleteBy("Anna Tangi");
System.out.println("The Anna Tangi movie is deleted "+ deletedMovie);
platform.getDeletedMovNames();
}
}