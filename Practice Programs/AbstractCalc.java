/*3. Create an abstract class Calculate which has three double members -say x, y and result. Include a method calc. Derive three classes from Calculate which performs any three arithmetic operations on the two variables x and y and assign the result to the variable result.
Make appropriate declarations and definitions.*/
import java.util.Scanner;
abstract class Calculate{
 double x,y,result;
 abstract void calc();
}
class Add extends Calculate{
 void calc(){
  Scanner ss = new Scanner(System.in);
  System.out.println("Enter the value of x and y");
  x = ss.nextDouble();
  y = ss.nextDouble();
  result = x+y;
  System.out.println(x+" + "+y+" = "+result);
 }
}
class Subtract extends Calculate{
 void calc(){
  Scanner ss = new Scanner(System.in);
  System.out.println("Enter the value of x and y");
  x = ss.nextDouble();
  y = ss.nextDouble();
  result = x-y;
  System.out.println(x+" - "+y+" = "+result);
 }
}
class Multiply extends Calculate{
 void calc(){
  Scanner ss = new Scanner(System.in);
  System.out.println("Enter the value of x and y");
  x = ss.nextDouble();
  y = ss.nextDouble();
  result = x*y;
  System.out.println(x+" * "+y+" = "+result);
 }
}
class AbstractCalc{
 public static void main(String args[]){
  Add a = new Add();
  Subtract s = new Subtract();
  Multiply m = new Multiply();
  System.out.println("Addition");
  a.calc();
  System.out.println("Subtraction");
  s.calc();
  System.out.println("Multiplication");
  m.calc();
 }
}