class OttPlatforms{

String movieNames[] = new String[5];
int index;

public boolean addMovieName(String movieName){
System.out.println("invoked addMovieName()");
boolean isAdded = false;
if(index < movieNames.length){

if(movieName != null){
	boolean exist = checkIfMovieNameExist(movieName);
	if(exist == false){
System.out.println("validation is proper.. proceed to add movie name");
movieNames[index]= movieName;
index++;
isAdded  = true;
System.out.println(movieName+" is got added successfully!!");
}
else{
	System.out.println(movieName+" Movie name already exist .. please add other");
}
}
}
else{
	System.out.println("moviNames size is full.. you con't proceed to add");
}
return isAdded;
}
 public void  getMovieNames(){
System.out.println("List Of Movie are: ");
for(int index = 0;index < movieNames.length; index++){

System.out.println(movieNames[index]);

}
}
public boolean checkIfMovieNameExist(String movieName){
	System.out.println("Invoked checkIfMovieNameExist");
	boolean exist = false;
	for(int index = 0;index < movieNames.length; index++){
if(movieNames[index] ==  movieName){
	exist = true;
}
}
return exist;
}
public String searchByMovieName(String movieName){
	System.out.println("Invoked searchByMovieName");
	String cinemaName = null;
	for(int index = 0;index < movieNames.length; index++){
if(movieNames[index] ==  movieName){

	cinemaName =  movieNames[index];
}
}
return cinemaName;
}

String moviNamesAfterDelete [] = new String[movieNames.length-1];

public boolean deleteBy( String name){
	
	boolean isDeleted = false;
	
	
	int ind = 0;
	
for(int index = 0;index < movieNames.length; index++){
	
	if(movieNames[index] != name){
		
		moviNamesAfterDelete[ind++] = movieNames[index];
		isDeleted = true;
	}
}

return isDeleted;
}

 public void getDeletedMovNames(){
	System.out.println("List of Movies After deleted are : ");
	for(int index = 0; index< moviNamesAfterDelete.length ; index++){
		
		System.out.println(moviNamesAfterDelete[index]);

}
}

}
/*class OttPlatforms {
	String movieNames[]=new String[4];
	int index;//instance variable
	
	//create/add/save operation
	
	public boolean addMovieName(String movieName){
		System.out.println("Inside the movieNames()");
		boolean isAdded=false;//local variable it shoul be initialize at the time of declarartion
		if(movieName != null){
			System.out.println("valitation is proper");
			movieNames[index]=movieName;
			index++;
			isAdded=true;
			System.out.println(movieNames+"is got added successfully!!");

			
		}
		return isAdded;
		
	}
	
	//read
	public void getMovieNames(){
		for(int index=0; index<movieNames.length;index++){
			System.out.println(movieNames[index]);
			
		}
		
	}
	
}*/



//


