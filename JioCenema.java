class JioCenema{
static String teluguMovies[] = {"Rangasthalam","Sita Ramam","Kushi","RRR","Agent Sai Srinivasa Athreya","Evaru","Mahanati","Goodachari","Hit","Virupaksha","Karthikeya","Yashoda","Arjun Reddy","Magadheera","Baahubali","Arya","Athadu","Oopiri","Radhe Shyam","Brochevarevarura","Nuvvu Naaku Nacchav","Ante Sundaraniki","Ee Nagaraniki Emaindi","Gabbar Singh","Sudigaadu"};
public static void main(String jio[]){
System.out.println("Main Started");
System.out.println("The length of Movies are: "+teluguMovies.length);
System.out.println("The List Of Movies Are:");
for(int index=teluguMovies.length-1 ; index>=0 ; index--){
System.out.println(teluguMovies[index]);
}
System.out.println("Main Ended");
}
}