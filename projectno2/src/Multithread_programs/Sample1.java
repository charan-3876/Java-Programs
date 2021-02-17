package Multithread_programs;

public class Sample1 implements Runnable
{
	public void run()
	{
		move();
	}
   public void move()
   {
	   System.out.println("move....");
   }
}
