package string_Programs;
import java.util.Scanner;
public class DoubleArraySize 
{
  public static void main(String[] args)
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter the double integer array size: ");
	  int size=scan.nextInt();
	  System.out.println("Enter"+ size +"elements: ");
	  double d1[]=new double[size];
	   for(int i=0;i<=d1.length-1;i++)
	    {
	    	d1[i]=scan.nextDouble();
	    }
	    for(double k:d1)
	    {
	    	System.out.println(k);
	    }
  } 
}
