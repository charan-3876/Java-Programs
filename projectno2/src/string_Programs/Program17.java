package string_Programs;
import java.util.Scanner;
public class Program17 
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the 1st string: ");
	String s1=scan.next();
	System.out.println("Enter the 2nd string: ");
	String s2=scan.next();
	int status=s1.compareTo(s2);
	if(status>0)
	{
		System.out.println(s1+" is greater than "+s2);
	}
	else if(status<0)
	{
		System.out.println(s1+" is lesser than "+s2);
	}
	else
	{
		System.out.println(s1+" is equal to "+s2);
	}
  }
}
