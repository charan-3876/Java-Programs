package string_Programs;
import java.util.Scanner;
public class StringToInt 
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a string: ");
	String s1=scan.next();
	int count=0;
	for(int i=0;i<=s1.length()-1;i++)
	{
		char ch=s1.charAt(i);
		if(Character.isDigit(ch))
		{
			count++;
		}
	}
	if(count==s1.length())
	{
		int k=Integer.parseInt(s1);
		System.out.println("Entered string contains a proper Integer");
		System.out.println("Integer value is: "+k);
	}
	else
	{
		System.out.println("Entered string does not contain proper Integer");
		System.out.println("Given string is: "+s1);
	}
  }
}
