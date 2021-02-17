package string_Programs;
import java.util.Scanner;
public class IntToString 
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the integer: ");
	int i=scan.nextInt();
	System.out.println("Enter the integer: ");
	int j=scan.nextInt();
	String s1=Integer.toString(i);
	String s2=Integer.toString(j);
	System.out.println(s1+s2);
  }
}
