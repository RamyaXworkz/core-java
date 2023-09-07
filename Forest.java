class Forest{
     String name;
     double area;
     int treeCount;
     String location;
     String climate;
     int animalCount;
     boolean hasLake;
	 
	 public Forest(){
		 this("Greenwood Forest", 500.0, 10000, "Northwoods", "Temperate", 300, true);
	 }


public Forest(String name, double area, int treeCount, String location, String climate, int animalCount, boolean hasLake) {
        this.name = name;
        this.area = area;
        this.treeCount = treeCount;
        this.location = location;
        this.climate = climate;
        this.animalCount = animalCount;
        this.hasLake = hasLake;
    }



public void getDisplay(){
System.out.println(name);
System.out.println(area);
System.out.println(treeCount);
System.out.println(climate);
System.out.println(animalCount);
System.out.println(hasLake);
}
}