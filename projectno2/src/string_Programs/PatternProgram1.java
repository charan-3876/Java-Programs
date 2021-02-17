package string_Programs;
import java.util.Scanner;
/*       D
 *      DEV
 *     DEVEL
 *    DEVELOP
 *   DEVELOPER*/
public class PatternProgram1 
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a string: ");
	String s1=scan.next();
	int numOfChars=-1;
	int numOfSpaces=5;
	for(int i=0;i<=s1.length()-1;i++)
	{
		numOfChars+=2;
		numOfSpaces--;
		for(int j=0;j<=numOfSpaces;j++)
		{
			System.out.print(" ");
		}
		for(int k=0;k<=numOfChars;k++)
		{
			char ch=s1.charAt(k);
			System.out.print(ch);
		}
		System.out.println();
	}
  }
}
