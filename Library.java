class Library{

String name;
String location;
String librarianName;
double contactNumber;
String books[];
String typesOfLanguages[];


String book1[] = {"Jane Eyre","To kill a Mockinbird","The Great Gatsby","Lolita","The Catcher in the Rye"};
String typesOfLanguages[] = {"Kannada","English","Hindi","Marati","Telugu","Maliyalum","Urdu","Gujarathi"};

public Library(){
	//String book1[] = {"Jane Eyre","To kill a Mockinbird","The Great Gatsby","Lolita","The Catcher in the Rye"};
	this("MCE library","hassan","Carla Hayden",9178266289L,book1,typesOfLanguages);
public Library(String name, String location,  String librarianName,
                   double contactNumber, String books[],String typesOfLanguages[]) {
        this.name = name;
        this.location = location;
        this.typesOfLanguages = typesOfLanguages;
        this.librarianName = librarianName;
        this.contactNumber = contactNumber;
        this.books = books;
    }
	
	public void getDetails(){
	System.out.println("Name of the Library is name : "+name);
	System.out.println("Location of the Library is : "+location);
	System.out.println("Librarian Contact Number is : "+contactNumber);
	System.out.println("Librarian Name is : "+librarianName);
	for(int num = 0;num < books.length;num++){
		System.out.println("Types Of Book in Library is : "+books[num]);
	}
	for(int num1 = 0;num1 <=typesOfLanguages.length-1 ;num1++){
	System.out.println("No of language books in Library is : "+typesOfLanguages[num1]);
	}
	System.out.println("No of language books in Library is : "+typesOfLanguages);
	}
	}
	