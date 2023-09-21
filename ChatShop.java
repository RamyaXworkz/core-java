class ChatShop{

String chatNames[] = new String[10];
int index;

public boolean addChatName(String chatName){
System.out.println("invoked addChatName()");
boolean isAdded = false;

if(index <= chatNames.length-1){
if (chatName != null){
	boolean exist = checkIfChatNameExist(chatName);
	if (exist == false){
System.out.println("validation is proper.. proceed to add chat name");
chatNames[index]= chatName;
index++;
isAdded  = true;
System.out.println(chatName+" is got added successfully!!");
}
else{
	System.out.println(chatName+" Chat name already exist .. please add other");
}
}
}
else {
System.out.println("Array index out of bound Exception");
}

return isAdded;
}
 public void  getChatNames(){
System.out.println("List Of chats are: ");
for(int index = 0;index <chatNames.length; index++){

System.out.println(chatNames[index]);

}
}
public boolean checkIfChatNameExist(String chatName){
	System.out.println("Invoked checkIfChatNameExist");
	boolean exist = false;
	for(int index = 0;index < chatNames.length; index++){
if(chatNames[index] ==  chatName){
	exist = true;
}
}
return exist;
}

public String searchByChatName(String chatName){
	System.out.println("Invoked searchByChatName");
	String cName = null;
	for(int index = 0;index < chatNames.length; index++){
if(chatNames[index] ==  chatName){
	cName = chatNames[index];
}
}
return cName;
}
String chatNamesAfterDelete [] = new String[chatNames.length-1];

public boolean deleteBy( String name){
	
	boolean isDeleted = false;
	
	
	int ind = 0;
	
for(int index = 0;index < chatNames.length; index++){
	
	if(chatNames[index] != name){
		
		chatNamesAfterDelete[ind++] = chatNames[index];
		isDeleted = true;
	}
}

return isDeleted;
}

 public void getDeletedchatNames(){
	System.out.println("List of chats After deleted are : ");
	for(int index = 0; index< chatNamesAfterDelete.length ; index++){
		
		System.out.println(chatNamesAfterDelete[index]);

}
}

}



