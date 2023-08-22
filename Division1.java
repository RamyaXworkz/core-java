class Division1{
public static void main(String div[]){
 
double total1 = div(10,5);
double total2 = div(21,14);
double total3 = div(8,2);
double total4 = div(14,7);
double total5 = div(21,7);
double total11 = div(10,5,5);
double total22 = div(21,14,7);
double total33 = div(8,4,2);
double total44 = div(14,28,7);
double total55 = div(49,21,7);
}
public static double div(int a,int b){
double total = 0.0;
System.out.println("Division Of Two Numbersis : ");
System.out.println(a/b);
return total;
}
public static double div(int a,int b,int c){
double total = 0.0;
System.out.println("Division Of Three Numbersis : ");
System.out.println(a/b/c);
return total;
}
}