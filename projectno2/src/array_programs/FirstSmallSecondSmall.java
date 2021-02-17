package array_programs;
import java.util.Scanner;
public class FirstSmallSecondSmall 
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
		  int small=a1[0];
		  int secondSmall=a1[1];
		  for(int i=1;i<=a1.length-1;i++)
		  {
			  if(a1[i]<small)
			  {
				  small=a1[i];
			  }
		  }
		  for(int i=1;i<=a1.length-1;i++)
		  {
			  if(a1[i]>small && a1[i]<=secondSmall)
			  {
				  secondSmall=a1[i];
			  }
		  }
		  System.out.println("1st smallest number is: "+small);
		  System.out.println("2nd smallest number is: "+secondSmall);
	  }
}
