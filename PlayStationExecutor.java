class PlayStationExecutor{

public static void main(String aata[]){
String gameNames2[] = {"Halo Infinite","Forza Horizon","Fable"};
String gameNames3[] = {"The legend of Zelda","Animal Crossing","Mario Kart 8 Deluxe"};
String gameNames4[] = {"Cyberpunk","The Witcher 3","Counter-Strike"};
String gameNames5[] = {"The Last Of Us Part II","Ghost of Tsushima","Red Dead Redemption"};

PlayStation game1 = new PlayStation();
PlayStation game2 = new PlayStation(2,2002,3,gameNames2,"indoor");
PlayStation game3 = new PlayStation(3,2003,3,gameNames3,"outdoor");
PlayStation game4 = new PlayStation(4,2004,3,gameNames4,"indoor");
PlayStation game5 = new PlayStation(5,2005,3,gameNames5,"outdoor");
game1.displayDetails();
System.out.println("Next Object is :");
game2.displayDetails();
System.out.println("Next Object is :");
game3.displayDetails();
System.out.println("Next Object is :");
game4.displayDetails();
System.out.println("Next Object is :");
game5.displayDetails();
}}