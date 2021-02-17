package string_Programs;
import java.util.Scanner;
public class CountOfEachLetter 
{
  public static void main(String[] args)
  {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a String: ");
	String s1=scan.next();
	String s2="";
	for(int i=0;i<=s1.length()-1;i++)
	{
		char ch=s1.charAt(i);
		int index=s2.indexOf(ch);
		if(index==-1)
		{
			s2=s2+ch;
			
		}
	}
	for(int i=0;i<=s2.length()-1;i++)
	{
		int count=0;
		char c1=s2.charAt(i);
		for(int j=0;j<=s1.length()-1;j++)
		{
			char c2=s1.charAt(j);
			if(c1==c2)
			{
				count++;
			}
		}
		System.out.println(c1+" count is "+count);
	}
  }
}
    