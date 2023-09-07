public class Customer{

private int customerId ;
private String customerName;
private String address;
private long contactNumber;
private String email;
private String dob;
private String gender;

public void setCustomerId(int customerId){
   this.customerId = customerId;
   }
public int getCustomerId(){
return customerId;
}


public void setCustomerName(String customerName){

this.customerName = customerName;
}
public String getCustomerName(){
return customerName;
}

public void setAddress(String address){
this.address = address;
}
public String getAddress(){
return address;
}


public void setContactNumber(long contactNumber){
this.contactNumber = contactNumber;
}
public long getContactNumber(){
return contactNumber;
}

public void setDob(String dob){
this.dob = dob;
}
public String getDob(){
return dob ;
}

public void setEmail(String email){
this.email = email;
}
public String getEmail(){
return email;
}

public void setGender(String gender){
this.gender = gender;
}
public String getGender(){
return gender;
}
}
