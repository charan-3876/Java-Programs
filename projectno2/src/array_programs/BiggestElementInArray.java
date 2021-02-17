package array_programs;
import java.util.Scanner;
public class BiggestElementInArray 
{
	public static void main(String[] args) 
	{
       Scanner scan=new Scanner(System.in);
	   System.out.println("Enter the Array size: ");
	   int size=scan.nextInt();
	   System.out.println("Enter the "+size+" elements:");
	   int a1[]=new int[size];
	   int big=0;
	   for(int i=0;i<=a1.length-1;i++)
	   {
		 a1[i]=scan.nextInt();
	   }
	   for(int i=0;i<=a1.length-1;i++)
	   {
		  if(a1[i]>big)
		  {
			  big=a1[i];
		  }
	   }
	   System.out.println("The array elements are......");
	   for(int i=0;i<=a1.length-1;i++)
	   {
	     System.out.print(a1[i]+" ");
	   }
	   System.out.println("The biggest array element is: "+big);
	}
}
