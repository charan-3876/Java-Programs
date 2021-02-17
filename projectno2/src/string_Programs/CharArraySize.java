package string_Programs;
import java.util.Scanner;
public class CharArraySize 
{
  public static void main(String[] args) 
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter the char array size: ");
	  int size=scan.nextInt();
	  System.out.println("Enter "+size+" elements: ");
	  char c1[]=new char[size];
	   for(int i=0;i<=c1.length-1;i++)
	    {
	    	c1[i]=scan.next().charAt(0);
	    }
	    for(char k:c1)
	    {
	    	System.out.println(k);
	    }
  }
}
