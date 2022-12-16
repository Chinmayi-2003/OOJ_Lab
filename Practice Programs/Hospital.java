/*2.Develop a Java program to create a classPatient with data members pt_id, pt_name, pt_age, doc.
The program should include the following functionalities.
        Accept n patient details.
	Accept a patient id and display his/her details.
	Accept the name of the doctor and display the names of all the patients treated  by him/her. */

import java.util.Scanner;
class Patient{
 int ptId,ptAge;
 String ptName,doc;

 void PatientDetails(){ 
  System.out.println("Enter patient name,patient id,age and doctor's name");
  Scanner ss = new Scanner(System.in);
  ptName=ss.next();
  ptId=ss.nextInt();
  ptAge = ss.nextInt();
  doc=ss.next();
  }

  void dispPatient(int pid){
   if(ptId==pid){
   System.out.println("Patient ID : "+ptId+"\nName of the Patient : "+ptName+"\nThe Age of the Patient : "+ptAge+"\nName of the Doctor : "+doc);
   }
 }
  void DispDoc(String doctor){
   if(doctor.equals(doc)){
   	System.out.println("\nName of the Patient : ");
	System.out.println(ptName);
   }
 }
}

class Hospital{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Patients");
		int n=sc.nextInt();
		Patient p[]=new Patient[n];
		for(int i=0;i<n;i++)
		{
			p[i]=new Patient();
			System.out.println("Enter the patient details");
			p[i].PatientDetails();
		}
		
		System.out.println("Enter the Patient ID who's details you want to display");
		int PtId=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			p[i].dispPatient(PtId);
		}
		
		System.out.println("Enter the Doctor's name who's Patients you want to display");
		String doctor=sc.next();
		
		for(int i=0;i<n;i++)
		{
			p[i].DispDoc(doctor);
		}
 }
}