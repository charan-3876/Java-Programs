package string_Programs;
import java.util.Scanner;
/*removing spaces in the given string*/
public class Program20
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a string with spaces: ");
	String s1=scan.next();
	String s2=s1.trim();
	/*for(int i=0;i<=s1.length()-1;i++)
	{
		char ch=s1.charAt(i);
		if(ch!=' ')
		{
			s2=s2+ch;
		}
	}*/
	System.out.println("The string without spaces is: "+s2);
  }
}
