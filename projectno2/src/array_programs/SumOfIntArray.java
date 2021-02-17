package array_programs;
import java.util.Scanner;
public class SumOfIntArray 
{
  public static void main(String[] args) 
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter the integer array size: ");
	  int size=scan.nextInt();
	  System.out.println("Enter "+size+" elements: ");
	  int a1[]=new int[size];
	  int a=0;
	  for(int i=0;i<=a1.length-1;i++)
	  {
		  a1[i]=scan.nextInt();
	  }
	  for(int j=0;j<=a1.length-1;j++)
	  {
		a=a+a1[j];
	  }
	  System.out.println("The sum is: "+a);
  }
}
