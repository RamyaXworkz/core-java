class PassportExecutor{
public static void main(String arg[]){
Passport newUser = new Passport();
newUser.passportOfficce = "Bangalore";
newUser.givenName = "Ramya";
newUser.surName = "Gajili";
newUser.dob = "07-06-2001";
newUser.email = "ramyagajili@gmail.com";
newUser.password = "Ramya113";
newUser.confirmpassword = "Ramya22";

newUser.check(newUser.password,newUser.confirmpassword);
}
}