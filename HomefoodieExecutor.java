class HomefoodieExecutor{
public static void main(String foodDelivery[]){
System.out.println("main started");
double cost = Homefoodie.look("Samosa");
System.out.println("The Price for Samosa is "+cost);
double costWithQuantity = Homefoodie.look("Samosa",5);
System.out.println("The Price for Samosa is "+costWithQuantity);
System.out.println("Main Ended");
}
}