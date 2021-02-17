package string_Programs;
import java.util.Scanner;
public class Program12 
{
 public static void main(String[] args) 
 {
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter a string: ");
  String s1=scan.next();
  char c[]=s1.toCharArray();
  System.out.println("The reverse string is: ");
  for(int i=s1.length()-1;i>=0;i--)
  {
	  System.out.print(c[i]);
  }
 }
}
