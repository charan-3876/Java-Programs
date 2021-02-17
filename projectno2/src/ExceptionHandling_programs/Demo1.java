package ExceptionHandling_programs;
import java.util.Scanner;
public class Demo1 
{
  public static void main(String[] args)
  {
	System.out.println("Enter the string:");
	Scanner scan=new Scanner(System.in);
	String s1=scan.next();
	int length=s1.length();
	System.out.println("String length is: "+length);
	System.out.println("Enter index value:");
	int index=scan.nextInt();
	char ch;
	while(true)
	{
		try
		{
			ch=s1.charAt(index);
			System.out.println(ch);
			break;
		}
		catch(StringIndexOutOfBoundsException r)
		{
			System.out.println("Enter indexes between 0 to "+(length-1));
			System.out.println("Reenter index:");
			index=scan.nextInt();
		}
	}
  }
}
