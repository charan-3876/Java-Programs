package array_programs;
import java.util.Scanner;/*print elements greater than average*/
public class Program3
{
	public static void main(String[] args) 
	  {
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Enter the Array size: ");
		  int size=scan.nextInt();
		  System.out.println("Enter the 1st array "+size+" elements: ");
		  int a1[]=new int[size];
		  for(int i=0;i<=a1.length-1;i++)
		  {
			a1[i]=scan.nextInt();
		  }
		  int sum=0;
		  for(int i=0;i<=a1.length-1;i++)
		  {
			sum=sum+a1[i];
		  }
		  int avg=sum/a1.length;
		  System.out.println("The elements which are greater than average...");
		  for(int i=0;i<=a1.length-1;i++)
		  {
			  if(a1[i]>avg)
			  {
				  System.out.println(a1[i]);
			  }
		  }
	  }
}
