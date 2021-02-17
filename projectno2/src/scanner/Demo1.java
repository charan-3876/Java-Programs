package scanner;
import java.util.Scanner;
public class Demo1 
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter integer data...");
	int i=scan.nextInt();
	System.out.println("Given number is..."+i);
	System.out.println("Enter string data...");
	String s=scan.next();
	System.out.println("Given string is:"+s);
  }
}
