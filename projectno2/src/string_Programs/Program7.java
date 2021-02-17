package string_Programs;
import java.util.Scanner;
public class Program7
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the string: ");
	String s1=scan.next();
	System.out.println("Enter the character: ");
	char ch=scan.next().charAt(0);
	int count=0;
	for(int i=0;i<=s1.length()-1;i++)
	{
		if(ch==s1.charAt(i))
		{
			count++;
		}
	}
	if(count>0)
	{
		System.out.println("character is present");
	}
	else
	{
		System.out.println("character is not present");
	}
  }
}
