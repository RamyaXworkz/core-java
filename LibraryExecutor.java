class LibraryExecutor{

public static void main(String pustaka[]){
String book1[] = {"Jane Eyre","To kill a Mockinbird","The Great Gatsby","Lolita","The Catcher in the Rye"};
String book2[] = {"Nineteen Eighty-Four","Wuthering Heights","The Adventures of Huckleberry Finn","Anna Karenina","Pride and Prejudice"};
String book3[] = {"Emma","Catch-22","Ulysses","Brave New World","Frankenstein","Moby-Dick"};
String book4[] = {"Beloved","The Lord Of the Rings","The Grapes of Wrath","David Copperfield","Charlotte's Web"};
String book5[] = {"one Hundred Years of Solitude","middlemarch"};
String typesOfLanguages[] = {"Kannada","English","Hindi","Marati","Telugu","Maliyalum","Urdu","Gujarathi"};


Library pustaka1 = new Library();
pustaka1.getDetails();
System.out.println("Next Object is :");

Library pustaka2 = new Library("central library of hasan","hassan","Melvin Dewey",8789237328L,book2,typesOfLanguages);
pustaka2.getDetails();
System.out.println("Next Object is :");

Library pustaka3 = new Library("Library of congress","Banglore","Anne Beth Martin",6360792693L,book3,typesOfLanguages);
pustaka3.getDetails();
System.out.println("Next Object is :");

Library pustaka4 = new Library("British Library","Delhi","Allie Beth Martin",8143287723L,book4,typesOfLanguages);
pustaka4.getDetails();
System.out.println("Next Object is :");

Library pustaka5 = new Library("New york Public library","New York","Camila Alire",9173288743L,book5,typesOfLanguages);
pustaka5.getDetails();



}
}