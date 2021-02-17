package string_Programs;
import java.util.Scanner;
public class Program1
{
  public static void main(String[] args)
  {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter int data:");
	int a=scan.nextInt();
	System.out.println("Enter double data:");
	double b=scan.nextDouble();
	System.out.println("Enter string data:");
	String c=scan.next();
	System.out.println("Enter boolean data:");
	boolean d=scan.nextBoolean();
	System.out.println("Enter char data:");
	char ch=scan.next().charAt(0);
	System.out.println("Entered data's are:");
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(ch);
  }
}
