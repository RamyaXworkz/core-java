class AcTemperature{
static boolean isConnected;
static int minTemp = 24;
static int maxTemp = 60 ;
static int currentTemp =24;
public static boolean onOrOff(){
System.out.println("Starting of the onOrOff");
if(isConnected == false){
	isConnected = true;
System.out.println("The Ac is turned On...");
}else if (isConnected == true){
	isConnected = false;
System.out.println("The Ac is turned off");
}
System.out.println("End of the onOrOff");
return isConnected;
}
public static void increaseTemp(){
	System.out.println("Start of increaseTemp");
	if(isConnected==true){
		
			if(currentTemp < maxTemp){
			currentTemp = currentTemp +1;
		System.out.println("The currentTemp is "+currentTemp);
		}else{
			System.out.println("Ac reached MaxTemp");
		}
	
	}else{
    	System.out.println("Turn on the Ac");
	}	
}
public static void decreaseTemp(){
	System.out.println("Start of decreaseTemp");
	if(isConnected==true){
		
			if(currentTemp > minTemp){
			currentTemp = currentTemp -1;
		System.out.println("The currentTemp is "+currentTemp);
		}else{
			System.out.println("Ac reached MinTemp");
		}
	
	}else{
    	System.out.println("Turn on the Ac");
	}	
}
}
