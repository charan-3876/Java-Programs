package array_programs;
import java.util.Scanner;
public class NthLargestElement 
{
	public static void main(String[] args) 
	{
       Scanner scan=new Scanner(System.in);
	   System.out.println("Enter the Array size: ");
	   int size=scan.nextInt();
	   System.out.println("Enter the "+size+" elements:");
	   int a1[]=new int[size];
	   for(int i=0;i<=a1.length-1;i++)
	   {
		 a1[i]=scan.nextInt();
	   }
	   System.out.println("Enter the nth largest number: ");
	   int n=scan.nextInt();
	   int greaterThan=a1.length-n;
	   for(int i=0;i<=a1.length-1;i++)
	   {
		   int count=0;
		   for(int j=0;j<=a1.length-1;j++)
		   {
			   if(a1[i]>a1[j])
			   {
				   count++;
			   }
		   }
		   if(count==greaterThan)
		   {
			   System.out.println(a1[i]+" is "+n+" largest ");
		   }
	   }
	}
}
