package cie;
import java.util.Scanner;

public class Internals extends Student{
 public int marks[] = new int[5];
 public Internals(){
}
 public void setciemarks(){
  Scanner sc = new Scanner(System.in);
  for(int i=0; i< 5;i++){
   System.out.println("Enter subject  "+(i+1)+" internal marks(out of 50)");
   marks[i] = sc.nextInt();
  }
 }
}