class ZeptoExecutor{
public static void main(String foodDelivery[]){
System.out.println("main started");
double cost = Zepto.look("Coconut Rice");
System.out.println("The Price for Coconut Rice is "+cost);
double costWithQuantity = Zepto.look("Coconut Rice",7);
System.out.println("The Price for Coconut Rice  with Quantityis "+costWithQuantity);
System.out.println("Main Ended");
}
}