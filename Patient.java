public class Patient{
private int patientId;
private String patientName;
private int age;
private String dieaseName;
private int wardNo;
private String admittedDate;
private String hospitalName;
private String gender;
private String consultantDoctor;

public void setPatientId(int patientId){
this.patientId = patientId;
}
public int getPatientId(){
return patientId;
}

public void setPatientName(String patientName){
this.patientName = patientName;
}
public String getPatientName(){
return patientName;
}

public void setAge(int age){
this.age = age;
}
public int getAge(){
return age;
}

public void setWardNo(int wardNo){
this.wardNo = wardNo;
}
public int getWardNo(){
return wardNo;
}

public void setDieaseName(String dieaseName){
this.dieaseName = dieaseName;
}
public String getDieaseName(){
return dieaseName;
}

public void setAdmittedDate(String admittedDate){
this.admittedDate = admittedDate;
}
public String getAdmittedDate(){
return admittedDate;
}







public void setHospitalName(String hospitalName){
this.hospitalName = hospitalName;
}
public String getHospitalName(){
return hospitalName;
}


public void setConsultantDoctor(String consultantDoctor){
this.consultantDoctor = consultantDoctor;
}
public String getConsultantDoctor(){
return consultantDoctor;
}

public void setGender(String consultantDoctor){
this.consultantDoctor = consultantDoctor;
}
public String getGender(){
return consultantDoctor;
}
}