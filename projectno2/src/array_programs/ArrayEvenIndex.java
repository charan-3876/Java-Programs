package array_programs;
import java.util.Scanner;
public class ArrayEvenIndex 
{
  public static void main(String[] args) 
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter the integer array size: ");
	  int size=scan.nextInt();
	  System.out.println("Enter "+size+" elements: ");
	  int [] Arr=new int[size];
	  for(int i=0;i<=Arr.length-1;i++)
	  {
		  Arr[i]=scan.nextInt();
	  }
	  for(int j=0;j<=Arr.length-1;j++)
	  {
		  if(j%2==0)
		  {
			System.out.println(Arr[j]);
		  }
	  }
  }
}
