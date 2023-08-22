class EatSureExecutor1{
public static void main(String foodDelivery[]){
System.out.println("main started");
double cost = EatSure.look("Paneer Makhmali");
System.out.println("The Price for Paneer Makhmali is "+cost);
double costWithQuantity = EatSure.look("Paneer Makhmali",3);
System.out.println("The Price for Paneer Makhmali is "+costWithQuantity);
System.out.println("Main Ended");
}
}