package array_programs;
import java.util.Scanner;
public class PositiveNegative2
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
		  for(int i=0;i<a1.length-1;i++)
		  {
			  if(a1[i]>0)
			  {
				  pCount++;
			  }
		  }
		  int nCount=a1.length-pCount;
		  int a2[]=new int[pCount];
		  int a3[]=new int[nCount];
		  int x=0;
		  int y=0;
		  for(int i=0;i<=a1.length-1;i++)
		  {
			  if(a1[i]>0)
			  {
				  a2[x]=a1[i];
				  x++;
			  }
			  else
			  {
				  a3[y]=a1[i];
				  y++;
			  }
		  }
		  System.out.println("positive array is......");
		  for(int i=0;i<=a2.length-1;i++)
		  {
			  System.out.print(a2[i]+" ");
		  }
		  System.out.println();
		  System.out.println("Negative array is.....  ");
		  for(int j=0;j<=a3.length-1;j++)
		  {
			  System.out.print(a3[j]+" ");
		  }
	  }
}
