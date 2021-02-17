package string_Programs;
import java.util.Scanner;
/*finding the length of the string without length()*/
public class Program28 
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the string: ");
	String s1=scan.next();
	int count=0;
	int i=0;
	while(true)
	{
		try
		{
			s1.charAt(i);
			i++;
			count++;
		}
		catch(StringIndexOutOfBoundsException rv)
		{
			break;
		}
	}
	System.out.println("count is: "+count);
  }
}
