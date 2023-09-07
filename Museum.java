class Museum {
     String name;
     String location;
     int yearEstablished;
     String type;
     int visitorCount;
     String curator;
     boolean hasCafeteria;
     String specialExhibition;
public Museum(){
	this("National History Museum", "New York City", 1871, "Natural History", 2000000,
                "Dr. Smith", true, "Dinosaur Fossils");
}
    public Museum(String name, String location, int yearEstablished, String type, int visitorCount, String curator,
                  boolean hasCafeteria, String specialExhibition) {
        this.name = name;
        this.location = location;
        this.yearEstablished = yearEstablished;
        this.type = type;
        this.visitorCount = visitorCount;
        this.curator = curator;
        this.hasCafeteria = hasCafeteria;
        this.specialExhibition = specialExhibition;
    }
	
public void getDisplay(){
System.out.println(name);
System.out.println(location);	
System.out.println(yearEstablished);	
System.out.println(type);	
System.out.println(visitorCount);	
System.out.println(curator);	
System.out.println(hasCafeteria);	
System.out.println(specialExhibition);	
}}
	

