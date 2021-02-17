package abstract_program1_level5;

public class circle extends shape
{
  double r;
  static double pi=3.14;
  double a;
  public circle(double r)
  {
	  this.r=r;
  }
  public void displayarea()
  {
	  a=pi*r*r;
	  System.out.println("Area of circle is:"+a);
  }
}
