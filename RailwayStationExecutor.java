class RailwayStationExecutor{
public static void main(String arg[]){

RailwayStation railway = new RailwayStation();
railway.setId(1);
railway.getId();
System.out.println("The railway station id is : "+railway.getId());
railway.setName("Kempe Gowda RailwayStation");
railway.getName();
System.out.println("The Station Name is : "+railway.getName());
railway.setLocation("Banglore");
railway.getLocation();
System.out.println("The Station location is : "+railway.getLocation());
railway.setNoOfPlatforms(10);
railway.getNoOfPlatforms();
System.out.println("no of platforms in Station  is : "+railway.getNoOfPlatforms());
railway.setNoOfGates(2);
railway.getNoOfGates();
System.out.println("no of gates in Station  is : "+railway.getNoOfGates());
}
}