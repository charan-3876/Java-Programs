package array_programs;
import java.util.Scanner;
public class MissingNumber
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the array size: ");
	int size=scan.nextInt();
	System.out.println("Enter "+size+" elements: ");
	int [] a1=new int[size];
	for(int i=0;i<=a1.length-1;i++)
	{
		a1[i]=scan.nextInt();
	}
	for(int i=1;i<=100;i++)
	{
		int status=0;
		for(int j=0;j<=a1.length-1;j++)
		{
			if(i==a1[j])
			{
				status=1;
				break;
			}
		}
		if(status==0)
		{
			System.out.print(i+" ");
		}
	}
  }
}
