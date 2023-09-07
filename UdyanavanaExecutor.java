class UdyanavanaExecutor{

public static void main(String park[]){
String flowers1[] = {"Roses","Tulips","Daisies","Orchids","Daffodils"};
String flowers2[] = {"Orchids","Lilies","Sunflower","Peony","Hibiscus"};
String flowers3[] = {"Lavender","Marigold","Chrysanthemun","Iris","Hydrangea"};
String flowers4[] = {"Violet","Azalea","Dahlia","Camellia","Daisy"};
String flowers5[] = {"Pansy","Petunia","Freesia","Gernium","Crocus"};
Udyanavana park1 = new Udyanavana(1,"Green Paradise","City Center",flowers1,"8AM","6Pm",5);
Udyanavana park2 = new Udyanavana(2,"Floral Oasis","Suburban Area",flowers2,"9AM","7PM",6);
Udyanavana park3 = new Udyanavana(3,"Botanic Gardens","Country Area",flowers3,"10AM","7PM",8);
Udyanavana park4 = new Udyanavana(4,"Tropical Haven","Coastal Area",flowers4,"11AM","6:30PM",10);
Udyanavana park5 = new Udyanavana(5,"Blossom Park","Mountain Retreat",flowers5,"7AM","6PM",9);
park1.displayDetails();
System.out.println("Next Object is :");
park2.displayDetails();
System.out.println("Next Object is :");
park3.displayDetails();
System.out.println("Next Object is :");
park4.displayDetails();
System.out.println("Next Object is :");
park5.displayDetails();
}
}