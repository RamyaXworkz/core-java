class Exam {

HallTicket ticket;
int fees ;

public Exam(HallTicket ticket){
	
	this.ticket = ticket;
	
}

public boolean write(){
 
 boolean isAllowed =false;
if(fees >= 1200){
  System.out.println("Fees is paid proceed to allow HallTicket");
    if(ticket != null){
	 
	 this.ticket.display();
	 isAllowed = true;
 System.out.println("Details are found ...Allow the candidate to write exam....");
}
 else{
 System.out.println("Exam details are not foud");
 }
}
 else{
 System.out.println("Pay the fees to get HallTicket");
 
 }
 return isAllowed;
 }
 }


