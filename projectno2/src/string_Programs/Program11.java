package string_Programs;//reverse a string
import java.util.Scanner;
public class Program11 
{
 public static void main(String[] args) 
 {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the String: ");
	String s1=scan.next();
	System.out.println("Reverse is: ");
	for(int i=s1.length()-1;i>=0;i--)
	{
		System.out.print(s1.charAt(i));
	}
 }
}
