class Speaker{
static boolean isConnected;
static int minVolume;
static int maxVolume = 6;
static int currentVolume;
public static boolean onOrOff(){
System.out.println("Starting of the onOrOff");
if(isConnected == false){
	isConnected = true;
System.out.println("The Speaker is turned On...");
}else if (isConnected == true){
	isConnected = false;
System.out.println("The System is turned off");
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
			System.out.println("speaker reached MaxVolume");
		}
	
	}else{
    	System.out.println("Turn on the Speaker");
	}	
}
public static void decreaseVolume(){
	System.out.println("Start of decreaseVolume");
	if(isConnected==true){
		
			if(currentVolume > minVolume){
			currentVolume = currentVolume -1;
		System.out.println("The currentVolume is "+currentVolume);
		}else{
			System.out.println("speaker reached MinVolume");
		}
	
	}else{
    	System.out.println("Turn on the Speaker");
	}	
}
}