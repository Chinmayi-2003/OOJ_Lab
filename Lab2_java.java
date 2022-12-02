import java.util.Scanner;
class Student
{
 String usn,name;
 int credits[]=new int[25];
 int marks[]=new int[25];
 int n;
 String subject[]=new String[10];


void accept()
 {
 System.out.println("Enter the USN, Name, number of subjects in the semester :");
 Scanner s= new Scanner(System.in);
 usn=s.next();
 name=s.next();
 n=s.nextInt();
 System.out.println("Enter the name of the each subjects and credits respectively");
 for(int i=0;i<n;i++)
 {
 subject[i]=s.next();
 credits[i]=s.nextInt();
 }

System.out.println("Enter the Marks obtained in each subject:");
for(int i=0;i<n;i++)
{
marks[i]=s.nextInt();
}
}

double calculate()
{
int totalcredit=0;
double sgpa,sum=0;
for(int i=0;i<n;i++)
{
sum=sum+grade(marks[i])*credits[i];
totalcredit=totalcredit+credits[i];
}
sgpa=sum/totalcredit;
return sgpa;
}

int grade(int mark)
{
if((mark>=0)&&(mark<40))
{
return 0;
}
else
{
if((mark<=100)&&(mark>=90))
{
return 10;
}
else if((mark>=80)&&(mark<90))
{
return 9;
}

else if((mark>=70)&&(mark<80))
{
return 8;
}

else if((mark>=60)&&(mark<70))
{
return 7;
}

else if((mark>=55)&&(mark<60))
{
return 6;
}

else if((mark>=50)&&(mark<55))
{
return 5;
}

else if((mark>=40)&&(mark<50))
{
return 4;
}
else
{
return 0;
}
}
}

void display()
{
double sgpa;
 System.out.println("USN : "+usn+"\nName : "+name);
System.out.println("Subject\tCredits\tMarks\tGrade Points");
for(int i=0;i<n;i++)
{
System.out.println(subject[i]+"\t"+credits[i]+"\t"+marks[i]+"\t"+grade(marks[i]));
}
sgpa=calculate();
System.out.println("SGPA = "+sgpa);
}
}

class Sgpa
{
public static void main(String args[])
{
double sgpa;
Student s1=new Student();
s1.accept();
s1.display();
}
}
