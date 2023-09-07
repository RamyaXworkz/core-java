class BusStandExecutor{
public static void main(String arg[]){

BusStand busStand = new BusStand();
busStand.setId(1);
busStand.getId();
System.out.println("The Bus Stand  id is : "+busStand.getId());
busStand.setName("Kempe Gowda Nildana");
busStand.getName();
System.out.println("The Stand Name is : "+busStand.getName());
busStand.setLocation("Banglore");
busStand.getLocation();
System.out.println("The Stand location is : "+busStand.getLocation());
busStand.setNoOfPlatforms(10);
busStand.getNoOfPlatforms();
System.out.println("no of terminal in Stand  is : "+busStand.getNoOfPlatforms());
busStand.setNoOfGates(2);
busStand.getNoOfGates();
System.out.println("no of gates in Stand  is : "+busStand.getNoOfGates());
}
}