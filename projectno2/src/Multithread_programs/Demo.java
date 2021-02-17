package Multithread_programs;

public class Demo extends Thread 
{
   public void run()
   {
	   walk();
   }
   public void walk()
   {
	   System.out.println("walk on foot...");
   }
}
