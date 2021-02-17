package abstract_program1_level5;

public class rectangle extends shape
{
  double l;
  double w;
  double a;
  public rectangle(double l,double w)
  {
	  this.l=l;
	  this.w=w;
  }
  public void displayarea()
  {
	  a=l*w;
	  System.out.println("Area of rectangle is:"+a);
  }
}
