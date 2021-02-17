package generalised_and_specialization1;

public class Multiplication 
{
  public static void product(int a,int b)
  {
	  System.out.println(a*b);
  }
  public static void product(double a,double b)
  {
	  System.out.println(a*b);
  }
  public static void product(double a,int b)
  {
	  System.out.println(a*b);
  }
  public static void main(String[] args) 
  {
	product(2,3);
	product(2.3,3.2);
	product(3.2,4);
  }
}
