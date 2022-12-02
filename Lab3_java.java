
import java.util.Scanner;
class Book
{
 String name, author;
 double price;
 int num_pages;
   Scanner ss=new Scanner(System.in);
 Book()
 {
  name="abcd";
  author="xyz";
  price=0.0;
  num_pages=0;
 }
 void get()
 {
System.out.println("Enter Name,author,price and number of page of the book");
  name=ss.next();
  author=ss.next();
  price=ss.nextDouble();
  num_pages=ss.nextInt();
 }
 public String toString()
 {
  return ("Name: "+name+"\nAuthor: "+author+"\nprice "+price+"\nNum of pages: "+num_pages);
 }
}

class Bookmain
{
 public static void main(String args[])
{
 Scanner sss=new Scanner(System.in);
System.out.println("Enter the number of books.");
int n=sss.nextInt();
  Book b1[]= new Book[n];
for(int i=0;i<n;i++)
{
 b1[i]=new Book();
 System.out.println("Enter the book details");
 b1[i].get();
}
for(int i=0;i<n;i++)
{
 System.out.println(b1[i]);
}
}
}
