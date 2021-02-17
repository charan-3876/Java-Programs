package array_programs;
import java.util.Scanner;
/* linear search array*/
public class SearchElement 
{
  public static void main(String[] args) 
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter the Array size: ");
	  int size=scan.nextInt();
	  System.out.println("Enter the "+size+" elements:");
	  int a1[]=new int[size];
	  for(int i=0;i<=a1.length-1;i++)
	  {
		a1[i]=scan.nextInt();
	  }
	  System.out.println("Enter the search element: ");
	  int searchElement=scan.nextInt();
	  int index=search(a1,searchElement);
	  if(index>=0)
	  {
		  System.out.println("Element "+a1[index]+" is present at "+index);
	  }
	  else
	  {
		  System.out.println("Element is not present....");
	  }
  }
     public static int search(int[] a1,int targetElement)
     {
	  for(int i=0;i<=a1.length-1;i++)
	  {
		  if(a1[i]==targetElement)
		  {
			  return i;
		  }
	  }
	  return -1;
     }
}
