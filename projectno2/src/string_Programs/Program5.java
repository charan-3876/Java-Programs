package string_Programs;
import java.util.Scanner;
public class Program5 
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string 1: ");
		String s1=scan.next();
		System.out.println("Enter string 2: ");
		String s2=scan.next();
		if(s1.equals(s2))
		{
			System.out.println("matched");
		}
		else
		{
			System.out.println("not matched");
		}
	}
}

