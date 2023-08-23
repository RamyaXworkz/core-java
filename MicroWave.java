class MicroWave{
static boolean isConnected;
static int minHeat ;
static int maxHeat = 60 ;
static int currentHeat ;
public static boolean onOrOff(){
System.out.println("Starting of the onOrOff");
if(isConnected == false){
	isConnected = true;
System.out.println("The MicroWave is turned On...");
}else if (isConnected == true){
	isConnected = false;
System.out.println("The MicroWave is turned off");
}
System.out.println("End of the onOrOff");
return isConnected;
}
public static void increaseHeat(){
	System.out.println("Start of increaseHeat");
	if(isConnected==true){
		
			if(currentHeat < maxHeat){
			currentHeat = currentHeat +1;
		System.out.println("The currentHeat is "+currentHeat);
		}else{
			System.out.println("MicroWave reached maxHeat");
		}
	
	}else{
    	System.out.println("Turn on the MicroWave");
	}	
}
public static void decreaseHeat(){
	System.out.println("Start of decreaseHeat");
	if(isConnected==true){
		
			if(currentHeat > minHeat){
			currentHeat = currentHeat -1;
		System.out.println("The currentHeat is "+currentHeat);
		}else{
			System.out.println("MicroWave reached minHeat");
		}
	
	}else{
    	System.out.println("Turn on the MicroWave");
	}	
}
}
