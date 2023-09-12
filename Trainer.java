class Trainer{

public void train(String trainerName,String SkillsOfTrainer[] ,int expirence){
System.out.println("Invoked train");

System.out.println("Institute name is: "+trainerName);
System.out.println("Skills of Trainer have : ");
for(int num=0;num<SkillsOfTrainer.length;num++){
System.out.println(SkillsOfTrainer[num]);
}
System.out.println("expirence of trainer have is : "+expirence);
System.out.println("End of train");
}
}