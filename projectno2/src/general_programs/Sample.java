package general_programs;

public class Sample 
{
  public static void main(String[] args) 
  {
	Demo d1=new Demo();
	System.out.println(d1.i);
	d1.test();
	//or
	System.out.println(new Demo().i);
	new Demo().test();
  }
}
