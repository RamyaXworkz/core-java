class DunzoExecutor{
public static void main(String foodDelivery[]){
System.out.println("main started");
double cost = Dunzo.look("Avakaya pappu");
System.out.println("The Price for Avakaya pappu is "+cost);
double costWithQuantity = Dunzo.look("Avakaya pappu",8);
System.out.println("The Price for Avakaya pappu is "+costWithQuantity);
System.out.println("Main Ended");
}
}