package Multithread_programs;

public class Sample extends Thread
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
