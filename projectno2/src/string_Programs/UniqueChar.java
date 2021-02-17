package string_Programs;
import java.util.Scanner;
public class UniqueChar 
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the string: ");
	String s1=scan.next();
	String s2="";
	for(int i=0;i<=s1.length()-1;i++)
	{
		char ch=s1.charAt(i);
		int count=0;
		for(int j=0;j<=s1.length()-1;j++)
		{
			if(ch==s1.charAt(j))
			{
				count++;
			}
		}
		if(count==1)
		{
			s2=s2+ch;
		}
	}
	System.out.println("Given string is: "+s1);
	System.out.println("Unique letters are:  "+s2);
  }
}
