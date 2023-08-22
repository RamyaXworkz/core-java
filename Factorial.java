class Factorial{
public static void main(String fact[]){
 getFact(2);
 getFact(3);
 getFact(4);
 getFact(5);
 getFact(6);
 getFact(7);
 getFact(8);
 getFact(9);
 }
 public static void getFact(int factNumber){
int dummy = 1;
for(int factNum = 1;factNum <= factNumber ; factNum++){
dummy = dummy * factNum;
 }
 System.out.println("The Factorial of " + factNumber + " is " + dummy);
 }
}