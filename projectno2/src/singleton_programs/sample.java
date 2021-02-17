package singleton_programs;

public class sample
{
	private static sample rv;
  private sample()
  {
	  System.out.println("inside constructor");
  }
  public void test()
  {
	  System.out.println("test bike..");
  }
  public static sample getObject()
  {
	  if(rv==null)
	  {
		  rv=new sample();
	  }
	  return rv;
  }
}
