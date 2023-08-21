class SuperMarket{
static String chocolates[] = {"Dairy Milk","Milky Bar","Park","Dark Chocolate","CadBerry","Kit-Kat","Temper","Snickers","Twix","Godiva","Toblerone","Hershey","Mars","Aero"};
static String vegitables[] = {"Tomato","Okra","Onion","Peas","Potato","Celery","Chilli","Ginger","Spinach","Radish","Corn","ZuCChini","Eggplant","Turnip","Bell Pepper"};
static String fruits[] = {"Red Currant","Tamarind","Grapes","Satsuma","Pineapple","Raspberry","Pumpkin","Plum","Sweeet Lemon","Guava","Lemon","Kiwi","Dates","Mango"};
static String soaps[] = {"Dove","Fiama Di wills","Santoor","Lux","Niveaa","Salvon","Park Avenue","Cintol","mamaearth","Biotique","Tetmosol","Medimix","Himalaya","Mysore Sandal","Neem"};
static String perfumes[] = {"Chanel","coco Mademoiselle","Gucci","Flora","Estee Lauder","Tom Ford","YSL Opium","Armani","Calvin Klein","Dior","Blu Atlas Atlantis","Byredo","Hugo Boss","Creed","Guess"};
static String grocerys[] = {"Beans","Grains","Pasta","Nuts","Dried fruit","Meat for freezing","Butter","oil","Eggs","Bread","Condiments","Rice","Soups","Salad Designers","Canned Goods"};
static String sauces[] = {"Mint Sauce","Cranberry Sauce","Hollandaise Sauce","Tartare Sauce","Mayonnaise","Caesar salad ","Chunky Tomato Salsa","Garlic dipping sauce","Brown sauce","Butter Sauce","Fish Sauce","Green sauce","Hot sauce","MEat sauce","Emulsified sauce"};
static String biscuits[] = {"Britania","Parle","Cadbury","Oreo","Sunfeast","Good Day","MOM's Magic","50-50","Chaska Maska","Dark Fantacy","HI-FI","Hide&Seek","Marrie Gold","Threptin","Belvita"};
static String milkItems[] = {"Milk","Butter","Ice Cream","Curd","Lassi","Paneer","ButterMilk","Ghee","Milk Powder","Yogurt","Custard Milk","Cream","Kulfi","Chees","MilkShakes"};
static String snacks[] = {"Mixtures","Samosa","Cookies","Pop-Tarts","Chips","MIxed Fruit","Photato Vhips","Popcorn","Fruit Snacks","Pretzels","Granola Bars","Chocolate Bar","Nachos","Gummy Bears","Cereal"};
public static void main(String market[]){
	System.out.println("Main method started");
	getChocolates();
	getReversChocolates();
	System.out.println("------------------------------------------------------------------------------------------------------------------------");
	getVegitables();
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	getReverseVegitables();
	System.out.println("------------------------------------------------------------------------------------------------------------------------");
	getFruits();
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	getReverseFruits();
	System.out.println("------------------------------------------------------------------------------------------------------------------------");
	getSoaps();
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	getReverseSoaps();
	System.out.println("------------------------------------------------------------------------------------------------------------------------");
	getPerfumes();
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	getReversePerfumes();
	System.out.println("------------------------------------------------------------------------------------------------------------------------");
	getGrocerys();
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	getReverseGrocerys();
	System.out.println("------------------------------------------------------------------------------------------------------------------------");
	getSauces();
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	getReverseSauces();
	System.out.println("------------------------------------------------------------------------------------------------------------------------");
	getBiscuits();
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	getReverseBiscuits();
	System.out.println("------------------------------------------------------------------------------------------------------------------------");
	getMilkItems();
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	getReverseMilkItems();
	System.out.println("------------------------------------------------------------------------------------------------------------------------");
	getSnacks();
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	getReverseSnacks();
	System.out.println("Main methid ended");
}
public static void getChocolates(){
	System.out.println("Invoked search Method: String(element) ");
	System.out.println("The List of Chocolates are : ");
	System.out.println("length of the Chocolates are : "+chocolates.length); 
	for(int item = 0;item<chocolates.length ; item++){
	System.out.println(chocolates[item]);
	}
	System.out.println("End of the Search method");
}
 public static void getReversChocolates(){
	System.out.println("Invoked search Method: String(element) ");
	System.out.println("Reversing the list of chocolates are: ");
	for(int item =chocolates.length-1;item>0 ; item--){
	System.out.println(chocolates[item]);
	}
	System.out.println("End of the Search method");
}

 public static void getVegitables(){
	System.out.println("Invoked search Method: String(element) ");
	System.out.println("The List of vegitables are : ");
	System.out.println("length of the vegitables are : "+vegitables.length);
	for(int item = 0;item<vegitables.length ; item++){
	System.out.println(vegitables[item]);
	}	
	System.out.println("End of the Search method");
 }	
 public static void getReverseVegitables(){
	System.out.println("Invoked search Method: String(element) ");
	System.out.println("Reversing the list of vegitables are: ");
	for(int item =vegitables.length-1;item>0 ; item--){
	System.out.println(vegitables[item]);
	}
	System.out.println("End of the Search method");
}
public static void getFruits(){
	System.out.println("Invoked search Method: String(element) ");
	System.out.println("The List of  fruits are : ");
	System.out.println("length of the fruits are : "+fruits.length);
	for(int item = 0;item<fruits.length ; item++){
	System.out.println(fruits[item]);
	}
	System.out.println("End of the Search method");
}
public static void getReverseFruits(){
	System.out.println("Invoked search Method: String(element) ");
	System.out.println("Reversing the list of fruits are: ");
	for(int item =fruits.length-1;item>0 ; item--){
	System.out.println(fruits[item]);
	}
	System.out.println("End of the Search method");
}
public static void getSoaps(){
	System.out.println("Invoked search Method: String(element) ");
	System.out.println("The List of soaps are : ");
	System.out.println("length of the soaps are : "+soaps.length);
	for(int item = 0;item<soaps.length ; item++){
	System.out.println(soaps[item]);
	}
	System.out.println("End of the Search method");
}
public static void getReverseSoaps(){
	System.out.println("Invoked search Method: String(element) ");
	System.out.println("Reversing the list of soaps are: ");
	for(int item =soaps.length-1;item>0 ; item--){
	System.out.println(soaps[item]);
	}
	System.out.println("End of the Search method");
}
public static void getPerfumes(){
	System.out.println("Invoked search Method: String(element) ");
	System.out.println("The List of  perfumes are : ");
	System.out.println("length of the erfumes are : "+perfumes.length);
	for(int item = 0;item<perfumes.length ; item++){
	System.out.println(perfumes[item]);
	}
	System.out.println("End of the Search method");
}
public static void getReversePerfumes(){
	System.out.println("Invoked search Method: String(element) ");
	System.out.println("Reversing the list of perfumes are: ");
	for(int item =perfumes.length-1;item>0 ; item--){
	System.out.println(perfumes[item]);
	}
	System.out.println("End of the Search method");
}
public static void getGrocerys(){
	System.out.println("Invoked search Method: String(element) ");
	System.out.println("The List of grocerys are : ");
	System.out.println("length of the grocerys are : "+grocerys.length);
	for(int item = 0;item<grocerys.length ; item++){
	System.out.println(grocerys[item]);
	}
	System.out.println("End of the Search method");
}
public static void getReverseGrocerys(){
	System.out.println("Invoked search Method: String(element) ");
	System.out.println("Reversing the list of grocerys are: ");
	for(int item =grocerys.length-1;item>0 ; item--){
	System.out.println(grocerys[item]);
	}
	System.out.println("End of the Search method");
}
public static void getSauces(){
	System.out.println("Invoked search Method: String(element) ");
	System.out.println("The List of sauces are : ");
	System.out.println("length of the sauces are : "+sauces.length);
	for(int item = 0;item<sauces.length ; item++){
	System.out.println(sauces[item]);
	}
	System.out.println("End of the Search method");
}
public static void getReverseSauces(){
	System.out.println("Invoked search Method: String(element) ");
	System.out.println("Reversing the list of sauces are: ");
	for(int item =sauces.length-1;item>0 ; item--){
	System.out.println(sauces[item]);
	}
	System.out.println("End of the Search method");
}
public static void getBiscuits(){
	System.out.println("Invoked search Method: String(element) ");
	System.out.println("The List of  biscuits are : ");
	System.out.println("length of the biscuits are : "+biscuits.length);
	for(int item = 0;item<biscuits.length ; item++){
	System.out.println(biscuits[item]);
	}
	System.out.println("End of the Search method");
}
public static void getReverseBiscuits(){
	System.out.println("Invoked search Method: String(element) ");
	System.out.println("Reversing the list of biscuits are: ");
	for(int item =biscuits.length-1;item>0 ; item--){
	System.out.println(biscuits[item]);
	}
	System.out.println("End of the Search method");
}
public static void getMilkItems(){
	System.out.println("Invoked search Method: String(element) ");
	System.out.println("The List of milkItems are : ");
	System.out.println("length of the milkItems are : "+milkItems.length);
	for(int item = 0;item<milkItems.length ; item++){
	System.out.println(milkItems[item]);
	}
	System.out.println("End of the Search method");
}
public static void getReverseMilkItems(){
	System.out.println("Invoked search Method: String(element) ");
	System.out.println("Reversing the list of milkItems are: ");
	for(int item =milkItems.length-1;item>0 ; item--){
	System.out.println(milkItems[item]);
	}
	System.out.println("End of the Search method");
}
public static void getSnacks(){
	System.out.println("Invoked search Method: String(element) ");
	System.out.println("The List of snacks are : ");
	System.out.println("length of the snacks are : "+snacks.length);
	for(int item = 0;item<snacks.length ; item++){
	System.out.println(snacks[item]);
	System.out.println("End of the Search method");
}
}
public static void getReverseSnacks(){
	System.out.println("Invoked search Method: String(element) ");
	System.out.println("Reversing the list of snacks are: ");
	for(int item =snacks.length-1;item>0 ; item--){
	System.out.println(snacks[item]);
	}
	System.out.println("End of the Search method");
}
}