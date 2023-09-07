class CustomerExecutor{

public static void main(String arg[]){

Customer coustomer = new Customer();
coustomer.setCustomerId(1);
coustomer.getCustomerId();
System.out.println("The coustomer id is : "+coustomer.getCustomerId());
coustomer.setCustomerName("Spandana");
coustomer.getCustomerName();
System.out.println("The coustomer Name is : "+coustomer.getCustomerName());
coustomer.setAddress("Hassan");
coustomer.getAddress();
System.out.println("The coustomer address is : "+coustomer.getAddress());
coustomer.setContactNumber(9353614188L);
coustomer.getContactNumber();
System.out.println("The coustomer address is : "+coustomer.getContactNumber());
coustomer.setDob("23-02-2001");
coustomer.getDob();
System.out.println("The coustomer Date of Birth is : "+coustomer.getDob());
coustomer.setEmail("anandaspandu@gmail.com");
coustomer.getEmail();
System.out.println("The coustomer Email  is : "+coustomer.getEmail());
coustomer.setGender("Female");
coustomer.getGender();
System.out.println("The coustomer Gender is : "+coustomer.getGender());
}
}