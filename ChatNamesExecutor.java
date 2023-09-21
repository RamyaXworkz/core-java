class ChatNamesExecutor{

public static void main(String chat[]){

PaniPoori chatName = new PaniPoori();

chatName.addChatName("Pani Poori");
chatName.addChatName("Masala Poori");
chatName.addChatName("Dahi Poori");
chatName.addChatName("Bhel Poori");
chatName.addChatName("Aloo CHat");
chatName.addChatName("Sev Puri");
chatName.addChatName("Aloo tikki");
chatName.addChatName("Gobi");
chatName.addChatName("Samosa Chat");
chatName.addChatName("Gobi");
chatName.addChatName("Momos");
chatName.getChatNames();

System.out.println("Searching Mania");
String cName = "Gobi";
System.out.println("Searching for the chat " + cName);
String materialNames =  chatName.searchByChatName(cName);
System.out.println("Thank You for searching " + cName);
boolean deletedChat = chatName.deleteBy("Sev Puri");
System.out.println("The Sev Puri chat is deleted "+ deletedChat);
chatName.getDeletedchatNames();
}
}