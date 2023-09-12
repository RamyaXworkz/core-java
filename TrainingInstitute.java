class TrainingInstitute{

public void train(String name,String skills[] ,int noOfStudents){

System.out.println("Invoked train");

System.out.println("Institute name is: "+name);
System.out.println("Skills are: ");
for(int num=0;num<skills.length;num++){
System.out.println(skills[num]);
}
System.out.println("No Of Students in institute are : "+noOfStudents);
System.out.println("End of train");
}
}