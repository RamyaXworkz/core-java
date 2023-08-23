class Telivision{
static boolean isConnected;
static int minVolume;
static int maxVolume = 100;
static int currentVolume;
public static boolean onOrOff(){
System.out.println("Starting of the onOrOff");
if(isConnected == false){
	isConnected = true;
System.out.println("The Telivision is turned On...");
}else if (isConnected == true){
	isConnected = false;
System.out.println("The Telivision is turned off");
}
System.out.println("End of the onOrOff");
return isConnected;
}
public static void increaseVolume(){
	System.out.println("Start of increaseVolume");
	if(isConnected==true){
		
			if(currentVolume < maxVolume){
			currentVolume = currentVolume +1;
		System.out.println("The currentVolume is "+currentVolume);
		}else{
			System.out.println("Telivision reached MaxVolume");
		}
	
	}else{
    	System.out.println("Turn on the Telivision");
	}	
}
public static void decreaseVolume(){
	System.out.println("Start of decreaseVolume");
	if(isConnected==true){
		
			if(currentVolume > minVolume){
			currentVolume = currentVolume -1;
		System.out.println("The currentVolume is "+currentVolume);
		}else{
			System.out.println("Telivision reached MinVolume");
		}
	
	}else{
    	System.out.println("Turn on the Telivision");
	}	
}
}
