package Assignment_questions;

public class Complex_Method 
{
  public static void main(String[] args) 
  {
	  ComplexNumber c=new ComplexNumber(10,5);
	  ComplexNumber c1=new ComplexNumber(5,15);
	  int a=c.rp+c1.rp;
	  int b=c.ip+c1.ip;
	  System.out.println(a+"+i"+b);
  }
 
}
