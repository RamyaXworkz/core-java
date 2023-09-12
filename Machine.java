class Machine{

public void perform(String name,String brand,int paperCapacity,boolean isWifiEnabled,boolean iscolorPrinter){
System.out.println("Invoked perform");

System.out.println("Machine  type is : "+ name);

System.out.println("Machine  brand  is : "+ brand);

System.out.println("Paper capacity is : "+ paperCapacity);

System.out.println("Wifi access is : "+ isWifiEnabled);

System.out.println("Is it print color papers : "+ iscolorPrinter);

System.out.println("End of perform");
}
}