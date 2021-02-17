package abstract_program1_level5;

public class triangle extends shape
{
  double b;
  double h;
  double a;
  public triangle(double b,double h)
  {
	  this.b=b;
	  this.h=h;
  }
  public void displayarea()
  {
	  a=0.5*b*h;
	  System.out.println("Area of triangle is:"+a);
  }
}
