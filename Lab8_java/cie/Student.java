package cie;
import java.util.Scanner;

public class Student{
 public String name = new String();
 public String usn = new String();
 public int sem;
 public Student(){

}
 public void set(){
 Scanner ss = new Scanner(System.in);
 System.out.println("Enter usn, name and sem of the student");
 usn = ss.next();
 name = ss.next();
 sem = ss.nextInt();
 }

 public void get(){
 System.out.println("Usn: "+usn);
 System.out.println("Name: "+name);
 System.out.println("Semester: "+sem);
 
 }
}