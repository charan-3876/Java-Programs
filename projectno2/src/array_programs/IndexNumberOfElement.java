package array_programs;
import java.util.Scanner;
public class IndexNumberOfElement 
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
		  System.out.println("Enter the element: ");
		  int ele=scan.nextInt();
		  for(int i=0;i<=a1.length-1;i++)
		  {
			  if(a1[i]==ele)
			  {
				  System.out.println("Given element "+ele+"is present at index: "+i);
				  break;
			  }
		  }
	  }
}
