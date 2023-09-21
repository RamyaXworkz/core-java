class Interior{

String materialNames[] = new String[10];
int index;

public boolean addMaterialName(String materialName){
System.out.println("invoked addMaterialName()");
boolean isAdded = false;
if(index< materialNames.length){
if(materialName != null){
	boolean exist =  checkIfMaterialNameExist(materialName);
	if(exist == false){
System.out.println("validation is proper.. proceed to add material name");
materialNames[index]= materialName;
index++;
isAdded  = true;
System.out.println(materialName+" is got added successfully!!");
}
else{
	System.out.println(materialName+" Material name already exist .. please add other");
}
}
}
else {
System.out.println("Array index out of bound Exception");
}
return isAdded;
}
 public void  getMaterialNames(){
System.out.println("List Of Materials are: ");
for(int index = 0;index <materialNames.length; index++){

System.out.println(materialNames[index]);

}
}

public boolean checkIfMaterialNameExist(String materialName){
	System.out.println("Invoked checkIfMaterialNameExist");
	boolean exist = false;
	
	for(int index = 0;index < materialNames.length; index++){
    if(materialNames[index] ==  materialName){
	exist = true;
}
}
return exist;
}

public String searchByMaterialName(String materialName){
	System.out.println("Invoked checkIfMaterialNameExist");
	String mName = null;
	
	for(int index = 0;index < materialNames.length; index++){
    if(materialNames[index] ==  materialName){
	mName = materialNames[index];
}
}
return mName;
}
String materialNamesAfterDelete [] = new String[materialNames.length-1];

public boolean deleteBy( String name){
	
	boolean isDeleted = false;
	
	
	int ind = 0;
	
for(int index = 0;index < materialNames.length; index++){
	
	if(materialNames[index] != name){
		
		materialNamesAfterDelete[ind++] = materialNames[index];
		isDeleted = true;
	}
}

return isDeleted;
}

 public void getDeletedmaterialNames(){
	System.out.println("List of songs After deleted are : ");
	for(int index = 0; index< materialNamesAfterDelete.length ; index++){
		
		System.out.println(materialNamesAfterDelete[index]);

}
}
}
