package array_programs;
import java.util.Scanner;
public class ReplaceElement 
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
	   System.out.println("Enter the index number: ");
	   int index=scan.nextInt();
	   System.out.println("Enter the element to be replaced: ");
	   int replaceElement=scan.nextInt();
	   int[] a2=new int[size];
       for(int i=0;i<=a2.length-1;i++)
       {
    	   if(i<index)
    	   {
    		   a2[i]=a1[i];
    	   }
    	   else if(i==index)
    	   {
    		   a2[i]=replaceElement;
    	   }
    	   else
    	   {
    		   a2[i]=a1[i];
    	   }
       }
       System.out.println("First array elements are......");
 	  for(int i=0;i<=a1.length-1;i++)
 	  {
 		  System.out.print(a1[i]+" ");
 	  }
 	  System.out.println("The array with replaced element is.......");
 	  for(int j=0;j<=a2.length-1;j++)
 	  {
 		  System.out.print(a2[j]+" ");
 	  }
	}
}
