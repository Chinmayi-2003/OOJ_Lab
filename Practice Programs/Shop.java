//program1
import java.util.Scanner;
class Customer{
 private int customerNo, qty;
 private double price, totalprice, discount, netprice;
 private String customerName; 
 public Customer(int cNo,int Qty,double Price,double tprice,double discnt,double nprice,String cName ){
   customerNo=cNo; qty=Qty; 
   price=Price; totalprice=tprice; discount=discnt; netprice=nprice;
   customerName = cName;
 }
  public void Input(){
  totalprice=price*qty;
  netprice= CalDiscount();
 }
 public double CalDiscount(){
  totalprice=price*qty;
  if(totalprice>=50000){
   discount=0.25*totalprice;
  }
  else if(totalprice>=25000){
   discount=0.10*totalprice;
  }
  else discount=0;
  netprice=totalprice-discount;
  return netprice; 
 }
 public void Show(){
   System.out.println("\nThe details of the customer:");
   System.out.println("Customer name:"+customerName);
   System.out.println("Customer number:"+customerNo);  
   System.out.println("Quantity of item:"+qty);  
   System.out.println("Price of item:"+price);
   System.out.println("Total price:"+totalprice);
   System.out.println("Net price:"+netprice);     
 }
}
class Shop{
 public static void main(String args[]){
  System.out.println("Enter the number of customer");
  Scanner sc = new Scanner(System.in);
  int n=sc.nextInt();
  Customer c[] = new Customer[n];
  for(int i=0;i<n;i++)
	{
	System.out.println("Enter customer name, customer number, quantity and  price ");
  	String customerName=sc.next();
  	int customerNo=sc.nextInt();
	int qty= sc.nextInt(); 
 	double price=sc.nextDouble(); 
	c[i]=new Customer(customerNo,qty,price,0,0,0,customerName);
	c[i].Input();
	}
  for(int i=0;i<n;i++)
	{
	c[i].CalDiscount();
	}
  for(int i=0;i<n;i++)
	{
	c[i].Show();
	}
 }
}