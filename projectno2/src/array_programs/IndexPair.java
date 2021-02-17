package array_programs;
import java.util.Scanner;
public class IndexPair 
{
	public static void main(String[] args) 
	  {
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Enter the Array size: ");
		  int size=scan.nextInt();
		  System.out.println("Enter the 1st array "+size+" elements: ");
		  int a1[]=new int[size];
		  int pCount=0;
		  for(int i=0;i<=a1.length-1;i++)
		  {
			a1[i]=scan.nextInt();
		  }
		  for(int i=0;i<=a1.length-1;i++)
		  {
			  for(int j=0;j<=a1.length-1;j++)
			  {
				if(i!=j)
				{
				  if(a1[i]+a1[j]==8)
				  {
					System.out.print("{"+i+","+j+"}");
					System.out.println();
				  }
			    }
		     }
	     }
      }
}
