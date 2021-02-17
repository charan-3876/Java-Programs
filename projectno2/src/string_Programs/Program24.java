package string_Programs;
import java.util.Scanner;
public class Program24
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a sentence: ");
	String s1=scan.nextLine();
	String[] sArr=s1.split(" ");
	String finalString=reverse(sArr[0]);
	for(int i=1;i<=sArr.length-1;i++)
	{
		String tempString=reverse(sArr[i]);
		finalString=finalString+" "+tempString;
	}
	System.out.println("Given sentence: "+s1);
	System.out.println("Reversed sentence: "+finalString);
  }

  public static String reverse(String s1)
  {
	String s2="";
	for(int i=s1.length()-1;i>=0;i--)
	{
		char ch=s1.charAt(i);
		s2=s2+ch;
	}
	return s2;
  }
}