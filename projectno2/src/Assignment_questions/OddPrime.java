package Assignment_questions;
import java.util.Scanner;
public class OddPrime 
{
 public static void main(String[] args) 
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter starting number:");
	 int k=sc.nextInt();
	 System.out.println("Enter ending number:");
	 int l=sc.nextInt();
    for(int i=k;i<=l;i++)
    { 
    	int count=0;
    	if(i%2!=0)
    	{
    	   for(int j=1;j<=i;j++)
    	   {
    		   if(i%j==0)
    		   {
    			   count++;
    		   }
    	   }
    	   if(count==2)
    	   {
    		   System.out.println(i);
    	   }
    	}
    }
 }
}
