package array2D_programs;
import java.util.*;
public class BubbleSort 
{
  public static void main(String[] args)
  {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the size of the array: ");
	int size=scan.nextInt();
	System.out.println("Enter the elements ");
	int[] a1=new int[size];
	for(int i=0;i<=a1.length-1;i++)
	{
		a1[i]=scan.nextInt();
	}
	for(int c=1;c<=a1.length-1;c++)
	{
		for(int  i=0;i<=a1.length-2;i++)
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
	System.out.println("The bubble sorted elements are: ");
	for(int i=0;i<=a1.length-1;i++)
	{
		System.out.println(a1[i]);
	}
  }
}
