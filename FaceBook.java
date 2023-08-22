class FaceBook{
public static void main(String media[]){
login("ramyagajili@gmail.com","Ramya@22");
login(9353614188L,"Ramya@22");
}
public static void login(String email,String password){
System.out.println("invoked search : email(String),password(String)");
System.out.println("Please login  with the Email and Password");
System.out.println(email);
System.out.println(password);
System.out.println("end of seach");
}
public static void login(long phoneNumber,String password){
System.out.println("invoked search : phoneNumber(long),password(String)");
System.out.println("Please login with the phoneNumber and Password");
System.out.println(phoneNumber);
System.out.println(password);
System.out.println("end of seach");
}
}
