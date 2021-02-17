package string_Programs;
import java.util.Scanner;
public class Program14 
{
 public static void main(String[] args) 
 {
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter the string: ");
  String s1=scan.next();
  char [] c=s1.toCharArray();
  String s2="";
  for(int i=c.length-1;i>=0;i--)
  {
	 s2=s2+c[i];
  }
  System.out.println("Given string is: "+s1);
  System.out.println("Reverse string is: "+s2);
 }
}
