class LensKartExecutor{
public static void main(String eye[]){

LensKart lenskart1 = new LensKart();
lenskart1.lensKartID = 45735;
lenskart1.lenstype = "Eye Glasses";
lenskart1.lensPrize = 1500;
lenskart1.frameColour = "Blue";
lenskart1.frameSize = "large";
lenskart1.vision ();
System.out.println("LensKart Id is "+lenskart1.lensKartID );
System.out.println("Lens type  is "+lenskart1.lenstype );
System.out.println("Lens prize is "+lenskart1.lensPrize );
System.out.println("Frame color is "+lenskart1.frameColour );
System.out.println("Frame  size is "+lenskart1.frameSize );

System.out.println(
	
	"-----------------------------------------------------------------------------------------------------------");


LensKart lenskart2 = new LensKart();
lenskart2.lensKartID = 5783;
lenskart2.lenstype = "Sun Glasses";
lenskart2.lensPrize = 500;
lenskart2.frameColour = "Black";
lenskart2.frameSize = "small";
lenskart2.vision();
System.out.println("LensKart Id is "+lenskart2.lensKartID );
System.out.println("Lens type  is "+lenskart2.lenstype );
System.out.println("Lens prize is "+lenskart2.lensPrize );
System.out.println("Frame color is "+lenskart2.frameColour );
System.out.println("Frame  size is "+lenskart2.frameSize );

System.out.println(
	
	"-----------------------------------------------------------------------------------------------------------");

LensKart lenskart3 = new LensKart();
lenskart3.lensKartID = 57937;
lenskart3.lenstype = "Computer Glasses";
lenskart3.lensPrize = 1200;
lenskart3.frameColour = "Blue";
lenskart3.frameSize = "Medium";
lenskart3.vision();
System.out.println("LensKart Id is "+lenskart3.lensKartID );
System.out.println("Lens type  is "+lenskart3.lenstype );
System.out.println("Lens prize is "+lenskart3.lensPrize );
System.out.println("Frame color is "+lenskart3.frameColour );
System.out.println("Frame  size is "+lenskart3.frameSize );

System.out.println(
	
	"-----------------------------------------------------------------------------------------------------------");
	
LensKart lenskart4 = new LensKart();
lenskart4.lensKartID = 79463;
lenskart4.lenstype = "Power Glasses";
lenskart4.lensPrize = 2000;
lenskart4.frameColour = "Light grey";
lenskart4.frameSize = "Medium";
lenskart4.vision();
System.out.println("LensKart Id is "+lenskart4.lensKartID );
System.out.println("Lens type  is "+lenskart4.lenstype );
System.out.println("Lens prize is "+lenskart4.lensPrize );
System.out.println("Frame color is "+lenskart4.frameColour );
System.out.println("Frame  size is "+lenskart4.frameSize );

System.out.println(
	
	"-----------------------------------------------------------------------------------------------------------");

LensKart lenskart5 = new LensKart();
lenskart5.lensKartID = 67489;
lenskart5.lenstype = "Kids Glasses";
lenskart5.lensPrize = 2500;
lenskart5.frameColour = "Sand Dune";
lenskart5.frameSize = "Suited for 8- 12 yrs";
lenskart5.vision();
System.out.println("LensKart Id is "+lenskart5.lensKartID );
System.out.println("Lens type  is "+lenskart5.lenstype );
System.out.println("Lens prize is "+lenskart5.lensPrize );
System.out.println("Frame color is "+lenskart5.frameColour );
System.out.println("Frame  size is "+lenskart5.frameSize );
}
}