package string_Programs;
import java.util.Scanner;
public class Program16 
{
 public static void main(String[] args) 
 {
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter the string: ");
  String s1=scan.next();
  int sum=0;
  for(int i=0;i<=s1.length()-1;i++)
  {
	  char ch=s1.charAt(i);
	  if(Character.isDigit(ch))
	  {
		  int a=Character.getNumericValue(ch);//String tempString=ch+"";
		  sum=a+sum;//int k=Integer.parseInt(tempString);sum=sum+k;
	  }
  }
  System.out.println("The string is: "+s1);
  System.out.println("The sum of the digits in the given string is: "+sum);
 }
}
