package string_Programs;
import java.util.Scanner;
public class Program10 
{
  public static void main(String[] args) 
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter a string: ");
	  String s1=scan.nextLine();
	  char [] c=new char[s1.length()];
	  for(int i=0;i<=s1.length()-1;i++)
	  {
		char ch=s1.charAt(i);
		c[i]=ch;
	  }
	  System.out.println("Given string is: ");
	  System.out.println("Character array elements are: ");
	  for(char k:c)
	  {
		  System.out.println(k);
	  }
  }
}
