class ClothCompany{

public void sellCloth(String brand,String clothTypes[]){

System.out.println("Invoked sellCloth");
System.out.println(brand);
System.out.println("Types of cloths are : ");
for(int num=0 ;num<clothTypes.length;num++){
System.out.println(clothTypes[num]);
}
System.out.println("End of sellCloth");
}
}