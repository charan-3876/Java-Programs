package string_Programs;
import java.util.Scanner;
public class Palindrome 
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the string1: ");
	String s1=scan.next();
	char[] ch=s1.toCharArray();
	String s2="";
	for(int i=ch.length-1;i>=0;i--)//if(s1.equalsIgnoreCase(s2))
	{
		
		s2=s2+ch[i];
	}
	System.out.println("Given string is: "+s1);
	System.out.println("Reverse String is: "+s2);
	int status=s1.compareToIgnoreCase(s2);
	if(status==0)
	{
		System.out.println("Its a palindrome");
	}
	else
	{
		System.out.println("Its not a palindrome");
	}
  }
}
