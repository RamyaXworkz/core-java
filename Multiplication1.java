class Multiplication1{
public static void main(String mul[]){
 
double  total1 = mul(10,5);
double total2 = mul(21,14);
double total3 = mul(8,2);
double total4 = mul(14,7);
double total5 = mul(21,7);
double total11 = mul(10,5,5);
double total22 = mul(21,14,7);
double total33 = mul(8,4,2);
double total44 = mul(14,28,7);
double total55 = mul(49,21,7);
}
public static double mul(int a,int b){
double total = 0.0;
System.out.println("Division Of Two Numbersis : ");
System.out.println(a*b);
return total;
}
public static double mul(int a,int b,int c){
double total = 0.0;
System.out.println("Multiplication Of Three Numbersis : ");
System.out.println(a*b*c);
return total;
}
}