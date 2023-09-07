class BankExecutor{

public static void main(String arg[]){

Bank bank = new Bank();
bank.setBankId(1);
bank.getBankId();
System.out.println("The Bank Id is : "+bank.getBankId());
bank.setBankName("Canara Bank");
bank.getBankName();
System.out.println("The Bank Name is : "+bank.getBankName());
bank.setBranchName("Hassan");
bank.getBranchName();
System.out.println("The Branch Name is : "+bank.getBranchName());
bank.setIfccode("CB0127");
bank.getIfccode();
System.out.println("The Branch Name is : "+bank.getIfccode());
bank.setManagerName("Manohar");
bank.getManagerName();
System.out.println("The Manager Name is : "+bank.getManagerName()); 
bank.setNoOfEmployees(20);
bank.getNoOfEmployees();
System.out.println("The Manager Name is : "+bank.getNoOfEmployees()); 
bank.setMifcCode("mh2923");
bank.getMifcCode();
System.out.println("The MIFC code of the canara bank is : "+bank.getMifcCode());
}
}
