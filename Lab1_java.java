import java.util.Scanner;

class quadeqn
{
 public static void main(String args[])
 {
  double a,b,c;
  double d,r,r1,r2;
  Scanner ss=new Scanner(System.in);
  System.out.println("Enter the value of a,b and c:");
  a=ss.nextDouble();
  b=ss.nextDouble();
  c=ss.nextDouble();
  if(a==0)
  {
   System.out.println("It is not a quadratic equation.");
  }
  else
  {
   d=b*b-(4*a*c);
   if(d==0)
{
r=(-b)/(2*a);
System.out.println("The roots are real and equal. The root is "+r);
}
   else if(d>0)
{
r1=(-b+Math.pow(d,0.5))/(2*a);
r2=(-b-Math.pow(d,0.5))/(2*a);
System.out.println("The roots are real and distinct. The roots are "+r1+" and "+r2);
}
   else
{
        r=((-b)/(2*a));
r1=(-b+Math.pow((Math.abs(d)),0.5))/(2*a);
r2=(-b-Math.pow((Math.abs(d)),0.5))/(2*a);
System.out.println("The roots are imaginary. The roots are " +r+ "+" +r1+ "i and " +r+ r2 +"i");
}
  }
 }
}
