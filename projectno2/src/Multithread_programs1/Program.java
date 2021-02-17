package Multithread_programs1;

public class Program
{
  public static void main(String[] args) 
  {
	Thread t1=Thread.currentThread();
	System.out.println("Default values...");
	System.out.println(t1.getId());
	System.out.println(t1.getName());
	System.out.println(t1.getPriority());
	t1.setName("My main method thread");
	t1.setPriority(3);
	System.out.println("Changed values...");
	System.out.println(t1.getId());
	System.out.println(t1.getName());
	System.out.println(t1.getPriority());
  }
}
