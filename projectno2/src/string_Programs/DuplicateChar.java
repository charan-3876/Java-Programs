package string_Programs;
import java.util.Scanner;
/*remove duplicates from string*/
public class DuplicateChar
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the String: ");
	String s1=scan.next();
	String s2="";
	for(int i=0;i<=s1.length()-1;i++)
	{
		char ch=s1.charAt(i);
		int status=s2.indexOf(ch);
		if(status==-1)
		{
			s2=s2+ch;
		}
	}
	System.out.println("Given string: "+s1);
	System.out.println("String without duplicate: "+s2);
  }
}
