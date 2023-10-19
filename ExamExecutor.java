class ExamExecutor{

public static void main(String vtuExam[]){

HallTicket ticket = new HallTicket(12346, "19ec801" ,"Multimedia","4MC19EC022"," G RAMYA");


//HallTicket ticket = null;
Exam exam = new Exam(ticket);

exam.fees = 1300;

exam.write();

}
}