package string_Programs;
import java.util.Scanner;
public class Program2 
{
 public static void main(String[] args) 
 {
   	Scanner scan=new Scanner(System.in);
   	System.out.println("Enter the string:");
   	String s1=scan.next();
   	System.out.println("Enter the character to count:");
   	char ch1=scan.next().charAt(0);
   	int count=0;
   	for(int i=0;i<=s1.length()-1;i++)
   	{
   		char ch2=s1.charAt(i);
   		if(ch1==ch2)
   		{
   			count++;
   		}
   	}
   	System.out.println("Given string is :"+s1);
   	System.out.println("Given character is :"+ch1);
   	System.out.println("count is :"+count);
 }
}
