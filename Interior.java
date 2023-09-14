class Interior{

String materialNames[] = new String[10];
int index;

public boolean addMaterialName(String materialName){
System.out.println("invoked addMaterialName()");
boolean isAdded = false;
if(materialName != null){
System.out.println("validation is proper.. proceed to add material name");
materialNames[index]= materialName;
index++;
isAdded  = true;
System.out.println(materialName+"is got added successfully!!");
}
return isAdded;
}
 public void  getMaterialNames(){
System.out.println("List Of Materials are: ");
for(int index = 0;index <materialNames.length; index++){

System.out.println(materialNames[index]);

}
}
}
