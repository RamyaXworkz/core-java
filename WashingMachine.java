class WashingMachine{
static boolean isConnected;
static int minWaterLevel;
static int maxWaterLevel = 5;
static int currentWaterLevel;
public static boolean onOrOff(){
System.out.println("Starting of the onOrOff");
if(isConnected == false){
	isConnected = true;
System.out.println("The WashingMachine is turned On...");
}else if (isConnected == true){
	isConnected = false;
System.out.println("The WashingMachine is turned off");
}
System.out.println("End of the onOrOff");
return isConnected;
}
public static void increaseWaterLevel(){
	System.out.println("Start of increaseWaterLevel");
	if(isConnected==true){
		
			if(currentWaterLevel < maxWaterLevel){
			currentWaterLevel = currentWaterLevel +1;
		System.out.println("The currentWaterLevel is "+currentWaterLevel);
		}else{
			System.out.println("WashingMachine reached MaxWaterLevel");
		}
	
	}else{
    	System.out.println("Turn on the WashingMachine");
	}	
}

public static void decreaseSWaterLevel(){
	System.out.println("Start of decreaseWaterLevel");
	if(isConnected==true){
		
			if(currentWaterLevel > minWaterLevel){
			currentWaterLevel = currentWaterLevel -1;
		System.out.println("The currentWaterLevel is "+currentWaterLevel);
		}else{
			System.out.println("WashingMachine reached MinWaterLevel");
		}
	
	}else{
    	System.out.println("Turn on the WashingMachine");
	}	
}
}