package string_Programs;
import java.util.Scanner;
public class Program3
{
  public static void main(String[] args) 
  {
	  int count=0;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the string:");
	String s1=scan.next();
	for(int i=1;i<=s1.length()-1;i++)
	{
      char ch=s1.charAt(i);
      if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
      {
    	  count++;
      }
	}
	System.out.println("No.of vowels in given string:"+count);
	
  }
}
