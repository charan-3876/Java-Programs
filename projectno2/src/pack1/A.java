package pack1;

public class A 
{
  int a;
  double b;
  private A(int a)
  {
	this.a=a;  
  }
  public A(int a,double b)
  {
	this(a);
	this.b=b;
  }
  public static void main(String[] args)
  {
	  A a1=new A(1);
	  A a2=new A(2,3.2);
	 System.out.println(a1.a);
	 System.out.println(a2.a);
	 System.out.println(a2.b);
  }
}
