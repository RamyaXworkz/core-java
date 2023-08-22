class Multiplication{  
public static void main(String mul[]){
System.out.println("Main Started" );
//invocation of method; 5-first argument,5- second argument
getMul(5,5);
getMul(2,6);
getMul(75,55);
getMul(56,8);
getMul(24,8);
getMul(59,31);
getMul(73,37);
getMul(44,9);
getMul(34,7);
getMul(81,9);
getMul(722,5,6);
getMul(1,2,4);
getMul(7,14,8);
getMul(23,11,1);
getMul(27,28,9);
getMul(7,21,3);
getMul(14,6,2);
getMul(6,7,7);
getMul(19,16,2);
getMul(6,5,1);
System.out.println("Main ended." );
}
//method to multiply two numbers
public void getMul(int a,int b){
System.out.println("get mathod Started" );
System.out.println("Multiplication Of Two Numbers Is : " );
System.out.println(a*b);
System.out.println("get method ended." );
}
public void getMul(int a,int b,int c){
System.out.println("get mathod Started" );
System.out.println("Multiplication Of Three Numbers Is : " );
System.out.println(a*b*c);
System.out.println("get method ended." );
}
}