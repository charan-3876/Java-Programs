package array_programs;
import java.util.Scanner;
public class AverageOfArray
{
  public static void main(String[] args) 
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter the integer array size: ");
	  int size=scan.nextInt();
	  System.out.println("Enter "+size+" elements: ");
	  int a1[]=new int[size];
	  int a=0;
	  double avg=0;
	  for(int i=0;i<=a1.length-1;i++)
	  {
		  a1[i]=scan.nextInt();
	  }
	  for(int i=0;i<=a1.length-1;i++)
	  {
		  a=a+a1[i];
		  avg=a/a1.length;
	  }
	  System.out.println("The average is: "+avg);
  }
}
