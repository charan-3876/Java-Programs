package string_Programs;
import java.util.Scanner;
public class Program13
{
 public static void main(String[] args) 
 {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the string: ");
	String s1=scan.next();
	char [] c=new char[s1.length()];
	String s2="";
	for(int i=s1.length()-1;i>=0;i--)
	{
		char ch=s1.charAt(i);
		s2=s2+ch;
	}
	System.out.println(s2);
 }
}
