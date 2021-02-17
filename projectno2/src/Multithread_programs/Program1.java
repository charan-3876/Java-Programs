package Multithread_programs;

public class Program1 
{
  public static void main(String[] args) 
  {
	  Demo1 d1=new Demo1();
	  Thread t1=new Thread(d1);
	  t1.start();
		Sample1 s1=new Sample1();
		Thread t2=new Thread(s1);
		t2.start();
  }
}
