class ChatShop{

String chatNames[] = new String[10];
int index;

public boolean addChatName(String chatName){
System.out.println("invoked addChatName()");
boolean isAdded = false;
if(chatName != null){
System.out.println("validation is proper.. proceed to add chat name");
chatNames[index]= chatName;
index++;
isAdded  = true;
System.out.println(chatName+"is got added successfully!!");
}
return isAdded;
}
 public void  getChatNames(){
System.out.println("List Of chats are: ");
for(int index = 0;index <chatNames.length; index++){

System.out.println(chatNames[index]);

}
}
}
