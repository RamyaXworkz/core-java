class MuseumExecutor{

public static void main(String sangrahalaya[]){
Museum museum1 = new Museum("National History Museum", "New York City", 1871, "Natural History", 2000000,
                "Dr. Smith", true, "Dinosaur Fossils");
				museum1.getDisplay();
System.out.println("Next Object is :");

Museum museum2 = new Museum("Louvre Museum", "Paris", 1793, "Art", 10000000,
                "Claire Dubois", true, "Mona Lisa");
				museum2.getDisplay();
System.out.println("Next Object is :");

Museum museum3 = new Museum("British Museum", "London", 1753, "Cultural", 6000000,
                "Professor Anderson", true, "Egyptian Antiquities");
				museum3.getDisplay();
System.out.println("Next Object is :");

Museum museum4 = new Museum("Smithsonian Institution", "Washington D.C.", 1846, "Various", 3500000,
                "John Johnson", true, "Space Exploration");
				museum4.getDisplay();
System.out.println("Next Object is :");

Museum museum5 = new Museum("State Hermitage Museum", "St. Petersburg", 1764, "Art", 4000000,
                "Olga Ivanova", true, "Impressionist Paintings");
				museum5.getDisplay();
				

}}
