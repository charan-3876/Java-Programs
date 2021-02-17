package array_programs;
import java.util.Scanner;
public class BubbleSort 
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
		  System.out.println("The unsorted array is.....");
		  for(int i=0;i<=a1.length-1;i++)
		  {
			  System.out.print(a1[i]+" ");
		  }
		  for(int c=1;c<=a1.length-1;c++)
		  {
			  for(int i=0;i<=a1.length-2;i++)
			  {
				  int m=a1[i];
				  int n=a1[i+1];
				  if(m>n)
				  {
					  a1[i+1]=m;
					  a1[i]=n;
				  }
			  }
		  }
		  System.out.println();
		  System.out.println("The sorted array is.....");
		  for(int i=0;i<=a1.length-1;i++)
		  {
			  System.out.print(a1[i]+" ");
		  }
	  }
}
