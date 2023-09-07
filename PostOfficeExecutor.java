class PostOfficeExecutor{

public static void main(String arg[]){

PostOffice post = new PostOffice();
post.setPostOfficeId(1);
post.getPostOfficeId();
System.out.println("The PostOffice id is : "+post.getPostOfficeId());
post.setPostOfficeName("Indian Post Office");
post.getPostOfficeName();
System.out.println("The PostOffice name is : "+post.getPostOfficeName());
post.setNoOfMailBoxes(16);
post.getNoOfMailBoxes();
System.out.println("The No of Mail Boxes are : "+post.getPostOfficeId());
post.setRevenue(1000.00);
post.getRevenue();
System.out.println("The  Revenue from PostOffice is : "+post.getRevenue());
post.setNoOfPostman(8);
post.getNoOfPostman();
System.out.println("The No Of PostMans in PostOffice are : "+post.getPostOfficeId());
}
}