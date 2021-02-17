package string_Programs;
/*counting digits in a string*/
import java.util.Scanner;
public class Program15
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the string: ");
	String s1=scan.next();
	int count=0;
	
	for(int i=0;i<=s1.length()-1;i++)
	{
		char ch=s1.charAt(i);
		Character.isDigit(ch);
		if(Character.isDigit(ch))
		{
			count++;
		}
	}
	System.out.println("The count of the digits: "+count);
  }
}
