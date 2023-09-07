class Zoo {
     String name;
     String diet;
     int age;
     String habitat;
     String color;
     
	 //when 2 or more constructor having the same constructor name but differ in type of parameter list in the same class is called constructor overloading.
	 
	 // static overloading,instance overloading
	 public Zoo(){
	//this() recursive constructor is not possible in java
	this("Lion", "Carnivore", 8, "Africa", "Golden");
		
	("Elephant", "Herbivore", 25, "Africa", "Gray");
		 
	 }
    public Zoo(String name, String diet, int age, String habitat, String color){
		//this();//it is called this method  is used to communicate one contructor to another constructor within the same class or called constructtor chain
		System.out.println("Paramertized constructor of Zoo is invoked");
        this.name = name;
        this.diet = diet;
        this.age = age;
        this.habitat = habitat;
        this.color = color;
    }
	
	public void getDisplay(){
	System.out.println("Welcome to the Zoo!");
        System.out.println("Animals in the Zoo:");
	
	System.out.println("Name of the Animal is : "+this.name);
		System.out.println("Diet plane for the animals in Zoo is  : "+this.diet);
			System.out.println("Age of the animal in Zoo : "+this.age);
				System.out.println("Habitat for animal in zoo : "+this.habitat);
					System.out.println(this.color);
					
    }
}	