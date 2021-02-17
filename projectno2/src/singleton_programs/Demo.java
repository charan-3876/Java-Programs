package singleton_programs;

public class Demo
{
  public static void main(String[] args) 
  {
	  sample s1=sample.getObject();
	  sample s2=sample.getObject();
	  sample s3=sample.getObject();
	  
	  s1.test();
	  s2.test();
	  s3.test();
  }
}
