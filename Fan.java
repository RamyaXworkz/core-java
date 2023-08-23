class Fan{
static boolean isConnected;
static int minSpeed;
static int maxSpeed = 5;
static int existentSpeed;
public static boolean onOrOff(){
System.out.println("Starting of the onOrOff");
if(isConnected == false){
	isConnected = true;
System.out.println("The Fan is turned On...");
}else if (isConnected == true){
	isConnected = false;
System.out.println("The Fan is turned off");
}
System.out.println("End of the onOrOff");
return isConnected;
}
public static void increaseSpeed(){
	System.out.println("Start of increaseSpeed");
	if(isConnected==true){
		
			if(existentSpeed < maxSpeed){
			existentSpeed = existentSpeed +1;
		System.out.println("The existentSpeed is "+existentSpeed);
		}else{
			System.out.println("Fan reached MaxSpeed");
		}
	
	}else{
    	System.out.println("Turn on the Fan");
	}	
}

public static void decreaseSpeed(){
	System.out.println("Start of decreasSpeed");
	if(isConnected==true){
		
			if(existentSpeed > minSpeed){
			existentSpeed = existentSpeed -1;
		System.out.println("The existentSpeed is "+existentSpeed);
		}else{
			System.out.println("Fan reached MinSpeed");
		}
	
	}else{
    	System.out.println("Turn on the Fan");
	}	
}
}