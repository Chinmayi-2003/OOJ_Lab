import java.util.Scanner;
import java.lang.*;
 
class Account
{
String customerName, accNum;
int typeOfAcc;
double balance=0, depo, withdraw;
void acctype(){
Scanner ss= new Scanner(System.in);
System.out.println("Choose the account type that you want to create \n1.savings account \n2.current account");
	typeOfAcc = ss.nextInt();
}

void set()
{
	Scanner ss= new Scanner(System.in);
	System.out.println("Enter your name, account number");
	customerName = ss.nextLine();
	accNum = ss.next();
	System.out.println("Enter the balance");
	balance = ss.nextDouble();
	System.out.println("The balance in the account is "+balance);
}
  void deposit()
{
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the amount you want to deposit ");
  depo = sc.nextDouble();
  balance+=depo;
  }
}

class Cur_acct extends Account{
 double minBal=1000;
 

 void Penalty(){
  if(balance<minBal){
  balance=balance-(balance*0.50);
  System.out.println("A penalty is applied as your balance is less than the minimum balance");
  }
 }
 void withdrawl(){
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the amount in the cheque that you want to withdraw ");  
  withdraw = sc.nextDouble();
  if(withdraw<balance){
  if((balance-withdraw)<minBal){
   System.out.println("A penalty will be  imposed if you want to cotinue press 1 else press 2");
   int c = sc.nextInt();
    switch(c){
	case 1:balance=balance-withdraw;
        Penalty();
               
	break;
	case 2:break;
   }
  }
   else{
 balance=balance-withdraw;
 }
}
 else
 {System.out.println("Insufficient balance");}
 }
    void display(){
  System.out.println("The balance in the account is " + balance);
 }
}
class Sav_acct extends Account{
 void interest(){ 
  int t;
  Scanner sss= new Scanner(System.in);
  System.out.println("Enter the time in years");
  t = sss.nextInt();
  balance=balance*Math.pow((1+5/100),t);
 }
  void withdrawl(){
  Scanner sss= new Scanner(System.in);
  System.out.println("Enter the amount you want to withdraw ");  
  withdraw = sss.nextDouble();
    if(withdraw<balance){
  balance=balance-withdraw;}
 else
 {System.out.println("Insufficient balance");}
 }
   void display(){
    System.out.println("The balance in the account is " + balance);
   }
}

class Bank
{
public static void main(String args[]){
  Scanner ss = new Scanner(System.in);
  int op;
  
  
 Account a = new Account();
 a.acctype();
  if(a.typeOfAcc==1)
  {
	Sav_acct s = new Sav_acct();
   s.set();
   while(true)
   {
	System.out.print("Enter the choice: \n1.Display\n2.Deposit\n3.Update your Interest\n4. Withdraw\n5. Exit\n");
	op=ss.nextInt();
	switch(op)
	{

	case 1:s.display();
  	break;
	case 2:s.deposit();
  	break;
	case 3:s.interest();
	break;
	case 4:s.withdrawl();
  	break;
	case 5:System.exit(0);
	}
    }
  }
  else if(a.typeOfAcc==2)
   {   Cur_acct c = new Cur_acct(); 
   c.set();
   while(true)
    {
	System.out.print("Enter the choice: \n1. display\n2. deposit\n3. Withdraw\n4. exit\n");
	op=ss.nextInt();
	switch(op)
	{

	case 1:c.display();
  	break;
	case 2:c.deposit();
  	break;
	case 3:c.withdrawl();
  	break;
	case 4:System.exit(0);
	}
    }
  }
  else{
  System.out.println("Wrong choice ");
  }
 }
}

