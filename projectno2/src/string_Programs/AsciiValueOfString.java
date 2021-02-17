package string_Programs;
import java.util.Scanner;
public class AsciiValueOfString 
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the string: ");
	String s1=scan.next();
	for(int i=0;i<=s1.length()-1;i++)
	{
		char ch=s1.charAt(i);
		System.out.println(ch+" ascii value: "+(int)ch);
	}
  }
}
