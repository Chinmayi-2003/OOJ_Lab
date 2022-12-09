import java.util.Scanner;
abstract class Shape{
 int a,b;
 abstract void printArea();
}
class Rectangle extends Shape{
 void printArea(){
   double area;
   area=a*b;
   System.out.println("The area of rectangle is "+area);
 }
}
class Triangle extends Shape{
 void printArea(){
   double area;
   area=0.5*a*b;
   System.out.println("The area of triangle is "+area);
 }
}
class Circle extends Shape{
 void printArea(){
   double area;
   area=3.14*a*a;
   System.out.println("The area of circle is "+area);
 }
}
class Area{
 public static void main(String args[])
 {
  Rectangle r = new Rectangle();
  Triangle t = new Triangle();
  Circle c = new Circle();
  Scanner ss= new Scanner(System.in);
  while(true){
  System.out.println("Choose the shape whose area is to be calculated: ");
  System.out.println("1.Rectangle\n2.Triangle\n3.Circle\n4.Exit ");
  int n= ss.nextInt();
  switch(n){
   case 1:
System.out.println("Enter length and breadth of rectangle ");
r.a = ss.nextInt();
r.b = ss.nextInt();
r.printArea();
break;
 
  case 2:
System.out.println("Enter base and height of triangle ");
t.a = ss.nextInt();
t.b = ss.nextInt();
t.printArea();
break;
 
   case 3:
System.out.println("Enter radius of circle ");
c.a = ss.nextInt();
c.printArea();
break;
   case 4: System.exit(0);
   default :
System.out.println("Wrong choice !!");
   }
  }
 }
}
