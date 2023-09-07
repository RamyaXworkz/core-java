class PatientExecutor{

public static void main(String arg[]){

Patient patient = new Patient();
patient.setPatientId(1);
patient.getPatientId();
System.out.println("The patient Id is : "+patient.getPatientId());

patient.setPatientName("Ramya");
patient.getPatientName();
System.out.println("The patient Name is : "+patient.getPatientName());

patient.setAge(22);
patient.getAge();
System.out.println("The patient age is : "+patient.getAge());

patient.setWardNo(14);
patient.getWardNo();
System.out.println("The patient Ward No is : "+patient.getWardNo());

patient.setDieaseName("Kemmu");
patient.getDieaseName();
System.out.println("The patient Diease name is : "+patient.getDieaseName());

patient.setAdmittedDate("07-01-2024");
patient.getAdmittedDate();
System.out.println("The patient Admitted was is : "+patient.getAdmittedDate());

patient.setHospitalName("Govt Hospital");
patient.getHospitalName();
System.out.println("The Hospital Name is : "+patient.getHospitalName());

patient.setConsultantDoctor("Dr.P.Amar");
patient.getConsultantDoctor();
System.out.println("The patient as to Consult the Doctor is : "+patient.getConsultantDoctor());

patient.setGender("Female");
patient.getGender();
System.out.println("The patient gender is : "+patient.getGender());

}
}