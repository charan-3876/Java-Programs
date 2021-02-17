package array_programs;
import java.util.Scanner;
public class CopyArray 
{
  public static void main(String[] args) 
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter the integer array size: ");
	  int size=scan.nextInt();
	  System.out.println("Enter "+size+" elements: ");
	  int a1[]=new int[size];
	  int a2[]=new int[size];
	  for(int i=0;i<=a1.length-1;i++)
	  {
	      a1[i]=scan.nextInt();
	  }
	  for(int i=0;i<=a1.length-1;i++)
	  {
	      a2[i]=a1[i];
	  }
	  System.out.println("The 1st array elements are: ");
	  for(int i=0;i<=a1.length-1;i++)
	  {
	      System.out.println(a1[i]);
	  }
	  System.out.println("The 2nd array elemts are: ");
	  for(int i=0;i<=a2.length-1;i++)
	  {
	      System.out.println(a2[i]);
	  }
  }
}
