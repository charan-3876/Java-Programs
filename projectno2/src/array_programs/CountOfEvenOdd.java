package array_programs;
import java.util.Scanner;
public class CountOfEvenOdd 
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
		  int evenCount=0;
		  int oddCount=0;
		  for(int i=0;i<=a1.length-1;i++)
		  {
			  if(a1[i]%2==0)
			  {
				  evenCount++;
			  }
			  else
			  {
				  oddCount++;
			  }
		  }
		  System.out.println("The even count is: "+evenCount);
		  System.out.println("The odd count is: "+oddCount);
	   }
}
