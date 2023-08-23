class Mixer{
static boolean isConnected;
static int minSpeed;
static int maxSpeed = 5;
static int currentSpeed;
public static boolean onOrOff(){
System.out.println("Starting of the onOrOff");
if(isConnected == false){
	isConnected = true;
System.out.println("The Mixer is turned On...");
}else if (isConnected == true){
	isConnected = false;
System.out.println("The Mixer is turned off");
}
System.out.println("End of the onOrOff");
return isConnected;
}
public static void increaseSpeed(){
	System.out.println("Start of increaseSpeed");
	if(isConnected==true){
		
			if(currentSpeed < maxSpeed){
			currentSpeed = currentSpeed +1;
		System.out.println("The currentSpeed is "+currentSpeed);
		}else{
			System.out.println("Mixer reached MaxSpeed");
		}
	
	}else{
    	System.out.println("Turn on the Mixer");
	}	
}

public static void decreaseSpeed(){
	System.out.println("Start of decreaseSpeed");
	if(isConnected==true){
		
			if(currentSpeed > minSpeed){
			currentSpeed = currentSpeed -1;
		System.out.println("The currentSpeed is "+currentSpeed);
		}else{
			System.out.println("Mixer reached MinSpeed");
		}
	
	}else{
    	System.out.println("Turn on the Mixer");
	}	
}
}