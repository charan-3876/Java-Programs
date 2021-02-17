package array_programs;
import java.util.Scanner;
public class UniqueElements 
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
		System.out.println("The unique elements are: ");
		for(int j=0;j<=a1.length-1;j++)
		{
			System.out.println(a1[j]);
		}
  }
}
