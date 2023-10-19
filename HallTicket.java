class HallTicket{

int hallTicketNo;

String subjectCode;

String subjectName;

String usnNo;

String candidateName;


public HallTicket(int hallTicketNo , String subjectCode , String subjectName , String usnNo, String candidateName){

this.hallTicketNo = hallTicketNo;
this.subjectCode = subjectCode;
this.subjectName = subjectName ;
this.usnNo = usnNo;
this.candidateName = candidateName;
}


public void display(){


System.out.println("Details of the Candidates are : ");
System.out.println("HallTicket no is : "+this.hallTicketNo);
System.out.println("subject code is : "+this.subjectCode);
System.out.println("subject name is : "+this.subjectName);
System.out.println("candidate Name is : "+this.candidateName);
System.out.println("candidate Usn  no is : "+this.usnNo);

}
}




