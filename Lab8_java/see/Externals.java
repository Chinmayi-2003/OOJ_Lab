package see;

import cie.*;
import java.util.Scanner;

public class Externals extends cie.Internals{
 public int seemarks[] = new int[5];
  public Externals(){

  }
  public void setseemarks(){
  Scanner sc = new Scanner(System.in);
  for(int i=0; i< 5;i++){
   System.out.println("Enter subject  "+(i+1)+"  external marks(out of 50)");
   seemarks[i] = sc.nextInt();
  }
 }
}