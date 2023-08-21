class Modulus1{
public static void main(String mod[]){
 
double total1 = mod(5,10);
double total2 = mod(14,21);
double total3 = mod(2,8);
double total4 = mod(7,14);
double total5 = mod(21,14);
double total6 = mod(7,12);
double total7 = mod(56,10);
double total8 = mod(78,82);
double total9 = mod(32,11);
double total10 = mod(7,21);
double total11 = mod(5,10,20);
double total22 = mod(14,21,2);
double total33 = mod(2,8,5);
double total44 = mod(7,14,2);
double total55 = mod(7,21,14);
double total66 = mod(5,10,30);
double total77 = mod(6,10,21);
double total88 = mod(19,22,11);
double total99 = mod(27,28,24);
double total110 = mod(34,18,46);
}
public static double mod(int a,int b){
double total = 0.0;
System.out.println("Modulus Of Two Numbersis : ");
System.out.println(a%b);
return total;
}
public static double mod(int a,int b,int c){
double total = 0.0;
System.out.println("Modulus Of Three Numbersis : ");
System.out.println(a%b%c);
return total;
}
}
