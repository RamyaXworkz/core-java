class Passport{
static
String passportOfficce;
String givenName;
String surName;
String dob;
String email;
String password;
String confirmpassword;

public boolean check(String password , String confirmPassword){
	
boolean ispasswordVerified = false;
System.out.println(password.length());
if(password.length()>=8 && password.length()<=16){
if(password == confirmPassword){
	ispasswordVerified = true;
	System.out.println("You Verified Succesfully...please proced forther!!");
	displyUserDetails();
}
else{
System.out.println("You have entered wrong password please try again");
}
}
else {
	System.out.println("The length of the password is not maching");
}
return ispasswordVerified;
}
public void displyUserDetails(){
System.out.println("The Passport Office is : "+passportOfficce);
System.out.println("The Given name is :  "+givenName);
System.out.println("The Sur  name is : "+surName);
System.out.println("The Date of Birth is : "+dob);
System.out.println("The  email id is :"+email);
System.out.println("The password is :"+password);
}
}
