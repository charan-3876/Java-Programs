package array_programs;
import java.util.Scanner;
/*To create 2 integer arrays and print elements that are not present in 1st array*/
public class Program2 
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
	  System.out.println("Enter the 2nd array "+size+" elements: ");
	  int a2[]=new int[size];
	  for(int j=0;j<=a2.length-1;j++)
	  {
		a2[j]=scan.nextInt();
	  }
	  System.out.println("The elements which are not present in 1st array: ");
	  for(int x=0;x<=a2.length-1;x++)
	  {
		  int count=0;
		  for(int y=0;y<=a1.length-1;y++)
		  {
			  if(a1[y]==a2[x])
			  {
				count++;
			  }
		  }
		  if(count==0)
		  {
			  System.out.print(a2[x]+" ");
		  }
	  }
  }
}