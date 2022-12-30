import java.util.Scanner;

class WrongAgeExc extends Exception{
 String msg = new String();

 WrongAgeExc(String s){
  msg = s;
 }
 public String toString(){
   return msg;
 }
}

class WrongAgeDiff extends Exception{
 String error = new String();
 WrongAgeDiff(String t){
  error = t;
 }
 public String toString(){
   return error;
 }
}

class Father{
 int age_father;
 Father() throws WrongAgeExc{
  int x;
  Scanner ss = new Scanner(System.in);
  System.out.println("Enter fathers age");
  age_father = ss.nextInt();
  if(age_father<0)
    throw new WrongAgeExc("Age is less than zero");
 }
}

class Son extends Father{
  int age_son;
  Son() throws WrongAgeExc{
   super();
   Scanner ss = new Scanner(System.in);
   System.out.println("Enter son's age");
   age_son = ss.nextInt();
  }
  void check_sonage() throws WrongAgeExc{
   if(age_son<0)
    throw new WrongAgeExc("Age is less than zero");
  }
   void comp_age() throws WrongAgeDiff {
    if(age_father<=age_son){
      throw new WrongAgeDiff("Father's age<= Son's age");
   }
  }
}

class ExceptionDemo1{
 public static void main(String args[]){
  try {
   Son s = new Son();
   s.check_sonage();
   s.comp_age();
  }
  catch(WrongAgeExc wa){
   System.out.println(wa);
  }
  catch(WrongAgeDiff wad){
   System.out.println(wad);
  }
 }
}