package array_programs;
import java.util.Scanner;
public class RepeatedElements 
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Array size: ");
	int size=scan.nextInt();
	System.out.println("Enter the "+size+" elements");
	int a1[]=new int[size];
	for(int i=0;i<=a1.length-1;i++)
	{
		a1[i]=scan.nextInt();
	}
	for(int j=0;j<=a1.length-1;j++)
	{
		int count=0;
		for(int k=0;k<=a1.length-1;k++)
		{
			if(a1[j]==a1[k])
			{
				count++;
			}
		}
		int status=0;
		for(int l=j;l>=0;l--)
		{
			if(a1[j]==a1[l])
			{
				status++;
			}
		}
			if( status==1&&count>1)
			{
				System.out.print("The duplicate elements are "+a1[j]+" ");
			}
	  }
  } 
}
