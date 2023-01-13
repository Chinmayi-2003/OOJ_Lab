import cie.*;
import see.*;
import java.util.Scanner;

class Demo{
 public static void main(String args[]){
  Scanner s = new Scanner(System.in);
  int n;
  int finalmarks[] = new int[5];
  System.out.println("Enter the number of students: ");
  n = s.nextInt();
  Externals e[] = new Externals[n];
   for(int i=0; i<n;i++){
   e[i] = new Externals();
  
   e[i].set();
   e[i].setciemarks();
   e[i].setseemarks();
  }

  for(int i = 0; i<n ; i++){
    e[i].get();
      System.out.println("The final marks:");
   for(int j = 0;j<5;j++){
    finalmarks[j] = e[i].marks[j]+ e[i].seemarks[j];
    System.out.println("Course "+(j+1)+":"+finalmarks[j]);
   }
  }
 }
}
