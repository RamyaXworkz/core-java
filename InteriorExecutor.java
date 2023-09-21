class InteriorExecutor{

public static void main(String song[]){

WoodDesign materialName = new WoodDesign();
materialName.addMaterialName("Wood");
materialName.addMaterialName("Glass");
materialName.addMaterialName("Marble");
materialName.addMaterialName("Tile");
materialName.addMaterialName("Textile");
materialName.addMaterialName("kallu");
materialName.addMaterialName("Metal");
materialName.addMaterialName("Ceramic");
materialName.addMaterialName("kallu");
materialName.addMaterialName("Plastic");
materialName.addMaterialName("marble");

materialName.getMaterialNames();


System.out.println("Searching Mania");
String mName = "kallu";
System.out.println("Searching for the material " + mName);
String materialNames =  materialName.searchByMaterialName(mName);
System.out.println("Thank You for searching " + mName);

boolean deletedmaterialName = materialName.deleteBy("kallu");
System.out.println("The kallu material is deleted "+ deletedmaterialName);
materialName.getDeletedmaterialNames();

}
}