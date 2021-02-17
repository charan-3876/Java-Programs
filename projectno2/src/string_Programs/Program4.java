package string_Programs;
import java.util.Scanner;
public class Program4
{
 public static void main(String[] args) 
 {
   Scanner scan=new Scanner(System.in);
   System.out.println("Enter the given string:");
   String s1=scan.next();
   int count1=0,count2=0,count3=0,count4=0,count5=0;
   for(int i=0;i<=s1.length()-1;i++)
   {
	   char ch=s1.charAt(i);
	   if(ch=='a')
	   {
		   count1++;
	   }
	   else if(ch=='e')
	   {
		   count2++;
	   }
	   else if(ch=='i')
	   {
		   count3++;
	   }
	   else if(ch=='o')
	   {
		   count4++;
	   }
	   else if(ch=='u')
	   {
		   count5++;
	   }
   }
   System.out.println("count of a is "+count1);
   System.out.println("count of e is "+count2);
   System.out.println("count of i is "+count3);
   System.out.println("count of o is "+count4);
   System.out.println("count of u is "+count5);
 }
}
