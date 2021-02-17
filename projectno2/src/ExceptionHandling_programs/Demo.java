package ExceptionHandling_programs;
import java.util.Scanner;
public class Demo
{
 public static void main(String[] args) 
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter number 1:");
   int i=sc.nextInt();
   System.out.println("Enter number 2:");
   int j=sc.nextInt();
   while(true)
   {
	   try
	   {
		   System.out.println(i/j);
		   break;
	   }
	   catch(ArithmeticException rv)
	   {
		   System.out.println("J value should not be zero");
		   System.out.println("Re enter number 2:");
		   j=sc.nextInt();
	   }
   }
 } 
}
