package string_Programs;
import java.util.Scanner;
public class PatternProgram 
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a string: ");
	String s1=scan.next();
	int numOfChars=-1;
	for(int i=1;i<=s1.length();i++)
	{
		numOfChars++;
		for (int j = 0; j<=numOfChars; j++) 
		{
			char ch=s1.charAt(j);
			System.out.print(ch);
		}
		System.out.println();
	}
  }
}
