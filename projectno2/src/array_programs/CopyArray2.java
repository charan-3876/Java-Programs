package array_programs;
import java.util.Scanner;
public class CopyArray2 
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the 1st Array size: ");
	int size1=scan.nextInt();
	System.out.println("Enter the "+size1+" elements: ");
	int a1[]=new int[size1];
	for(int i=0;i<=a1.length-1;i++)
	  {
	      a1[i]=scan.nextInt();
	  }
	System.out.println("Enter the 2nd Array size: ");
	int size2=scan.nextInt();
	System.out.println("Enter the "+size2+" elements: ");
	int a2[]=new int[size2];
	for(int i=0;i<=a2.length-1;i++)
	  {
	      a2[i]=scan.nextInt();
	  }
	int a3Len=a1.length+a2.length;
	int a3[]=new int[a3Len];
	int j=0;
	for(int k=0;k<=a3.length-1;k++)
	{
	   if(k<=a1.length-1)
	   {
		   a3[k]=a1[k];
	   }
	   else
	   {
		   a3[k]=a2[j];
		   j++;
	   }
	}
	System.out.println("1st array elemts are: ");
	for(int i=0;i<=a1.length-1;i++)
	{
		System.out.print(a1[i]+" ");
	}
	System.out.println();
	System.out.println("2nd array elements are: ");
	for(int i=0;i<=a2.length-1;i++)
	{
		System.out.print(a2[i]+" ");
	}
	System.out.println();
	System.out.println("2nd array elements are: ");
	for(int i=0;i<=a3.length-1;i++)
	{
		System.out.print(a3[i]+" ");
	}
  }
}
