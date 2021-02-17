package array_programs;
import java.util.Scanner;
public class PositiveNegative
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
		  for(int i=0;i<a1.length-1;i++)
		  {
			  if(a1[i]>0)
			  {
				  System.out.print(a1[i]+" ");
			  }
		  }
		  for(int j=0;j<=a1.length-1;j++)
		  {
			  if(a1[j]<0)
			  {
				  System.out.print(a1[j]+" ");
			  }
		  }
	  }
}
