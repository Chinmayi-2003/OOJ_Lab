import java.util.Scanner;

class BmsThread extends Thread{
 String s1 = new String();
 Thread t;
 BmsThread(String name){
  s1 = name;
  t =  new Thread(this, name);
 }
 public void run(){
  try{
   for(int i=0;i<5;i++){
   System.out.println(s1);
   Thread.sleep(10000);
   }
  }
  catch(InterruptedException ie){
   System.out.println("Thread Interrupted");
  }
 } 
}

class CseThread extends Thread{
 String s = new String();
 Thread t;
 CseThread(String name){
  s = name;
  t =  new Thread(this, name);
 }
 public void run(){
  try{
    for(int i=0;i<5;i++){
     System.out.println(s);
     Thread.sleep(2000);
    }
  }
  catch(InterruptedException ie){
    System.out.println("Thread Interrupted");
  }
 }
}

class ThreadLab{
 public static void main(String args[]){
 BmsThread ob1 = new BmsThread("BMS College of Engineering");
 CseThread ob2 = new CseThread("CSE");
 ob1.t.start();
 ob2.t.start();
 }
}

