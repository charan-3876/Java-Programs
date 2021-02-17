package array_programs;
import java.util.Scanner;
public class DeleteElement 
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
		  System.out.println("Enter the element to delete: ");
		  int targetElement=scan.nextInt();
		  int index=search(a1,targetElement);
	      if(index>=0)
	      {
	    	  int a2[]=new int[a1.length-1];
	    	  for(int i=0;i<=a2.length-1;i++)
	    	  {
	    		  if(i<index)
	    		  {
	    			  a2[i]=a1[i];
	    		  }
	    		  else
	    		  {
	    			  index++;
	    			  a2[i]=a1[index];
	    		  }
	    		 System.out.print(a2[i]);
	    	  }
	      }
	      else
	      {
	    	  System.out.println("Given element does not exist in the array.....");
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
