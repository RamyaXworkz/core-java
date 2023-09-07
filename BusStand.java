public class BusStand{

private int id;
private String name;
private String loc;
private int noOfPlatforms;
private int noOfgate;

public void setId(int id ){
this.id = id ;
}
public int getId(){
return id ;
}

public void setName(String name){
this.name = name;
}
public String getName(){
return name;
}

public void setLocation(String loc){
this.loc = loc;
}
public String getLocation(){
return loc;
}

public void setNoOfPlatforms(int noOfPlatforms){
this.noOfPlatforms = noOfPlatforms;
}
public int getNoOfPlatforms(){
return noOfPlatforms;
}

public void setNoOfGates(int noOfgate){
this.noOfgate = noOfgate;
}
public int getNoOfGates(){
return noOfgate;
}
}